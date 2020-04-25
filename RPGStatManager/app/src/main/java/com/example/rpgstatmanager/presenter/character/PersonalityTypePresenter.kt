package com.example.rpgstatmanager.presenter.character

import com.example.rpgstatmanager.interactor.data.character.EmotionModifierInteractor
import com.example.rpgstatmanager.interactor.data.character.PersonalityTypeInteractor
import com.example.rpgstatmanager.model.character.EmotionModifier
import com.example.rpgstatmanager.model.character.PersonalityType
import com.example.rpgstatmanager.presenter.A_Presenter
import com.example.rpgstatmanager.screen.character.PersonalityTypeScreen

object PersonalityTypePresenter : A_Presenter<PersonalityTypeScreen>() {

    val emotionModifierBase =
        mapOf(
            Pair("anger",       mapOf( Pair("intensity", 1), Pair("speed", 1), Pair("control",-1), Pair("sense",-1) ) ),
            Pair("fear",        mapOf( Pair("intensity",-1), Pair("speed", 1), Pair("control",-1), Pair("sense", 1) ) ),
            Pair("happiness",   mapOf( Pair("intensity",-1), Pair("speed", 1), Pair("control", 1), Pair("sense",-1) ) ),
            Pair("sadness",     mapOf( Pair("intensity",-1), Pair("speed",-1), Pair("control", 1), Pair("sense", 1) ) ),
            Pair("surprise",    mapOf( Pair("intensity", 1), Pair("speed",-1), Pair("control",-1), Pair("sense", 1) ) ),
            Pair("disgust",     mapOf( Pair("intensity", 1), Pair("speed",-1), Pair("control", 1), Pair("sense",-1) ) )
        )

    fun get() = PersonalityTypeInteractor.get()
    fun set(persionality:PersonalityType){
        PersonalityTypeInteractor.save(persionality)
        val eml = EmotionModifierInteractor.list()

        for(emotion in emotionModifierBase.keys){
            EmotionModifierPresenter.turnOff(emotion)
            val emotionLine = eml.find { it.name.compareTo(emotion)==0 }
                ?: throw Error("No emotion with given name")
            val newValues = mutableMapOf<String,Int>()
            emotionModifierBase[emotion]?.let{ line ->
                for (stat in line.keys){
                    line[stat]?.let{modifier ->
                        newValues[stat]= modifier*(persionality.feeling/3)
                    } ?: throw Error("No stat with given name")
                }
            } ?: throw Error("No emotion with given name")
            EmotionModifierInteractor.save(
                EmotionModifier( emotionLine.id,emotionLine.name, newValues,emotionLine.trigger )
            )
        }
    }
}
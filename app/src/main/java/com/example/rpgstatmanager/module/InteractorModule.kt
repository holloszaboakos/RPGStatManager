package com.example.rpgstatmanager.module

import android.content.Context
import com.example.rpgstatmanager.interactor.api.AuthInteractor
import com.example.rpgstatmanager.interactor.data.AdventureInteractor
import com.example.rpgstatmanager.interactor.data.CharacterInteractor
import com.example.rpgstatmanager.interactor.data.character.*
import com.example.rpgstatmanager.swagger.client.apis.DataApi
import com.example.rpgstatmanager.swagger.client.apis.TokenApi
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class InteractorModule(private val context: Context) {
    @Provides
    @Singleton
    fun provideAdventureInteractor(dataApi:DataApi)
            = AdventureInteractor(dataApi)
    @Provides
    @Singleton
    fun provideCharacterInteractor(dataApi:DataApi)
            = CharacterInteractor(dataApi)

    @Provides
    @Singleton
    fun provideAbilityInteractor(dataApi:DataApi)
            = AbilityInteractor(dataApi)
    @Provides
    @Singleton
    fun provideEmotionModifierInteractor(dataApi:DataApi)
            = EmotionModifierInteractor(dataApi)
    @Provides
    @Singleton
    fun provideMoveInteractor(dataApi:DataApi)
            = MoveInteractor(dataApi)
    @Provides
    @Singleton
    fun provideMoveTypeInteractor(dataApi:DataApi)
            = MoveTypeInteractor(dataApi)
    @Provides
    @Singleton
    fun providePersonalityTypeInteractor(dataApi:DataApi)
            = PersonalityTypeInteractor(dataApi)
    @Provides
    @Singleton
    fun provideRaceInteractor(dataApi:DataApi)
            = RaceInteractor(dataApi)
    @Provides
    @Singleton
    fun provideStatInteractor(dataApi:DataApi)
            = StatInteractor(dataApi)
    @Provides
    @Singleton
    fun provideToolInteractor(dataApi:DataApi)
            = ToolInteractor(dataApi)
    @Provides
    @Singleton
    fun provideWeaponInteractor(dataApi:DataApi)
            = WeaponInteractor(dataApi)

    @Provides
    @Singleton
    fun provideAuthInteractor(tokenApi: TokenApi)
            = AuthInteractor(tokenApi)
}
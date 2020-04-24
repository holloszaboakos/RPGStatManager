package com.example.rpgstatmanager.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.rpgstatmanager.R
import com.example.rpgstatmanager.presenter.AdventureCreatorPresenter
import com.example.rpgstatmanager.screen.AdventureCreatorScreen

class AdventureCreatorActivity : AppCompatActivity(), AdventureCreatorScreen {
    val  presenter = AdventureCreatorPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_adventure_creator)
    }

    override fun onStart() {
        super.onStart()
        presenter.attachScreen(this)
    }
    override fun onStop() {
        super.onStop()
        presenter.detachScreen()
    }
}
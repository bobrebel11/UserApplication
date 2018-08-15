package com.example.rebelbob11.userapplication

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_user.*

class UserActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user)

        val userIntent: Intent = intent
        var name:String
        var pass:String

        name = userIntent.getStringExtra("UNAME")
        pass = userIntent.getStringExtra("PWD")


        textName.text=name
        textPass.text=pass
    }
}

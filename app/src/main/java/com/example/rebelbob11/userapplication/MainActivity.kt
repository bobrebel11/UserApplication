package com.example.rebelbob11.userapplication

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var email:String
    private lateinit var password:String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_login.setOnClickListener{

            email = text_uname.text.toString()
            password = text_pwd.text.toString()

            validateUser(email, password)

        }


        text_signup.setOnClickListener {

            val signupIntent = Intent(applicationContext,SignUpActivity::class.java)
            startActivity(signupIntent)
            overridePendingTransition(R.anim.slide_in_from_right,R.anim.slide_out_to_left)
        }
    }



    private fun validateUser(email: String, password: String) {


        if (email.isNullOrEmpty()){
            text_uname.setError("Email cannot be empty")
            text_uname.requestFocus()
            return
        }

        if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()){

            text_uname.setError("Enter Valid Email")
            text_uname.requestFocus()
            return

        }

        if (password.isNullOrEmpty()){
            text_pwd.setError("Password cannot be empty")
            text_pwd.requestFocus()
            return
        }

        if (password.length<6){
            text_pwd.setError("Password too short")
            text_pwd.requestFocus()
            return

        }

    }
}

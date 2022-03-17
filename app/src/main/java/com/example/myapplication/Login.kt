package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.Model.RestAPI
import kotlinx.android.synthetic.main.activity_login.*
import org.jetbrains.anko.activityUiThread
import org.jetbrains.anko.doAsync

class Login : AppCompatActivity() {

    var restAPI = RestAPI()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        btn_login.setOnClickListener {

            restAPI.setPostLogin(email.toString(),password.toString())

        }


    }
}
package com.example.move

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var et_user_name = findViewById(R.id.editTextTextEmailAddress) as EditText
        var et_password = findViewById(R.id.editTextTextPassword) as EditText
        var btn_reset = findViewById(R.id.button5) as Button
        var btn_submit = findViewById(R.id.button) as Button

        btn_reset.setOnClickListener {

            et_user_name.setText("")
            et_password.setText("")
        }

        // set on-click listener
        btn_submit.setOnClickListener {
            val user_name = et_user_name.text;
            val password = et_password.text;
            Toast.makeText(this@MainActivity, user_name, Toast.LENGTH_LONG).show()


        }
    }
}


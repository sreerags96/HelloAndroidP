package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ButtonOne.setOnClickListener {
            Toast.makeText(
                this,
                "your username:" + TxtFirstName.text + "Your Password:" + TxtPassword.text,
                Toast.LENGTH_LONG
            ).show()
        }
    }

}

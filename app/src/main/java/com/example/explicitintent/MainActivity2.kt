package com.example.explicitintent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val name = intent.getStringExtra("Name")
        val age = intent.getIntExtra("Age" , 0)
        val student = intent.getBooleanExtra("Student" , true)

        textView.text = " Name = $name " +
                " Age = $age " + " Is student = $student "

    }
}
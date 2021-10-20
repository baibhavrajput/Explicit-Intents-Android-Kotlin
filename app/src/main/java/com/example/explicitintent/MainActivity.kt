
package com.example.explicitintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {

            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra("Name", "Baibhav")
            intent.putExtra("Age", 21)
            intent.putExtra("Student", false)

            startActivity(intent)
        }
    }

}
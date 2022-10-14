package id.kotlin.task1hamzah

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var btn_happy : Button
    lateinit var btn_sad : Button
    lateinit var btn_mad : Button
    lateinit var et_name : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_happy = findViewById(R.id.happy)
        btn_sad = findViewById(R.id.sad)
        btn_mad = findViewById(R.id.mad)
        et_name = findViewById(R.id.et_name)

        btn_sad.setOnClickListener{
            if (et_name.text.length<1) {
                Toast.makeText(this, "Please Input Your Name First!", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            Toast.makeText(this, "Hi " + et_name.text + " You are sad today", Toast.LENGTH_SHORT).show()
        }

        btn_mad.setOnClickListener{
            if (et_name.text.length<1) {
                Toast.makeText(this, "Please Input Your Name First!", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            Toast.makeText(this, "Hi " + et_name.text + " You are mad today", Toast.LENGTH_SHORT).show()
        }

        btn_happy.setOnClickListener{
            if (et_name.text.length<1) {
                Toast.makeText(this, "Please Input Your Name First!", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            Toast.makeText(this, "Hi " + et_name.text + " You are happy today", Toast.LENGTH_SHORT).show()
        }
    }
}
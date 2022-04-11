package com.example.securitycheck

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.view.WindowManager
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_home.*

class Home_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_home)
        supportActionBar?.hide()
        imageView14.setOnClickListener{
            Toast.makeText(this,"查看点检表", Toast.LENGTH_SHORT).show()
            val intent= Intent(this,Check_Table_Activity::class.java)
            startActivity(intent)

        }

    }
}
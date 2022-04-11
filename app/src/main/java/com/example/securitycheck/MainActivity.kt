package com.example.securitycheck

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        getSupportActionBar()?.hide()
        getWindow().setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN
            , WindowManager.LayoutParams.FLAG_FULLSCREEN)
        setContentView(R.layout.activity_main)
//        val button: Button =findViewById(R.id.login_button)
//        button.setOnClickListener{
//            Toast.makeText(this,"登录成功",Toast.LENGTH_SHORT).show()
//        }


        login_button.setOnClickListener{
            Toast.makeText(this,"登录成功",Toast.LENGTH_SHORT).show()
            val intent= Intent(this,Home_Activity::class.java)
            startActivity(intent)
        }
    }
}
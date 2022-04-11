package com.example.securitycheck

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.*
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_check_table.*
import kotlinx.android.synthetic.main.item.*
import kotlinx.android.synthetic.main.item.view.*

class Check_Table_Activity : AppCompatActivity(){
    //private val data= listOf("1","2","3")
    private val questionList = ArrayList<Item>()

    override fun onCreate(savedInstanceState: Bundle?) {
        getSupportActionBar()?.hide()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_check_table)
        initQuestions() // 初始化数据
        val layoutManager = LinearLayoutManager(this)
        recyclerView.layoutManager = layoutManager
        val adapter = ItemAdapter(questionList)
        recyclerView.adapter = adapter
        //灭火器
        val layoutManager2 = LinearLayoutManager(this)
        recyclerView2.layoutManager = layoutManager2
        val adapter2 = ItemAdapter(questionList)
        recyclerView2.adapter = adapter2

    }

    private fun initQuestions() {

        questionList.add(Item("1", true))
        questionList.add(Item("2", true))
        questionList.add(Item("3", true))
        questionList.add(Item("4", true))
        questionList.add(Item("5", true))
        questionList.add(Item("6", true))
        questionList.add(Item("7", true))
        questionList.add(Item("8", true))
        questionList.add(Item("9", true))
        questionList.add(Item("10", true))
        questionList.add(Item("11", true))
        questionList.add(Item("12", true))
        questionList.add(Item("13", true))
        questionList.add(Item("14", true))
        questionList.add(Item("15", true))
        questionList.add(Item("16", true))

    }
}



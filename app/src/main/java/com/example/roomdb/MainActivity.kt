package com.example.roomdb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.room.Room
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    val db by lazy{
        Room.databaseBuilder(this,AppDataBase::class.java,"User.db").allowMainThreadQueries().build()
        //call database in mainthread we use allowmainthreadQueries
        //but not in heavy task dont use it

        //if we change schema

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn1=findViewById<Button>(R.id.button);
        val btn2=findViewById<Button>(R.id.button2);

        btn1.setOnClickListener{

            db.userDao().insert(User("Avdhendra","9305509034","Adityapuram",20))

        }


        btn2.setOnClickListener{

            val list=db.userDao().getAllUser()

            if(list.isNotEmpty())

            {

                with(list[0]){

        val text1=findViewById<TextView>(R.id.textView)
        val text2=findViewById<TextView>(R.id.textView2)
        val text3=findViewById<TextView>(R.id.textView3)
        val text4=findViewById<TextView>(R.id.textView4)

        text1.text=name
         text2.text=age.toString()
         text3.text=address
         text4.text=num


                }

            }

        }
    }

}
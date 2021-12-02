package com.example.roomdb

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity //it internally convert in native code for sql
data class User (
    val name:String,
    val num:String,
    val address:String,
    val age:Int,
    @PrimaryKey(autoGenerate = true) //we dont have to add in the sql additional
    val id:Long=0L //not pass the value
        )

//Dao is data access object
package com.example.roomdb

import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
//when ever we change room database schema
/**
  we have to change the version

 */
/**
 all entities class
 */
@Database(entities = [User::class], version = 1)
abstract class AppDataBase:RoomDatabase() {

abstract  fun userDao():UserDao

}
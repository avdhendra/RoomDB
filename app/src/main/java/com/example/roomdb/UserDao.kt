package com.example.roomdb

import androidx.room.*
/**
 Dao is interface u provide all the query which u run while making the database


 */
@Dao
interface UserDao {
   /*
    add functionality to the annotation
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insert(user:User)*/
    @Insert
    fun insert(User:User)
    @Insert
    fun insertAll(list:List<User>)
@Delete
fun delete(user:User)

@Query("SELECT* FROM User")
fun getAllUser():List<User>

@Query("SELECT *FROM User Where age>=:age")
fun getUserwithAge(age:Int):List<User>
}
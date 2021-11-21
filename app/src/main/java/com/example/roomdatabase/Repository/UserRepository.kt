package com.example.roomdatabase.Repository

import androidx.lifecycle.LiveData
import com.example.roomdatabase.data.UserDao
import com.example.roomdatabase.model.User

class UserRepository(private val userDao: UserDao) {
    val readAllData : LiveData<List<User>> = userDao.readAllData()

    fun addUser(user : User){
        userDao.addUser(user)
    }

    fun updateUser(user : User){
        userDao.updateUser(user)
    }
}
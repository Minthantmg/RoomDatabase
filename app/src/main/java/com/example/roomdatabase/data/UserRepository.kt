package com.example.roomdatabase.data

import androidx.lifecycle.LiveData
import java.net.UnknownServiceException

class UserRepository(private val userDao: UserDao) {
    val readAllData : LiveData<List<User>> = userDao.readAllData()

    fun addUser(user : User){
        userDao.addUser(user)
    }
}
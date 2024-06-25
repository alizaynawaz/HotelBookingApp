package repository

import dao.UserDao
import entities.User

// UserRepository.kt
class UserRepository(private val userDao: UserDao) {
    suspend fun registerUser(user: User): Long {
        return userDao.insert(user)
    }

    suspend fun findUserByEmail(email: String): User? {
        return userDao.findByEmail(email)
    }
}




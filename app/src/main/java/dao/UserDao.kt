package dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import entities.User

// UserDao.kt
@Dao
interface UserDao {
    @Insert
    suspend fun insert(user: User): Long

    @Query("SELECT * FROM users WHERE email = :email")
    suspend fun findByEmail(email: String): User?
}





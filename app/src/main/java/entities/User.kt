
package entities

import androidx.room.Entity
import androidx.room.PrimaryKey

// User.kt
@Entity(tableName = "users")
data class User(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    val username: String,
    val email: String,
    val password: String
)


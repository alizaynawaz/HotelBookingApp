package viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import entities.User
import repository.UserRepository
import kotlinx.coroutines.launch

// UserViewModel.kt
class UserViewModel(private val repository: UserRepository) : ViewModel() {
    suspend fun registerUser(user: User): Long {
        return repository.registerUser(user)
    }

    suspend fun findUserByEmail(email: String): User? {
        return repository.findUserByEmail(email)
    }
}



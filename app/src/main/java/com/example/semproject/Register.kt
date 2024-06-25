package com.example.semproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser

class Register : AppCompatActivity() {

    private lateinit var auth: FirebaseAuth
    private lateinit var editTextEmail: EditText
    private lateinit var editTextPassword: EditText
    private lateinit var btnReg: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        auth = FirebaseAuth.getInstance()

        editTextEmail = findViewById(R.id.email)
        editTextPassword = findViewById(R.id.password)
        btnReg = findViewById(R.id.btn_reg)

        btnReg.setOnClickListener {
            val email = editTextEmail.text.toString()
            val password = editTextPassword.text.toString()

            if (email.isNotEmpty() && password.isNotEmpty()) {
                registerUser(email, password)
            } else {
                Toast.makeText(this, "Please fill in all fields.", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun registerUser(email: String, password: String) {
        auth.createUserWithEmailAndPassword(email, password)
            .addOnCompleteListener(this) { task ->
                if (task.isSuccessful) {
                    // Registration success, update UI with the signed-in user's information
                    val user: FirebaseUser? = auth.currentUser
                    Toast.makeText(this, "Registration successful.", Toast.LENGTH_SHORT).show()

                    // Navigate to Login activity
                    val intent = Intent(this, Login::class.java)
                    startActivity(intent)

                    // Optional: Clear input fields after successful registration
                    editTextEmail.text.clear()
                    editTextPassword.text.clear()

                    // Finish the Register activity (optional)
                    // finish()
                } else {
                    // If registration fails, display a message to the user.
                    Toast.makeText(baseContext, "Registration failed: ${task.exception?.message}", Toast.LENGTH_SHORT).show()
                }
            }
    }

}












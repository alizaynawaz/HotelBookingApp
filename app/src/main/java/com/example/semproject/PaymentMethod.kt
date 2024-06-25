package com.example.semproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.semproject.databinding.ActivityConfirmOrderBinding
import com.example.semproject.databinding.ActivityPaymentMethodBinding

class PaymentMethod : AppCompatActivity() {
    private lateinit var binding: ActivityPaymentMethodBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hotel_details)
        binding = ActivityPaymentMethodBinding.inflate(layoutInflater)
        setContentView(binding.root)  // Correctly set the content view

        binding.finishOrder.setOnClickListener {
            val intent = Intent(this, OrderSuccessfull::class.java)
            startActivity(intent)
        }
    }
}
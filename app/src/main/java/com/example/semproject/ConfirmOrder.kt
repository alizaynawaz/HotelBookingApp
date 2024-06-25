package com.example.semproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.semproject.databinding.ActivityConfirmOrderBinding
import com.example.semproject.databinding.ActivityHotelDetailsBinding

class ConfirmOrder : AppCompatActivity() {
    private lateinit var binding: ActivityConfirmOrderBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hotel_details)
        binding = ActivityConfirmOrderBinding.inflate(layoutInflater)
        setContentView(binding.root)  // Correctly set the content view

        binding.ConfirmOrder.setOnClickListener {
            val intent = Intent(this, PaymentMethod::class.java)
            startActivity(intent)
        }
    }
}
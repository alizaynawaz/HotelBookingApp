package com.example.semproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.semproject.databinding.ActivityCarBookingBinding
import com.example.semproject.databinding.ActivityPaymentMethodBinding

class CarBooking : AppCompatActivity() {
    private lateinit var binding: ActivityCarBookingBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hotel_details)
        binding = ActivityCarBookingBinding.inflate(layoutInflater)
        setContentView(binding.root)  // Correctly set the content view

        binding.btnCarBooked.setOnClickListener {
            val intent = Intent(this, CarBookingDetails::class.java)
            startActivity(intent)
        }
    }
}
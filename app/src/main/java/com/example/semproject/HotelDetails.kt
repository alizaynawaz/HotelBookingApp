package com.example.semproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.semproject.databinding.ActivityHotelDetailsBinding
import com.example.semproject.databinding.ActivityHotelListBinding

class HotelDetails : AppCompatActivity() {

    private lateinit var binding: ActivityHotelDetailsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hotel_details)
        binding = ActivityHotelDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)  // Correctly set the content view

        binding.bookNow.setOnClickListener {
            val intent = Intent(this, ConfirmOrder::class.java)
            startActivity(intent)
        }
    }
}

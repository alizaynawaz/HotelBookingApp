package com.example.semproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.semproject.databinding.ActivityHotelListBinding
import com.example.semproject.databinding.ActivityRegisterBinding

class HotelList : AppCompatActivity() {
    private lateinit var binding: ActivityHotelListBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHotelListBinding.inflate(layoutInflater)
        setContentView(binding.root)  // Correctly set the content view

        binding.horizontalCardView.setOnClickListener {
            val intent = Intent(this, HotelDetails::class.java)
            startActivity(intent)


            }
        }
    }

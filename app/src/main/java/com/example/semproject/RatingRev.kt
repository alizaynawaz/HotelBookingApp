package com.example.semproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.semproject.databinding.ActivityPaymentMethodBinding
import com.example.semproject.databinding.ActivityRatingRevBinding

class RatingRev : AppCompatActivity() {
    private lateinit var binding: ActivityRatingRevBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hotel_details)
        binding = ActivityRatingRevBinding.inflate(layoutInflater)
        setContentView(binding.root)  // Correctly set the content view

        binding.btnSubmit.setOnClickListener {
            val intent = Intent(this, MainRateRev::class.java)
            startActivity(intent)
        }
    }
}
package com.example.semproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.semproject.databinding.ActivityRegisterBinding
import com.example.semproject.databinding.ActivitySettingPageBinding

class SettingPage : AppCompatActivity() {
    private lateinit var binding: ActivitySettingPageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySettingPageBinding.inflate(layoutInflater)
        setContentView(binding.root)  // Correctly set the content view

        binding.btnTerms.setOnClickListener {
            val intent = Intent(this, TermsCondition::class.java)
            startActivity(intent)
        }
        binding.btnPrivacy.setOnClickListener {
            val intent = Intent(this, PrivacyPolicy::class.java)
            startActivity(intent)
        }

        binding.btnRate.setOnClickListener {
            val intent = Intent(this, RatingRev::class.java)
            startActivity(intent)
        }
        binding.btnLogout.setOnClickListener {
            val intent = Intent(this, Login::class.java)
            startActivity(intent)
        }
        binding.btnFaq.setOnClickListener {
            val intent = Intent(this, FAQ::class.java)
            startActivity(intent)
        }
    }
}
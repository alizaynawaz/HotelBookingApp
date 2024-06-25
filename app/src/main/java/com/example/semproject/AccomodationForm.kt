package com.example.semproject


import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.semproject.databinding.ActivityAccomodationFormBinding


class AccomodationForm : AppCompatActivity() {

    private lateinit var binding: ActivityAccomodationFormBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAccomodationFormBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Set up bottom navigation
        binding.bnView.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.Car_booking -> {
                    // Navigate to CarBooking activity
                    startActivity(Intent(this, CarBooking::class.java))
                    true
                }
                R.id.profile -> {
                    // Navigate to SettingPage activity
                    startActivity(Intent(this, MyProfile::class.java))
                    true
                }
                R.id.Car_washing -> {
                    // Navigate to SettingPage activity
                    startActivity(Intent(this, CarWashing::class.java))
                    true
                }
             R.id.nav_bottom_settings -> {
                    // Navigate to SettingPage activity
                    startActivity(Intent(this, SettingPage::class.java))
                    true
                }
                else -> false
            }
        }


        // Access the TextView using View Binding
        val unionIcon: TextView = binding.union

        // Set up a click listener for the unionIcon TextView
        unionIcon.setOnClickListener {
            Toast.makeText(this, "Union icon clicked", Toast.LENGTH_SHORT).show()
        }

        // Set up click listeners for the other EditText fields
        binding.checkinDateTimeEditText.setOnClickListener {
            // Show date/time picker for check-in
            showCheckinDateTimePicker()
        }

        binding.checkoutDateTimeEditText.setOnClickListener {
            // Show date/time picker for check-out
            showCheckoutDateTimePicker()
        }

        binding.numberOfGuestsEditText.setOnClickListener {
            // Show guest options dialog
            showGuestOptions()
        }

        // Set up a click listener for the search button
        binding.searchButton.setOnClickListener {
            // Handle the search action
            val intent = Intent(this, HotelList::class.java)
            startActivity(intent)
            performSearch()
        }

        // Additional setup code...
    }

    private fun showCheckinDateTimePicker() {
        // Implement the logic to show the check-in date/time picker
    }

    private fun showCheckoutDateTimePicker() {
        // Implement the logic to show the check-out date/time picker
    }

    private fun showGuestOptions() {
        // Implement the logic to show the guest options dialog
    }

    private fun performSearch() {
        // Implement the logic to perform the search action
        Toast.makeText(this, "Search button clicked", Toast.LENGTH_SHORT).show()
    }
}






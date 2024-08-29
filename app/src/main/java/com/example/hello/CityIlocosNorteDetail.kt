package com.example.hello

import android.Manifest
import android.content.DialogInterface
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat

class CityIlocosNorteDetail : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_city_ilocos_norte_detail)

        val container: LinearLayout = findViewById(R.id.container)
        val cityName = intent.getStringExtra("CITY_NAME") ?: return
        val message = intent.getStringExtra("MESSAGE") ?: return

        // Add title "Emergency Hotlines"
        val titleTextView = TextView(this)
        titleTextView.text = "Emergency Hotlines"
        titleTextView.textSize = 20f
        titleTextView.setPadding(0, 0, 0, 16)
        container.addView(titleTextView)

        // Add the city name below the "Emergency Hotlines" title
        val cityTextView = TextView(this)
        cityTextView.text = cityName
        cityTextView.textSize = 18f
        cityTextView.setPadding(0, 0, 0, 16)
        container.addView(cityTextView)

        // Split the message into lines
        val lines = message.split("\n")

        for (line in lines) {
            val parts = line.split(":")
            if (parts.size == 2) {
                val description = parts[0].trim()
                val phoneNumbers = parts[1].trim().split(",") // Handle multiple numbers

                for (phoneNumber in phoneNumbers) {
                    val trimmedNumber = phoneNumber.trim()

                    val textView = TextView(this)
                    textView.text = "$description"
                    textView.setPadding(0, 0, 0, 8) // Add some space between items
                    textView.setTextColor(getColor(R.color.phone_number_color)) // Change text color of the number
                    container.addView(textView)

                    val button = Button(this)
                    button.text = "Call"
                    button.setOnClickListener {
                        // Ask for confirmation
                        showConfirmationDialog(description, trimmedNumber)
                    }
                    container.addView(button)
                }
            }
        }
    }

    private fun showConfirmationDialog(description: String, phoneNumber: String) {
        val builder = AlertDialog.Builder(this)
        builder.setMessage("Are you sure you want to call $description?")
            .setPositiveButton("Yes") { _, _ ->
                // Check for permission
                if (ContextCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    // Request permission
                    ActivityCompat.requestPermissions(this, arrayOf(Manifest.permission.CALL_PHONE), 1)
                    intent.putExtra("PHONE_NUMBER", phoneNumber)
                } else {
                    // Permission granted, make the call
                    makeCall(phoneNumber)
                }
            }
            .setNegativeButton("No", null)
            .show()
    }

    private fun makeCall(phoneNumber: String) {
        val callIntent = Intent(Intent.ACTION_CALL)
        callIntent.data = Uri.parse("tel:$phoneNumber")
        startActivity(callIntent)
    }

    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<out String>, grantResults: IntArray) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if (requestCode == 1 && grantResults.isNotEmpty() && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
            // Permission granted, make the call
            val phoneNumber = intent.getStringExtra("PHONE_NUMBER")
            phoneNumber?.let { makeCall(it) }
        }
    }
}

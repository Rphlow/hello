package com.example.hello

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class CityIlocosNorteDetail : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
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
                    textView.text = "$description: $trimmedNumber"
                    textView.setPadding(0, 0, 0, 8) // Add some space between items
                    textView.setTextColor(getColor(R.color.phone_number_color)) // Change text color of the number
                    container.addView(textView)

                    val button = Button(this)
                    button.text = "Call"
                    button.setOnClickListener {
                        val intent = Intent(Intent.ACTION_DIAL)
                        intent.data = Uri.parse("tel:$trimmedNumber")
                        startActivity(intent)
                    }
                    container.addView(button)
                }
            }
        }
    }
}

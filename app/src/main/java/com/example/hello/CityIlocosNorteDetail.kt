package com.example.hello

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView

class CityIlocosNorteDetail : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_city_ilocos_norte_detail)

        val textView: TextView = findViewById(R.id.cityTextView)
        val message = intent.getStringExtra("MESSAGE")

        textView.text = message
    }
}
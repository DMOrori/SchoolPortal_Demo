package com.example.schoolportal

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Find Buttons
        val btnDean = findViewById<Button>(R.id.btnDean)
        val btnFinance = findViewById<Button>(R.id.btnFinance)
        val btnRegister = findViewById<Button>(R.id.btnRegisterMenu)

        // Navigate to Dean Activity
        btnDean.setOnClickListener {
            val intent = Intent(this, DeanActivity::class.java)
            startActivity(intent)
        }

        // Navigate to Finance Activity
        btnFinance.setOnClickListener {
            val intent = Intent(this, FinanceActivity::class.java)
            startActivity(intent)
        }

        // Navigate to Register Activity
        btnRegister.setOnClickListener {
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }
    }
}
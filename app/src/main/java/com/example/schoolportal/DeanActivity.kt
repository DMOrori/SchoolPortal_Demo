package com.example.schoolportal

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class DeanActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_dean)

        // Handle System Bar Padding
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // 1. Initialize the Views using the IDs from your XML
        val etName = findViewById<EditText>(R.id.etStudentName)
        val etID = findViewById<EditText>(R.id.etIDNumber)
        val etReason = findViewById<EditText>(R.id.etReason)
        val btnSubmit = findViewById<Button>(R.id.btnSubmit)

        // 2. Set a Click Listener on the Button
        btnSubmit.setOnClickListener {
            val name = etName.text.toString()
            val idNumber = etID.text.toString()
            val reason = etReason.text.toString()

            // 3. Simple Validation: Check if fields are empty
            if (name.isEmpty() || idNumber.isEmpty()) {
                Toast.makeText(this, "Please fill in all fields", Toast.LENGTH_SHORT).show()
            } else {
                // For a school project, we'll just show a success message for now
                val message = "Report submitted for $name (ID: $idNumber)"
                Toast.makeText(this, message, Toast.LENGTH_LONG).show()

                // Optional: Clear fields after submission
                etName.text.clear()
                etID.text.clear()
                etReason.text.clear()
            }
        }
    }
}
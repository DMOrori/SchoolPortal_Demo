package com.example.schoolportal

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class FinanceActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_finance)

        // Initialize Views
        val etStudentId = findViewById<EditText>(R.id.etStudentFeeId)
        val etAmount = findViewById<EditText>(R.id.etAmount)
        val btnPay = findViewById<Button>(R.id.btnProcessPayment)

        btnPay.setOnClickListener {
            val studentId = etStudentId.text.toString()
            val amount = etAmount.text.toString()

            if (studentId.isNotEmpty() && amount.isNotEmpty()) {
                // Logic for processing (for now, just a Toast)
                Toast.makeText(this, "Processing $amount for Student $studentId", Toast.LENGTH_LONG).show()

                // Clear fields
                etStudentId.text.clear()
                etAmount.text.clear()
            } else {
                Toast.makeText(this, "Please fill in all details", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
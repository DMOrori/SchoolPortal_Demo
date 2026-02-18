package com.example.schoolportal

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val tvHeading = findViewById<TextView>(R.id.tvHeading)
        val etNews = findViewById<EditText>(R.id.etNews)
        val btnPost = findViewById<Button>(R.id.btnPost)

        btnPost.setOnClickListener{
            val news = etNews.text.toString()

            if (news.isNotEmpty()){
                Toast.makeText(this, "News Posted Successfully", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Please fill all the fields", Toast.LENGTH_SHORT).show()
            }
            }

    }
}
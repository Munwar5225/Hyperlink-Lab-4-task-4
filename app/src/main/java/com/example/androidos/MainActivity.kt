package com.example.androidos

import android.annotation.SuppressLint
import android.graphics.Color
import android.os.Bundle
import android.text.method.LinkMovementMethod
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupHyperlink()

        }
    private fun setupHyperlink() {
        val linkTextView = findViewById<TextView>(R.id.web)
        linkTextView.movementMethod = LinkMovementMethod.getInstance()
        linkTextView.setLinkTextColor(Color.BLUE)
    }
    }
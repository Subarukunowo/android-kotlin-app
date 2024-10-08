package com.example.androidkotlinapp

import android.app.Activity
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputLayout
 import com.example.androidkotlinapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding  : ActivityMainBinding
    private lateinit var tvCounter: TextView
    private lateinit var btnAddNumber: Button
    private lateinit var btnResetNumber : Button
    private lateinit var  btnSubstractNumber : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        tvCounter = findViewById(R.id.tvCounter)
        btnAddNumber = findViewById(R.id.btnAddNumber)
        btnResetNumber = findViewById(R.id.btnResetNumber)
        btnSubstractNumber = findViewById(R.id.btnSubstractNumber)
        binding.tvCounter.text = "1"
    }
fun addNumber (v: View){
    val currVal = binding.tvCounter.text.toString().toInt()
    val nextVal = currVal + 1
    binding.tvCounter.text = nextVal.toString()

        }

    fun substractNumber (v: View){
        val currVal = binding.tvCounter.text.toString().toInt()
        val nextVal = currVal - 1
        binding.tvCounter.text = nextVal.toString()
        }
    fun resetNumber (v: View){
        binding.tvCounter.text = "0"
    }
    }

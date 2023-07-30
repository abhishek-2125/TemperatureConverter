package com.example.temperatureconverter

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.service.controls.templates.TemperatureControlTemplate
import android.util.Log
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import com.example.temperatureconverter.databinding.ActivityMainBinding
import kotlin.math.roundToInt

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.button.setOnClickListener {
            val temp = binding.editTextText.text.toString()
            if (temp != ""){
            binding.textView3.text = "Result = " + String.format("%.2f",((binding.editTextText.text.toString().toDouble() * 9 / 5) + 32)) + "°F"
            binding.editTextText.setText("")
            }
        }
        binding.button2.setOnClickListener{
            val temp = binding.editTextText.text.toString()
            if (temp != ""){
            binding.textView3.text = "Result = " + String.format("%.2f",((binding.editTextText.text.toString().toDouble() - 32) * 5 / 9)) + "°C"
            binding.editTextText.setText("")
            }
        }
    }
}
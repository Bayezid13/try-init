package com.example.mytrying

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.mytrying.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding= ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.ShowButton.setOnClickListener {
            Toast.makeText(this@MainActivity,"Clicker", Toast.LENGTH_LONG).show()

            binding.images1.setImageResource(R.drawable.bayezid)


        }



        }
    }

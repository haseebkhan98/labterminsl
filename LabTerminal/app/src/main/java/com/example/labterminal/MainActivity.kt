package com.example.labterminal


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.labterminal.databinding.ActivityMainBinding
import com.example.recyleview.customadapter
import com.example.recyleview.servic
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.new_layout.*
import java.util.zip.Inflater

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        reccyle.layoutManager=LinearLayoutManager(this)
        reccyle.adapter= customadapter()
        binding.btn1.setOnClickListener {
            var i= Intent(this,MainActivity2::class.java)
            startActivity(i)
        }


    }

    }

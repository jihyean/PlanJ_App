package com.example.planj

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.datepicker.MaterialDatePicker
import com.google.android.material.datepicker.MaterialPickerOnPositiveButtonClickListener
import java.text.SimpleDateFormat
import java.util.*
import java.util.Calendar.getInstance
import androidx.recyclerview.widget.LinearLayoutManager as LinearLayoutManager1
import androidx.core.util.Pair
import com.example.planj.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding: ActivityMainBinding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.recycler01.apply {
            adapter = ListAdapter01()
            layoutManager = LinearLayoutManager1(context)
            setHasFixedSize(true)
        }

        binding.btnMaps.setOnClickListener {
            val intent = Intent(this, MapsActivity::class.java)
            startActivity(intent)
        }

        binding.btnPlanlist.setOnClickListener {
            val intent = Intent(this, PlanActivity::class.java)
            startActivity(intent)
        }

        binding.btnmypage.setOnClickListener {
            val intent = Intent(this, MypageActivity::class.java)
            startActivity(intent)
        }

        binding.btncal.setOnClickListener {
            val intent = Intent(this, CalActivity::class.java)
            startActivity(intent)
        }
    }
}
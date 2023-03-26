package com.example.planj

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.planj.databinding.ActivityAddBinding

class AddActivity : AppCompatActivity() {
    private val binding: ActivityAddBinding by lazy { ActivityAddBinding.inflate(layoutInflater) }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

//        var data = intent.getSerializableExtra("name")
//        binding.etplace.text = data.name
    }

}
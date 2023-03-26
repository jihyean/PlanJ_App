package com.example.planj

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.planj.databinding.ActivityPlanBinding

class PlanActivity : AppCompatActivity() {
    private val binding: ActivityPlanBinding by lazy { ActivityPlanBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

    }
}
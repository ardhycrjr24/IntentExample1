package com.example.intentexample1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.intentexample1.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Tombol kembali ke MainActivity
        binding.btnExitActivity.setOnClickListener {
            finish()
        }
    }
}

package com.example.hw_6_3_month_dop

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.hw_6_3_month_dop.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    var imageA = R.drawable.img

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        clickFun()
    }

    private fun clickFun() {
        binding.a.setOnClickListener(View.OnClickListener {
            binding.imagePlayers.setImageResource(R.drawable.img)
        })
        binding.a.setOnLongClickListener(View.OnLongClickListener setOnLongClickListener@{
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra("player", R.drawable.img)
            startActivity(intent)
            return@setOnLongClickListener true
        })
        binding.b.setOnClickListener(View.OnClickListener {
            binding.imagePlayers.setImageResource(R.drawable.img_1)
        })
        binding.b.setOnLongClickListener(View.OnLongClickListener setOnLongClickListener@{
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra("player", R.drawable.img_1)
            startActivity(intent)
            return@setOnLongClickListener true
        })
    }
}


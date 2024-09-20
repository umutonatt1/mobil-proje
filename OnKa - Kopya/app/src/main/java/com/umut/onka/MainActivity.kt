package com.umut.onka

import android.content.Intent
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.umut.onka.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        enableEdgeToEdge()
        supportActionBar?.hide()
        setContentView(binding.root)

val anim= AnimationUtils.loadAnimation(this,R.anim.anim)
        binding.GirisBtn.animation = anim

        val anim1=AnimationUtils.loadAnimation(this,R.anim.anim1)
        binding.Logo1.animation =anim1



        val btn_Gonder =findViewById<Button>(R.id.GirisBtn)
        btn_Gonder.setOnClickListener{
            val intent = Intent(this,HomePageActivity::class.java)
            startActivity(intent)
        }
    }
}
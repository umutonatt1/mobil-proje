package com.umut.onka

import android.content.Intent
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.umut.onka.databinding.ActivityMainBinding


class HomePageActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.homepage)



        val btn_GonderTest=findViewById<Button>(R.id.TestBtn)
        btn_GonderTest.setOnClickListener{
            val intent = Intent(this,TestActivity::class.java)
            startActivity(intent)
        }

        val btn_GonderArticle =findViewById<Button>(R.id.ArticleBtn)
        btn_GonderArticle.setOnClickListener{
            val intent = Intent(this,Article1Activity::class.java)
            startActivity(intent)
        }
        val btn_Gonderhakkimizda=findViewById<Button>(R.id.hakkimizda)
        btn_Gonderhakkimizda.setOnClickListener{
            val intent = Intent(this,hakkimizda::class.java)
            startActivity(intent)

    }
}
}
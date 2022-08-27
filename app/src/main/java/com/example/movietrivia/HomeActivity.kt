package com.example.movietrivia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Debug
import android.util.Log
import com.example.movietrivia.databinding.ActivityHomeBinding
import com.example.movietrivia.models.Question

class HomeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)



        binding.settings.setOnClickListener {
            val intent = Intent(this, SettingActivity::class.java)
            startActivity(intent)

        }

        //if the user clicks on Disney Movies
        binding.btnMovieCat.setOnClickListener {
            val intent = Intent(this, QuestionActivity::class.java)
            intent.putExtra("categoryName", "Disney")
            intent.putExtra("category", "disney")
            startActivity(intent)
        }


        //if the user clicks on Disney Movies
        binding.btnHero.setOnClickListener {
            val intent = Intent(this, QuestionActivity::class.java)
            intent.putExtra("categoryName", "Hero")
            intent.putExtra("category", "hero")
            startActivity(intent)
        }

        //if the user clicks on Disney Movies
        binding.btnHorror.setOnClickListener {
            val intent = Intent(this, QuestionActivity::class.java)
            intent.putExtra("categoryName", "Horror")
            intent.putExtra("category", "horror")
            startActivity(intent)
        }

    }

}
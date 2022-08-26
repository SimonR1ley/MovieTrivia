package com.example.movietrivia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.movietrivia.databinding.ActivityHomeBinding
import com.example.movietrivia.models.Question

class HomeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)


//        dataReceive = findViewById(R.id.tv_username)





        val username = intent.getStringExtra("username").toString()

//        binding.tvUsername.text = username

//        binding.btnChangeName.setOnClickListener{
//            val intent = Intent(this, HomeActivity::class.java)
//            intent.putExtra("username", username.toString())
//            startActivity(intent)
//        }


        binding.settings.setOnClickListener {
            val intent = Intent(this, SettingActivity::class.java)
            intent.putExtra("username", username.toString())
            intent.putExtra("categoryName", "Disney")
            intent.putExtra("category", "disney")
            startActivity(intent)
        }

        //if the user clicks on Disney Movies
        binding.btnMovieCat.setOnClickListener {
            val intent = Intent(this, QuestionActivity::class.java)
            intent.putExtra("username", username.toString())
            intent.putExtra("categoryName", "Disney")
            intent.putExtra("category", "disney")
            startActivity(intent)
        }


        //if the user clicks on Disney Movies
        binding.btnQuotes.setOnClickListener {
            val intent = Intent(this, QuestionActivity::class.java)
            intent.putExtra("username", username.toString())
            intent.putExtra("categoryName", "Quotes")
            intent.putExtra("category", "quotes")
            startActivity(intent)
        }

    }

}
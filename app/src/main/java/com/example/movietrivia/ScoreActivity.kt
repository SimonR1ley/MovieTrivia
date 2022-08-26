package com.example.movietrivia

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.movietrivia.databinding.ActivityScoreBinding
import com.example.movietrivia.models.Constants


class ScoreActivity : AppCompatActivity() {

    private lateinit var binding: ActivityScoreBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityScoreBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        val score = intent.getStringExtra("score")
//        binding.scoreCurrent.text = score



        val sharedPref = getSharedPreferences("myPref", Context.MODE_PRIVATE)
        val editor = sharedPref.edit()
        val user = sharedPref.getString(Constants.USERNAME, "")
        val userHighScore = sharedPref.getInt(Constants.HIGHSCORE, 0)

        val username = intent.getStringExtra("username").toString()



        val score = intent.getStringExtra("score")



        binding.scoreCurrent.text = score
        binding.tvUsername.text = username



        binding.btnTryAgain.setOnClickListener{

            val intent = Intent(this, QuestionActivity::class.java)
            //sends the username back to the categories view to be accessible
            intent.putExtra("username", username)
            intent.putExtra("finalScore", score)
            startActivity(intent)

        }


        binding.btnSettings.setOnClickListener{

            val intent = Intent(this, SettingActivity::class.java)
            //sends the username back to the categories view to be accessible
            intent.putExtra("username", username)
            intent.putExtra("finalScore", score)
            startActivity(intent)

        }


    }

}
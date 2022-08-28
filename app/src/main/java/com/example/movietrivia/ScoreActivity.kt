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
        val DisneyHighScore = sharedPref.getInt(Constants.DISNEYHIGHSCORE, 0)
        val HeroHighScore = sharedPref.getInt(Constants.HEROHIGHSCORE, 0)
        val HorrorHighScore = sharedPref.getInt(Constants.HORRORHIGHSCORE, 0)


        val category = intent.getStringExtra("category")

        binding.tvUsername.text = user.toString()

        val score = intent.getIntExtra("score", 0)
        binding.scoreCurrent.text = score.toString()



        if(category == "disney"){
            binding.scoreHigh.text = DisneyHighScore.toString()
            binding.tvCategory.text = "Disney"
            binding.tvUsername.text = user.toString()
        }

        if(category == "hero"){
            binding.scoreHigh.text = HeroHighScore.toString()
            binding.tvCategory.text = "Hero"
            binding.tvUsername.text = user.toString()
        }

        if(category == "horror"){
            binding.scoreHigh.text = HorrorHighScore.toString()
            binding.tvCategory.text = "Horror"
            binding.tvUsername.text = user.toString()
        }


//        binding.scoreHigh.text = "$userHighScore"
//        binding.tvUsername.text = username.toString()




        binding.btnTryAgain.setOnClickListener{

            val intent = Intent(this, QuestionActivity::class.java)
            //sends the username back to the categories view to be accessible
//            intent.putExtra("username", username)
            intent.putExtra("finalScore", score)

            editor.apply{
                putString(Constants.USERNAME, user.toString())
                apply() //to end
            }

            startActivity(intent)

        }


        binding.btnSettings.setOnClickListener{

            val intent = Intent(this, SettingActivity::class.java)
            editor.apply{
                putInt(Constants.DISNEYHIGHSCORE, score)
                putInt(Constants.HEROHIGHSCORE, score)
                putInt(Constants.HORRORHIGHSCORE, score)
                apply() //to end
            }
            startActivity(intent)
        }
        binding.tvUsername.text = user.toString()

    }

}
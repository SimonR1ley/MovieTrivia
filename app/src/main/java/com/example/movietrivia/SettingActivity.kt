package com.example.movietrivia

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.movietrivia.databinding.ActivitySettingBinding
import com.example.movietrivia.models.Constants

class SettingActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySettingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySettingBinding.inflate(layoutInflater)
        setContentView(binding.root)



        val sharedPref = getSharedPreferences("myPref", Context.MODE_PRIVATE)
        val editor = sharedPref.edit()
        val user = sharedPref.getString(Constants.USERNAME, "")

        val DisneyHighScore = sharedPref.getInt(Constants.DISNEYHIGHSCORE, 0)
        val HeroHighScore = sharedPref.getInt(Constants.HEROHIGHSCORE, 0)
        val HorrorHighScore = sharedPref.getInt(Constants.HORRORHIGHSCORE, 0)

        binding.btnInfo.setOnClickListener {
            val intent = Intent(this, AboutActivity::class.java)
            startActivity(intent)
        }

        //reset score
        binding.btnReset.setOnClickListener {
            editor.apply{
                putString(Constants.USERNAME, "")
//                putInt(Constants.HIGHSCORE, 0)
                putInt(Constants.DISNEYHIGHSCORE, 0)
                putInt(Constants.HEROHIGHSCORE, 0)
                putInt(Constants.HORRORHIGHSCORE, 0)
                apply() //to end
            }
            val intent = Intent(this, NameActivity::class.java)
            startActivity(intent)
        }

        binding.tvUsername.text = user.toString()

        binding.tvDisneyHighscore.text = "$DisneyHighScore"
        binding.tvHeroHighscore.text = "$HeroHighScore"
        binding.tvHorrorHighscore.text = "$HorrorHighScore"

//        binding.tvScore.text = "$userHighScore"

        binding.btnReturn.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }

//

    }
}
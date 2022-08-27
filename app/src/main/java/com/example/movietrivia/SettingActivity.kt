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
        val userHighScore = sharedPref.getInt(Constants.HIGHSCORE, 0)

        //reset score
        binding.btnReset.setOnClickListener {
            editor.apply{
                putString(Constants.USERNAME, "")
                putInt(Constants.HIGHSCORE, 0)
                apply() //to end
            }
            startActivity(intent)
        }

        binding.tvUsername.text = user.toString()
        binding.tvScore.text = "$userHighScore"

        binding.btnReturn.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }

//

    }
}
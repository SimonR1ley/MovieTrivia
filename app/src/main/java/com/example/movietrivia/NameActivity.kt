package com.example.movietrivia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.movietrivia.databinding.ActivityHomeBinding
import com.example.movietrivia.databinding.ActivityNameBinding
import com.google.android.material.snackbar.Snackbar

class NameActivity : AppCompatActivity() {


    private lateinit var binding: ActivityNameBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityNameBinding.inflate(layoutInflater)
        setContentView(binding.root)


//        Example of getting access to my button for clicks

        binding.btnStart.setOnClickListener {
//            Get Access to username input

            val username = binding.etUsername.text

//            Check if username input is empty

        if(username.toString() == ""){

//                Snack
            var snackbar = Snackbar.make(it, "Please enter you name", Snackbar.LENGTH_LONG)
                .setAction("ok") {
                    Log.i("Ok Snackbar", "Yes")
                }

            snackbar.show()

        }else{
//                    Navigate to Next Activity (Context from where this intent happens, new Activity)
            Log.i("Clicked", "$username")

            val intent = Intent(this, HomeActivity::class.java)

            intent.putExtra("username", username.toString())
            startActivity(intent)

        }



    }


    }
}
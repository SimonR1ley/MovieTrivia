package com.example.movietrivia

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.movietrivia.databinding.ActivityQuestionBinding
import com.example.movietrivia.models.Constants
import com.example.movietrivia.models.Constants.getAllDisneyQuestions
import com.example.movietrivia.models.Constants.getAllQuoteQuestions
import com.example.movietrivia.models.Question

class QuestionActivity : AppCompatActivity() {

    private lateinit var binding: ActivityQuestionBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityQuestionBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val username = intent.getStringExtra("username").toString()

//        Get the question number from previous activity

//        Call for all my questions
        var questions = getAllDisneyQuestions()


        val categoryName = intent.getStringExtra("categoryName").toString()
        val selectedCategory = intent.getStringExtra("category").toString()


        var questionNumber = intent.getIntExtra("questionNumber", 0)

        var score = intent.getIntExtra("score", 0)

        val sharedPref = getSharedPreferences("myPref", Context.MODE_PRIVATE)
        val editor = sharedPref.edit()
        val user = sharedPref.getString(Constants.USERNAME, "")
        val highScore = sharedPref.getInt(Constants.HIGHSCORE, 0)


        when (selectedCategory) {
            "disney" -> {
                questions = getAllDisneyQuestions()
            }
            "quotes" -> {
                questions = getAllQuoteQuestions()
            }
        }


        val currentQuestion = questions[questionNumber]

        updateUI(currentQuestion)




        //Option One
        binding.btnGuessOne.setOnClickListener{



            if(questionNumber + 1 == questions.size){
                val intent = Intent(this, ScoreActivity::class.java)
                intent.putExtra("score", score)
                startActivity(intent)
                finish()
            }

            val intent = Intent(this, QuestionActivity::class.java)
            if (binding.btnGuessOne.text == currentQuestion.answer){
                intent.putExtra("score", score + 1)
            } else {
                intent.putExtra("score", score )
            }
            intent.putExtra("category", selectedCategory)
            intent.putExtra("questionNumber", questionNumber + 1)

            startActivity(intent)
            finish()


            if(questionNumber == questions.count() -1){
                val intent = Intent(this, ScoreActivity::class.java)

                intent.putExtra("score", score )
                intent.putExtra("username", username )

                if (score > highScore) {
                    editor.apply{
                        putString(Constants.USERNAME, username)
                        putInt(Constants.HIGHSCORE, score)
                        apply() //to end
                    }
                }

                intent.putExtra("username", username)
                startActivity(intent)
                finish()

            }

        }


        //Option Two
        binding.btnGuessTwo.setOnClickListener{

            if(questionNumber + 1 == questions.size){
                val intent = Intent(this, ScoreActivity::class.java)
                intent.putExtra("score", score)
                startActivity(intent)
                finish()
            }


            val intent = Intent(this, QuestionActivity::class.java)
            if (binding.btnGuessTwo.text == currentQuestion.answer){
                intent.putExtra("score", score + 1)
            } else {
                intent.putExtra("score", score )
            }
            intent.putExtra("category", selectedCategory)
            intent.putExtra("questionNumber", questionNumber + 1)

            startActivity(intent)
            finish()



            if(questionNumber == questions.count() -1){
                val intent = Intent(this, ScoreActivity::class.java)
                if (score > highScore) {
                    editor.apply{
                        putString(Constants.USERNAME, username)
                        putInt(Constants.HIGHSCORE, score)
                        apply() //to end
                    }
                }

                intent.putExtra("username", username)
                startActivity(intent)
                finish()

            }




        }


        //Option Three
        binding.btnGuessThree.setOnClickListener{


            if(questionNumber + 1 == questions.size){
                val intent = Intent(this, ScoreActivity::class.java)
                intent.putExtra("score", score)
                startActivity(intent)
                finish()
            }


            val intent = Intent(this, QuestionActivity::class.java)
            if (binding.btnGuessThree.text == currentQuestion.answer){
                intent.putExtra("score", score + 1)
            } else {
                intent.putExtra("score", score )
            }
            intent.putExtra("category", selectedCategory)
            intent.putExtra("questionNumber", questionNumber + 1)

            startActivity(intent)
            finish()



            if(questionNumber == questions.count() -1){
                val intent = Intent(this, ScoreActivity::class.java)
                if (score > highScore) {
                    editor.apply{
                        putString(Constants.USERNAME, username)
                        putInt(Constants.HIGHSCORE, score)
                        apply() //to end
                    }
                }

                intent.putExtra("username", username)
                startActivity(intent)
                finish()

            }

        }


        //Option Four
        binding.btnGuessFour.setOnClickListener{


            if(questionNumber + 1 == questions.size){
                val intent = Intent(this, ScoreActivity::class.java)
                intent.putExtra("score", score)
                startActivity(intent)
                finish()
            }

            val intent = Intent(this, QuestionActivity::class.java)
            intent.putExtra("category", selectedCategory)
            if (binding.btnGuessFour.text == currentQuestion.answer){
                intent.putExtra("score", score + 1)
            } else {
                intent.putExtra("score", score )
            }
            intent.putExtra("questionNumber", questionNumber + 1)

            startActivity(intent)
            finish()




            if(questionNumber == questions.count() -1){
                val intent = Intent(this, ScoreActivity::class.java)
                if (score > highScore) {
                    editor.apply{
                        putString(Constants.USERNAME, username)
                        putInt(Constants.HIGHSCORE, score)
                        apply() //to end
                    }
                }
            }

            intent.putExtra("username", username)
            startActivity(intent)
            finish()

        }


        Log.i("Score", "${score.toInt()}")









    }

    fun updateUI(currentQuestion: Question){

        //bind all question info to View values
        if(currentQuestion.id == 1){
            binding.ivQuestion.setImageResource(currentQuestion.icon)
        }else{
            binding.ivQuestion.setImageResource(currentQuestion.icon)
        }
        binding.btnGuessOne.text = currentQuestion.optionOne
        binding.btnGuessTwo.text = currentQuestion.optionTwo
        binding.btnGuessThree.text = currentQuestion.optionThree
        binding.btnGuessFour.text = currentQuestion.optionFour
        binding.ivQuestion.setImageResource(currentQuestion.icon)

    }

}






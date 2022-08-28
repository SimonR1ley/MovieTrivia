package com.example.movietrivia

import android.content.Context
import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.util.Log
import com.example.movietrivia.databinding.ActivityQuestionBinding
import com.example.movietrivia.models.Constants
import com.example.movietrivia.models.Constants.getAllDisneyQuestions
import com.example.movietrivia.models.Constants.getAllHeroQuestions
import com.example.movietrivia.models.Constants.getAllHorrorQuestions
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

//

        var score = intent.getIntExtra("score", 0)

        val sharedPref = getSharedPreferences("myPref", Context.MODE_PRIVATE)
        val editor = sharedPref.edit()
        val user = sharedPref.getString(Constants.USERNAME, "")
//        val highScore = sharedPref.getInt(Constants.HIGHSCORE, 0)
        val highDisneyScore = sharedPref.getInt(Constants.DISNEYHIGHSCORE, 0)
        val highHeroScore = sharedPref.getInt(Constants.HEROHIGHSCORE, 0)
        val highHorrorScore = sharedPref.getInt(Constants.HORRORHIGHSCORE, 0)


        when (selectedCategory) {
            "disney" -> {
                questions = getAllDisneyQuestions()
            }
            "hero" -> {
                questions = getAllHeroQuestions()
            }

            "horror" -> {
                questions = getAllHorrorQuestions()
            }
        }


        val currentQuestion = questions[questionNumber]

        updateUI(currentQuestion, username)




        //Option One
        binding.btnGuessOne.setOnClickListener{



//            if(questionNumber + 1 == questions.size){
//                val intent = Intent(this, ScoreActivity::class.java)
//                intent.putExtra("score", score)
//                intent.putExtra("username", user.toString())
//                startActivity(intent)
//                finish()
//            }

            val intent = Intent(this, QuestionActivity::class.java)
//            binding.tvQuestionNumber.text = questionNumber.toString()

            if (binding.btnGuessOne.text == currentQuestion.answer){
                intent.putExtra("score", score + 1)
                binding.mvBackground.setCardBackgroundColor(Color.GREEN);
            } else {
                intent.putExtra("score", score )
                binding.mvBackground.setCardBackgroundColor(Color.RED);
            }



            intent.putExtra("category", selectedCategory)
            intent.putExtra("questionNumber", questionNumber + 1)

            Handler().postDelayed({

                startActivity(intent)
                finish()
            }, 500)




            if(questionNumber == questions.count() -1){
                Log.i("Score", "${score}")
                val intent = Intent(this, ScoreActivity::class.java)
                intent.putExtra("score", score)
                intent.putExtra("username", user.toString())
                intent.putExtra("category", selectedCategory)


                if (selectedCategory == "disney") {
                    if(score > highDisneyScore){
                        editor.apply{
//                            putString(Constants.USERNAME, username)
                            putInt(Constants.DISNEYHIGHSCORE, score)
                            apply() //to end
                        }
                    }
                }

                if (selectedCategory == "hero") {
                    if(score > highHeroScore){
                        editor.apply{
//                            putString(Constants.USERNAME, username)
                            putInt(Constants.HEROHIGHSCORE, score)
                            apply() //to end
                        }
                    }
                }

                if (selectedCategory == "horror") {
                    if(score > highHorrorScore){
                        editor.apply{
//                            putString(Constants.USERNAME, username)
                            putInt(Constants.HORRORHIGHSCORE, score)
                            apply() //to end
                        }
                    }
                }

                startActivity(intent)
                finish()

            }

        }


        //Option Two
        binding.btnGuessTwo.setOnClickListener{

//            if(questionNumber + 1 == questions.size){
//                val intent = Intent(this, ScoreActivity::class.java)
//                intent.putExtra("score", score)
//                intent.putExtra("username", user.toString())
//                startActivity(intent)
//                finish()
//            }


            val intent = Intent(this, QuestionActivity::class.java)
//            binding.tvQuestionNumber.text = questionNumber.toString()
            if (binding.btnGuessTwo.text == currentQuestion.answer){
                intent.putExtra("score", score + 1)
                binding.mvBackground.setCardBackgroundColor(Color.GREEN);
            } else {
                intent.putExtra("score", score )
                binding.mvBackground.setCardBackgroundColor(Color.RED);
            }
            intent.putExtra("category", selectedCategory)
            intent.putExtra("questionNumber", questionNumber + 1)

            Handler().postDelayed({
                startActivity(intent)
                finish()
            }, 500)



            if(questionNumber == questions.count() -1){
                Log.i("Score", "${score}")
                val intent = Intent(this, ScoreActivity::class.java)
                intent.putExtra("score", score)
                intent.putExtra("username", user.toString())
                intent.putExtra("category", selectedCategory)


                if (selectedCategory == "disney") {
                    if(score > highDisneyScore){
                        editor.apply{
//                            putString(Constants.USERNAME, username)
                            putInt(Constants.DISNEYHIGHSCORE, score)
                            apply() //to end
                        }
                    }
                }

                if (selectedCategory == "hero") {
                    if(score > highHeroScore){
                        editor.apply{
//                            putString(Constants.USERNAME, username)
                            putInt(Constants.HEROHIGHSCORE, score)
                            apply() //to end
                        }
                    }
                }

                if (selectedCategory == "horror") {
                    if(score > highHorrorScore){
                        editor.apply{
//                            putString(Constants.USERNAME, username)
                            putInt(Constants.HORRORHIGHSCORE, score)
                            apply() //to end
                        }
                    }
                }

                startActivity(intent)
                finish()

            }
        }


        //Option Three
        binding.btnGuessThree.setOnClickListener{


//            if(questionNumber + 1 == questions.size){
//                val intent = Intent(this, ScoreActivity::class.java)
//                intent.putExtra("score", score)
//                intent.putExtra("username", user.toString())
//                startActivity(intent)
//                finish()
//            }


            val intent = Intent(this, QuestionActivity::class.java)
//            binding.tvQuestionNumber.text = questionNumber.toString()
            if (binding.btnGuessThree.text == currentQuestion.answer){
                intent.putExtra("score", score + 1)
                binding.mvBackground.setCardBackgroundColor(Color.GREEN);
            } else {
                intent.putExtra("score", score )
                binding.mvBackground.setCardBackgroundColor(Color.RED);
            }
            intent.putExtra("category", selectedCategory)
            intent.putExtra("questionNumber", questionNumber + 1)

            Handler().postDelayed({
                startActivity(intent)
                finish()
            }, 500)



            if(questionNumber == questions.count() -1){
                Log.i("Score", "${score}")
                val intent = Intent(this, ScoreActivity::class.java)
                intent.putExtra("score", score)
                intent.putExtra("username", user.toString())
                intent.putExtra("category", selectedCategory)


                if (selectedCategory == "disney") {
                    if(score > highDisneyScore){
                        editor.apply{
//                            putString(Constants.USERNAME, username)
                            putInt(Constants.DISNEYHIGHSCORE, score)
                            apply() //to end
                        }
                    }
                }

                if (selectedCategory == "hero") {
                    if(score > highHeroScore){
                        editor.apply{
//                            putString(Constants.USERNAME, username)
                            putInt(Constants.HEROHIGHSCORE, score)
                            apply() //to end
                        }
                    }
                }

                if (selectedCategory == "horror") {
                    if(score > highHorrorScore){
                        editor.apply{
//                            putString(Constants.USERNAME, username)
                            putInt(Constants.HORRORHIGHSCORE, score)
                            apply() //to end
                        }
                    }
                }

                startActivity(intent)
                finish()

            }

        }


        //Option Four
        binding.btnGuessFour.setOnClickListener{


//            if(questionNumber + 1 == questions.size){
//                val intent = Intent(this, ScoreActivity::class.java)
//                intent.putExtra("score", score)
//                intent.putExtra("username", user.toString())
//                startActivity(intent)
//                finish()
//            }

            val intent = Intent(this, QuestionActivity::class.java)
//            binding.tvQuestionNumber.text = questionNumber.toString()
            intent.putExtra("category", selectedCategory)
            if (binding.btnGuessFour.text == currentQuestion.answer){
                intent.putExtra("score", score + 1)
                binding.mvBackground.setCardBackgroundColor(Color.GREEN);
            } else {
                intent.putExtra("score", score )
                binding.mvBackground.setCardBackgroundColor(Color.RED);
            }
            intent.putExtra("category", selectedCategory)
            intent.putExtra("questionNumber", questionNumber + 1)

            Handler().postDelayed({
                startActivity(intent)
                finish()
            }, 500)




            if(questionNumber == questions.count() -1){
                Log.i("Score", "${score}")
                val intent = Intent(this, ScoreActivity::class.java)
                intent.putExtra("score", score)
                intent.putExtra("username", user.toString())
                intent.putExtra("category", selectedCategory)


                if (selectedCategory == "disney") {
                    if(score > highDisneyScore){
                        editor.apply{
//                            putString(Constants.USERNAME, username)
                            putInt(Constants.DISNEYHIGHSCORE, score)
                            apply() //to end
                        }
                    }
                }

                if (selectedCategory == "hero") {
                    if(score > highHeroScore){
                        editor.apply{
//                            putString(Constants.USERNAME, username)
                            putInt(Constants.HEROHIGHSCORE, score)
                            apply() //to end
                        }
                    }
                }

                if (selectedCategory == "horror") {
                    if(score > highHorrorScore){
                        editor.apply{
//                            putString(Constants.USERNAME, username)
                            putInt(Constants.HORRORHIGHSCORE, score)
                            apply() //to end
                        }
                    }
                }

                startActivity(intent)
                finish()

            }



        }


        binding.tvQuestionNumber.text = "Question ${questionNumber +1}"


    }

    fun updateUI(currentQuestion: Question, username: String){

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






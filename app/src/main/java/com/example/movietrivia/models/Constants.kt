package com.example.movietrivia.models

import com.example.movietrivia.R

object Constants {

    val USERNAME: String = "username"
    val HIGHSCORE: String = "high_score"

    //    This function returns all questions
    fun getAllDisneyQuestions() : ArrayList<Question> {

//        Create our empty ArrayList
        var allDisneyQuestions = ArrayList<Question>()

        //        TODO: Create data

        val que1 = Question(
            1,
            R.drawable.space_jam,
            "Space Ball",
            "Space Jam",
            "Meet the Robertson's",
            "Lone Ranger",
            "Space Jam"

        )

        val que2 = Question(
            2,
            R.drawable.forzen,
            "Ice Princess",
            "Snowflake",
            "Ice Cold",
            "Frozen",
            "Frozen"
        )

        val que3 = Question(
            3,
            R.drawable.home_alone,
            "Neighborhood",
            "Home Alone",
            "Monster House",
            "Up",
            "Home Alone"
        )

        val que4 = Question(
            4,
            R.drawable.up,
            "Flushed Away",
            "Party House",
            "jumanji",
            "Up",
            "Up"
        )

        val que5 = Question(
            5,
            R.drawable.jungle_cruise,
            "Jungle Cruise",
            "Tarzan",
            "Jungle Book",
            "Life of Pie",
            "Jungle Cruise"
        )

        val que6 = Question(
            6,
            R.drawable.nightmare_bc,
            "Halloween",
            "Nightmr bf Christmas",
            "Christmas Tales",
            "Grinch",
            "Nightmr. bf Christmas"
        )

        val que7 = Question(
            7,
            R.drawable.forzen,
            "Ice Princess",
            "Snowflake",
            "Ice Cold",
            "Frozen",
            "Frozen"
        )

        val que8 = Question(
            8,
            R.drawable.forzen,
            "Ice Princess",
            "Snowflake",
            "Ice Cold",
            "Frozen",
            "Frozen"
        )

        val que9 = Question(
            9,
            R.drawable.forzen,
            "Ice Princess",
            "Snowflake",
            "Ice Cold",
            "Frozen",
            "Frozen"
        )

        val que10 = Question(
            10,
            R.drawable.forzen,
            "Ice Princess",
            "Snowflake",
            "Ice Cold",
            "Frozen",
            "Frozen"
        )

//    Add Questions To array

        allDisneyQuestions.add(que1)
        allDisneyQuestions.add(que2)
        allDisneyQuestions.add(que3)
        allDisneyQuestions.add(que4)
        allDisneyQuestions.add(que5)

        //         Return Data
        return allDisneyQuestions
    }



//    Character Questions


    fun getAllQuoteQuestions() : ArrayList<Question> {

//        Create our empty ArrayList
        var allQuoteQuestions = ArrayList<Question>()

        //        TODO: Create data

        val que1 = Question(
            1,
            R.drawable.space_jam,
            "Space Balls",
            "Space Jam",
            "Meet the Robertson's",
            "Lone Ranger",
            "Space Jam"

        )

        val que2 = Question(
            2,
            R.drawable.forzen,
            "Ice Princess",
            "Snowflake",
            "Ice Cold",
            "Frozen",
            "Frozen"
        )

        val que3 = Question(
            3,
            R.drawable.home_alone,
            "Neighborhood",
            "Home Alone",
            "Monster House",
            "Up",
            "Home Alone"
        )

        val que4 = Question(
            4,
            R.drawable.up,
            "Flushed Away",
            "Party House",
            "jumanji",
            "Up",
            "Up"
        )

        val que5 = Question(
            5,
            R.drawable.jungle_cruise,
            "Jungle Cruise",
            "Tarzan",
            "Jungle Book",
            "Life of Pie",
            "Jungle Cruise"
        )

        val que6 = Question(
            6,
            R.drawable.nightmare_bc,
            "Halloween",
            "Nightmr bf Christmas",
            "Christmas Tales",
            "Grinch",
            "Nightmr. bf Christmas"
        )

        val que7 = Question(
            7,
            R.drawable.forzen,
            "Ice Princess",
            "Snowflake",
            "Ice Cold",
            "Frozen",
            "Frozen"
        )

        val que8 = Question(
            8,
            R.drawable.forzen,
            "Ice Princess",
            "Snowflake",
            "Ice Cold",
            "Frozen",
            "Frozen"
        )

        val que9 = Question(
            9,
            R.drawable.forzen,
            "Ice Princess",
            "Snowflake",
            "Ice Cold",
            "Frozen",
            "Frozen"
        )

        val que10 = Question(
            10,
            R.drawable.forzen,
            "Ice Princess",
            "Snowflake",
            "Ice Cold",
            "Frozen",
            "Frozen"
        )

//    Add Questions To array

        allQuoteQuestions.add(que1)
        allQuoteQuestions.add(que2)
        allQuoteQuestions.add(que3)
        allQuoteQuestions.add(que4)
        allQuoteQuestions.add(que5)

        //         Return Data
        return allQuoteQuestions
    }




}

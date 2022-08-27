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
            "Nightmr bf Christmas"
        )

        val que7 = Question(
            7,
            R.drawable.robots,
            "Robots",
            "Big Hero 6",
            "Irobot",
            "Bolts",
            "Robots"
        )

        val que8 = Question(
            8,
            R.drawable.starwars,
            "Star trek",
            "Avengers",
            "Starwars",
            "Pirates of the Carabean",
            "Starwars"
        )

        val que9 = Question(
            9,
            R.drawable.wish_dragon,
            "Aladin",
            "Eragon",
            "Dragon Riders",
            "Wish Dragon",
            "Wish Dragon"
        )

        val que10 = Question(
            10,
            R.drawable.kfu_panda,
            "Zooland",
            "Pokemon",
            "KungFu Panda",
            "Brave",
            "KungFu Panda"
        )

//    Add Questions To array

        allDisneyQuestions.add(que1)
        allDisneyQuestions.add(que2)
        allDisneyQuestions.add(que3)
        allDisneyQuestions.add(que4)
        allDisneyQuestions.add(que5)
        allDisneyQuestions.add(que6)
        allDisneyQuestions.add(que7)
        allDisneyQuestions.add(que8)
        allDisneyQuestions.add(que9)
        allDisneyQuestions.add(que10)

        //         Return Data
        return allDisneyQuestions
    }



//    Character Questions


    fun getAllHeroQuestions() : ArrayList<Question> {

//        Create our empty ArrayList
        var allHeroQuestions = ArrayList<Question>()

        //        TODO: Create data

        val que1 = Question(
            1,
            R.drawable.black_panther,
            "Black Panther",
            "Hawk",
            "Flash",
            "Winter Soldier",
            "Black Panther"

        )

        val que2 = Question(
            2,
            R.drawable.hulk,
            "Batman",
            "Bane",
            "Hulk",
            "Antman",
            "Hulk"
        )

        val que3 = Question(
            3,
            R.drawable.deadpool,
            "Aquaman",
            "Deadpool",
            "Flash",
            "Superman",
            "Deadpool"
        )

        val que4 = Question(
            4,
            R.drawable.captain_america,
            "Captain America",
            "Black Widow",
            "Homelander",
            "Winter Soldier",
            "Captain America"
        )

        val que5 = Question(
            5,
            R.drawable.batman,
            "Spiderman",
            "Morbius",
            "Robin",
            "Batman",
            "Batman"
        )


//    Add Questions To array

        allHeroQuestions.add(que1)
        allHeroQuestions.add(que2)
        allHeroQuestions.add(que3)
        allHeroQuestions.add(que4)
        allHeroQuestions.add(que5)

        //         Return Data
        return allHeroQuestions
    }



    fun getAllHorrorQuestions() : ArrayList<Question> {

//        Create our empty ArrayList
        var allHorrorQuestions = ArrayList<Question>()

        //        TODO: Create data

        val que1 = Question(
            1,
            R.drawable.it,
            "Stabbing",
            "IT",
            "Scream",
            "Halloween",
            "IT"

        )

        val que2 = Question(
            2,
            R.drawable.jaws,
            "Jaws",
            "Shark Week",
            "The Meg",
            "Finding Nemo",
            "Jaws"
        )

        val que3 = Question(
            3,
            R.drawable.scream,
            "IT",
            "Psyco",
            "Scream",
            "Stabbing",
            "Scream"
        )

        val que4 = Question(
            4,
            R.drawable.birdbox,
            "Jurasic Park",
            "Birdbox",
            "Dragon Rider",
            "The Conjouring",
            "Birdbox"
        )

        val que5 = Question(
            5,
            R.drawable.the_shining,
            "The Shining",
            "Family Troubles",
            "Modern Family",
            "Final Destination",
            "Batman"
        )


//    Add Questions To array

        allHorrorQuestions.add(que1)
        allHorrorQuestions.add(que2)
        allHorrorQuestions.add(que3)
        allHorrorQuestions.add(que4)
        allHorrorQuestions.add(que5)

        //         Return Data
        return allHorrorQuestions
    }


}

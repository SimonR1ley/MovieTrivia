package com.example.movietrivia.models

data class Question (
    val id: Int,
    val icon: Int,
    val optionOne: String,
    val optionTwo: String,
    val optionThree: String,
    val optionFour: String,
    val answer: String,
)



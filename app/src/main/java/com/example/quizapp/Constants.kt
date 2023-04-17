package com.example.quizapp

object Constants {

    fun getQuestion():ArrayList<Question>{
        val questionList = ArrayList<Question>()

        val que1 = Question(
            1,"What country does this flag below to?",
            R.drawable.ic_flag_of_argentina,
            "Argentina", "Australia",
            "Armenia", "Austria",
            1
        )
        questionList.add(que1)

        val que2 = Question(
            2,"What country does this flag below to?",
            R.drawable.ic_flag_of_australia,
            "Argentina", "Australia",
            "Armenia", "Austria",
            2
        )
        questionList.add(que2)

        val que3 = Question(
            3,"What country does this flag below to?",
            R.drawable.ic_flag_of_belgium,
            "Argentina", "Australia",
            "Armenia", "Belgium",
            4
        )
        questionList.add(que3)

        val que4 = Question(
            4,"What country does this flag below to?",
            R.drawable.ic_flag_of_denmark,
            "Argentina", "Australia",
            "Denmark", "Belgium",
            3
        )
        questionList.add(que4)

        return questionList
    }
}
package com.example.quizapp

object Constants {

    const val USER_NAME : String = "user_name"
    const val TOTAL_QUESTIONS : String = "total_question"
    const val CORRECT_ANSWER : String = "correct_answer"

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





        val que5 = Question(
            1,"What country does this flag below to?",
            R.drawable.ic_flag_of_brazil,
            "Argentina", "Brazil",
            "Armenia", "Austria",
            2
        )
        questionList.add(que5)

        val que6 = Question(
            2,"What country does this flag below to?",
            R.drawable.ic_flag_of_fiji,
            "Argentina", "Australia",
            "Fiji", "Austria",
            3
        )
        questionList.add(que6)

        val que7 = Question(
            3,"What country does this flag below to?",
            R.drawable.ic_flag_of_germany,
            "Argentina", "Australia",
            "Armenia", "Germany",
            4
        )
        questionList.add(que7)

        val que8 = Question(
            4,"What country does this flag below to?",
            R.drawable.ic_flag_of_india,
            "India", "Australia",
            "Denmark", "Belgium",
            1
        )
        questionList.add(que8)

        val que9 = Question(
            4,"What country does this flag below to?",
            R.drawable.ic_flag_of_kuwait,
            "Argentina", "Australia",
            "Kuwait", "Belgium",
            3
        )
        questionList.add(que9)

        return questionList
    }
}
package com.example.myquizapp

object Constants {
    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS:String = "total_question"
    const val CORRECT_ANSWERS:String = "correct_answers"

    fun getQuestions(): ArrayList<Question> {

        val questionList = ArrayList<Question>();

        val que1 = Question(
            1,
            "What country does this flag belong to",
            R.drawable.ic_flag_of_india,
            "India",
            "Argentina",
            "Brazil",
            "Denmark",
            1
        );

        val que2 = Question(
            2,
            "What country does this flag belong to",
            R.drawable.ic_flag_of_argentina,
            "India",
            "Argentina",
            "Brazil",
            "Denmark",
            2
        );
        val que3 = Question(
            3,
            "What country does this flag belong to",
            R.drawable.ic_flag_of_australia,
            "India",
            "Australia",
            "Brazil",
            "Denmark",
            2
        );
        val que4 = Question(
            4,
            "What country does this flag belong to",
            R.drawable.ic_flag_of_belgium,
            "India",
            "Argentina",
            "Belgium",
            "Denmark",
            3
        );
        val que5 = Question(
            5,
            "What country does this flag belong to",
            R.drawable.ic_flag_of_brazil,
            "India",
            "Argentina",
            "Brazil",
            "Denmark",
            3
        );
        val que6 = Question(
            6,
            "What country does this flag belong to",
            R.drawable.ic_flag_of_denmark,
            "India",
            "Argentina",
            "Brazil",
            "Denmark",
            4
        );
        val que7 = Question(
            7,
            "What country does this flag belong to",
            R.drawable.ic_flag_of_fiji,
            "India",
            "Fiji",
            "Brazil",
            "Denmark",
            2
        );
        val que8 = Question(
            8,
            "What country does this flag belong to",
            R.drawable.ic_flag_of_germany,
            "Germany",
            "Argentina",
            "Brazil",
            "Denmark",
            1
        );
        val que9 = Question(
            9,
            "What country does this flag belong to",
            R.drawable.ic_flag_of_kuwait,
            "India",
            "Argentina",
            "Brazil",
            "Kuwait",
            4
        );

        val que10 = Question(
            10,
            "What country does this flag belong to",
            R.drawable.ic_flag_of_new_zealand,
            "India",
            "New zealand",
            "Brazil",
            "Denmark",
            2
        );
        questionList.add(que1)
        questionList.add(que2)
        questionList.add(que3)
        questionList.add(que4)
        questionList.add(que5)
        questionList.add(que6)
        questionList.add(que7)
        questionList.add(que8)
        questionList.add(que9)
        questionList.add(que10)

        return questionList;
    }
}
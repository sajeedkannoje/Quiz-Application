package com.example.quizoo

object constants_front {

    const val  totalquestion:String="total questions"
    const val correctanswer:String="correct answers"
    fun getquestion ():ArrayList<questions>{
        val questionslist=ArrayList<questions>()

        val ques1=questions(
            R.drawable.frontend,
            "web dev",1,
            "What does HTML stand for? ",
            "Hyper Tag Markup Language",
            " Hyper Text Markup Language ",
            " Hyperlinks Text Mark Language ",
            " Hyperlinking Text Marking Language ",
            2)

        val ques2=questions(
            R.drawable.frontend,
            "web dev",2,
            " What symbol indicates a tag? ",
            "Angle brackets e.g. ",
            "Curved brackets e.g. {,}",
            "Curved brackets e.g. {,}",
            "Exclamation marks e.g. ! ",
            2)
        val ques3=questions(
            R.drawable.frontend,
            "web dev",3,
            "Who is the father of HTML?",
            "Rasmus Lerdorf ",
            "Tim Berners-Lee",
            " Brendan Eich",
            "Sergey Brin",
            2)
        val ques4=questions(
            R.drawable.frontend,
            "web dev",3,
            "Which of the following tag is used for inserting the largest heading in HTML? ",
            " head",
            "<h1>",
            "<h6>",
            "heading",
            2)
        val ques5=questions(
            R.drawable.frontend,
            "web dev",3,
            " What is Fullform of Css ",
            " Cascading Style Sheet ",
            " Coloured Special Sheet ",
            " Color and Style Sheet ",
            "None ",
            1)
        val ques6=questions(
            R.drawable.frontend,
            "web dev",3,
            "In which part of the HTML metadata is contained?",
            "Head tag",
            "title tag ",
            "html tag",
            "body tag",
            1)
        val ques7=questions(
            R.drawable.frontend,
            "web dev",3,
            "Which of the following HTML tag is used to create an unordered list?  ",
            "<ol>",//true
            "<li>",
            "<ul>",
            "<ll>",
            3)
        val ques8=questions(
            R.drawable.frontend,
            "web dev",3,
            "How to create a checkbox in HTML Form? ",
            "<input type=”text”> ",
            "<input type=”textarea”>",
            "<input type=”checkbox”>",
            " <input type=”button”>",
            3)
        val ques9=questions(
            R.drawable.frontend,
            "web dev",3,
            "Javascript is an which Language ",
            "Object Oriented",
            "Object Based",
            "Procedural",
            "None",
            1)
        val ques10=questions(
            R.drawable.frontend,
            "web dev",3,
            "What is the use of the <noscript> tag in Javascript?",
            "The contents are displayed by non-JS-based browsers.",
            "Clears all the cookies and cache. ",
            "Both A and B",
            "None",
            1)


        questionslist.add(ques1)
        questionslist.add(ques2)
        questionslist.add(ques3)
        questionslist.add(ques4)
        questionslist.add(ques5)
        questionslist.add(ques6)
        questionslist.add(ques7)
        questionslist.add(ques8)
        questionslist.add(ques9)
        questionslist.add(ques10)
        return questionslist
    }
}
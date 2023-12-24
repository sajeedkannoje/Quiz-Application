package com.example.quizoo

object constants {

    const val  totalquestion:String="total questions"
    const val correctanswer:String="correct answers"
    fun getquestion ():ArrayList<questions>{
        val questionslist=ArrayList<questions>()

        val ques1=questions(
            R.drawable.oops,
            "Oops",1,
            "Who invented OOP? ",
            "Andrea Ferro",
            "Adele Goldberg",
            "Alan Kay",
            "Dennis Ritchie",
            3)

        val ques2=questions(
            R.drawable.oops,
            "design",2,
            "Which feature of OOP indicates code reusability?",
            "Abstraction",
            "Polymorphism",
            "Encapsulation",
            "Inheritance",
            4)
        val ques3=questions(
            R.drawable.oops,
            "design",3,
            "Which of the following is not true about polymorphism?",
            "Helps in redefining the same functionality",
            "Increases overhead of function definition always",
            "It is feature of OOP",
            "Ease in readability of program",
            2)
        val ques4=questions(
            R.drawable.oops,
            "design",3,
            "Which among the following, for a pure OOP language, is true?",
            "The language should follow at least 1 feature of OOP",
            "The language must follow only 3 features of OOP",
            "The language must follow all the rules of OOP",
            "The language should follow 3 or more features of OOP",
            3)
        val ques5=questions(
            R.drawable.oops,
            "design",3,
            "What is an abstraction in object-oriented programming?",
            "Hiding the implementation and showing only the features",
            "Hiding the important data",
            "Hiding the implementation",
            "Showing the important data",
            1)
        val ques6=questions(
            R.drawable.oops,
            "design",3,
            "In which access should a constructor be defined, so that object of the class can be created in any function?",
            "Any access specifier will work",
            "Private",//true
            "Public",
            "Protected",
            3)
        val ques7=questions(
            R.drawable.oops,
            "design",3,
            "What happens when an object is passed by reference?",
            "Destructor is called at end of function",//true
            "Destructor is called when called explicitly",
            "Destructor is not called",
            "Destructor is called when function is out of scope",
            3)
        val ques8=questions(
            R.drawable.oops,
            "design",3,
            "Which feature of OOP reduces the use of nested classes?",
            "Inheritance",
            "Binding",
            "Abstraction",
            "Encapsulation",
            1)
        val ques9=questions(
            R.drawable.oops,
            "design",3,
            "Which of the following is not a property of an object? ",
            "Properties",
            "Names",
            "Identity",
            "Attributes",
            2)
        val ques10=questions(
            R.drawable.oops,
            "design",3,
            "Where is the memory allocated for the objects? ",
            "Cache",
            "ROM",//true
            "HDD",
            "RAM",
            4)


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
package com.example.quizoo

object constants_back {
    const val  totalquestion:String="total questions"
    const val correctanswer:String="correct answers"
    fun getquestion ():ArrayList<questions>{
        val questionslist=ArrayList<questions>()

        val ques1=questions(
            R.drawable.backend,
            "Backend",1,
            "What does Back End Web Development refer to? ",
            "Designing the user interface of a website.",
            "Building the server-side components of a website",
            "Creating animations and interactive elements on a webpage",
            "Implementing search engine optimization techniques",
            2)

        val ques2=questions(
            R.drawable.backend,
            "Backend",2,
            "Which of the following is NOT a programming language commonly used for Back End Web Development?"  ,
            " Python ",
            "HTML",//true
            "Node js ",
            "JAVA",
            2)
        val ques3=questions(
            R.drawable.backend,
            "Backend",3,
            "What is the role of a back-end developer in a web development team?  ",
            " Creating visual designs for websites",
            "Ensuring the website is responsive on different devices",
            " Writing code for server-side functionality ",
            "Managing social media marketing campaigns ",
            3)
        val ques4=questions(
            R.drawable.backend,
            "Backend",3,
            "What is the purpose of a database in Back End Web Development?",
            " To store and retrieve data required for the website’s front-end",
            "To manage the website’s visual layout and design",
            " To optimize images for faster loading times ",
            "To display advertisements on the website ",
            1)
        val ques5=questions(
            R.drawable.backend,
            "Backend",3,
            " Which programming language is commonly used for server-side scripting and Back End Web Development? ",
            "Javascript.",
            "HTML ",
            " CSS",
            "PHP ",
            4)
        val ques6=questions(
            R.drawable.backend,
            "Backend",3,
            "What does API stand for in the context of Back End Web Development?  ",
            "Application Permission Interface",
            "Application Programming Interface",//true
            "Advanced Programming Interaction ",
            "Advanced Performance Improvement",
            2)
        val ques7=questions(
            R.drawable.backend,
            "Backend",3,
            " Which of the following is a primary responsibility of Back End Web Development?",
            "Enhancing the user interface with animations",
            "Improving website loading times through caching",
            "Creating interactive forms for user input",
            "Handling user authentication and data storage",
            4)
        val ques8=questions(
            R.drawable.backend,
            "Backend",3,
            "What is the role of a web server in Back End Web Development?",
            " Rendering visual elements on the website",
            "Managing the database and its tables",
            "Serving the website’s files and content to users’ browsers",
            " Creating responsive layouts for different screen sizes",
            3)
        val ques9=questions(
            R.drawable.backend,
            "Backend",3,
            "What is the primary purpose of using a caching mechanism in Back End Web Development?",
            "To optimize images and videos on the website",
            " To enhance the website’s visual appearance. ",
            " To store frequently accessed data temporarily, reducing the need to fetch it from the database repeatedly. ",
            " To prevent website downtime during maintenance periods. ",
            3)
        val ques10=questions(
            R.drawable.backend,
            "Backend",3,
            "What does SQL stand for in the context of Back End Web Development?",
            "Secure Query Language.",
            "Structured Query Language.",
            "Server Query Language.",
            "Script Query Language",
            2)

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
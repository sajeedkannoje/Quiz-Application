package com.example.quizoo

object constant_android {
        const val  totalquestion:String="total questions"
        const val correctanswer:String="correct answers"
        fun getquestion ():ArrayList<questions>{
            val questionslist=ArrayList<questions>()

            val ques1=questions(
                R.drawable.android,
                "Android",1,
                "Android is -? ",
                "An Operating System",
                "An Web browser",
                "a web server",
                "None of the above",
                1)

            val ques2=questions(
                R.drawable.android,
                "Android",2,
                "Under which of the following Android is licensed?",
                "OSS",
                "Sourgeforge",
                "Apache/MIT",
                "None of the above",
                3)
            val ques3=questions(
                R.drawable.android,
                "Android",3,
                "For which of the following Android is mainly developed? ",
                "Servers",
                "Desktops",
                "Mobile Devices",//true
                "Laptops",
                3)
            val ques4=questions(
                R.drawable.android,
                "Android",3,
                "Which of the following virtual machine is used by the Android operating system?",
                "JVM",
                "Dalvik virtual machine",
                "Simple virtual machine",
                "None of the above",
                2)
            val ques5=questions(
                R.drawable.android,
                "Android",3,
                " Android is based on which of the following language?",
                "Java",
                "C",
                "C++",//true
                "none of these answers",
                1)
            val ques6=questions(
                R.drawable.android,
                "mobile dev",3,
                "Which of the following converts Java byte code into Dalvik byte code?",
                "Dalvik Converter",
                "Dex Compiler",//true
                "Mobile interpretive compiler (MIC)",
                "none of these answers",
                2)
            val ques7=questions(
                R.drawable.android,
                "Android",3,
                " What is an activity in android? ",
                "android class",//true
                "android package",
                "A single screen in an application with supporting java code",
                "none of these answers",
                3)
            val ques8=questions(
                R.drawable.android,
                "Android",3,
                "How can we kill an activity in android?",
                "Using finish() method",//true
                "Using finishActivity(int requestCode)",
                "Both (a) and (b)",
                "Neither (a) nor (b)",
                3)
            val ques9=questions(
                R.drawable.android,
                "Android",3,
                "Which of the following kernel is used in Android?",
                "MAC",
                "Windows",
                "Linux",
                "Redhat",
                3)
            val ques10=questions(
                R.drawable.android,
                "Android",3,
                " Does android support other languages than java?",
                "Yes",
                "No",//true
                "May be",
                "Can't say",
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
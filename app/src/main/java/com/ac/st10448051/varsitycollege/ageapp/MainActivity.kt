package com.ac.st10448051.varsitycollege.ageapp

import android.annotation.SuppressLint
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val compareButton = findViewById<Button>(R.id.compareButton)
        val clearButton = findViewById<Button>(R.id.clearButton)
        val ageEditText = findViewById<EditText>(R.id.ageEditText)
        val resultTextView = findViewById<TextView>(R.id.resultTextView)

        compareButton.setOnClickListener {
            val userInput = ageEditText.text.toString()
            Log.v("MainActivity", "User input: $userInput")

            if (userInput.isEmpty()) {
                resultTextView.text = "Please enter a valid age – it must be a whole number without any decimals or text."
            } else {
                val userAge = userInput.toIntOrNull()

                if (userAge == null) {
                    resultTextView.text = "Please enter a valid age – it must be a whole number without any decimals or text."
                } else {
                    if (userAge < 1 || userAge > 100) {
                        resultTextView.text = "Please enter an age between 1 and 100."
                        ageEditText.text.clear()
                    } else {
                        val result = when (userAge) {
                            23 -> "TECHNOBLADE, was a video gaming YouTuber who racked up 16 million subscribers thanks to his many comedy and Minecraft videos. He created a SkyWars series for his channel. He passed away from cancer in June 2022. Though the exact date is unknown, his final video 'so long nerds' was posted on June 30th, 2022. Died at the age of 23."
                            96 -> "Queen ELIZABETH II, Became the constitutional monarch of 16 countries and the Supreme Governor of the Church of England after her coronation in 1953. She became the longest reigning monarch in British history. Died at the age of 96."
                            67 -> "Lynn Davis, was a fun-loving and comedic content creator who focused on food and cooking. Her videos made fun of traditional cooking content and traditional skills, but she also offered up food that was appealing and easy to make, like scallion pancakes or sweet and salty roasted nuts. She sometimes posted non-recipes, like bananas with mayo. Her wildly entertaining cookingwithlynja TikTok account attracted over 20 million fans and garnered 308 million likes. Died at the age of 67."
                            95 -> "NELSON MANDELA, was a South African revolutionary and politician who radically changed the conditions of the Apartheid state of South Africa by addressing institutionalized racism and inequality. He served 27 years in prison and, upon his release in 1994, he became South Africa's first black chief executive, an office he served for five years. Died at the age of 95."
                            82 -> "NEIL ARMSTRONG, was a American astronaut, aerospace engineer, test pilot, and professor who became the first person to set foot on the moon on July 20, 1969. He spent 8 days, 14 hours, 12 minutes, and 30 seconds in space. Died at the age of 82."
                            41 -> "KOBE BRYANT, was a Legendary shooting guard who helped the Los Angeles Lakers win three straight NBA Championships from 2000 to 2002 and two more in 2009 and 2010. He was named NBA MVP in 2008 and selected to the All-NBA First Team 11 times from 2002 to 2013. Died at the age of 41."
                            20 -> "CAMERON BOYCE, was a Actor and dancer who had his breakthrough roles as a child actor in Grown Ups and Eagle Eye. He also landed starring roles as Luke Ross in the popular Disney series Jessie and Conor in Gamer's Guide to Pretty Much Everything. He played Carlos de Vil in Disney's Descendants trilogy. Died at the age of 20."
                            8 -> "OLIVIA THE CORGI, was a Popular corgi on social media who shared her adventures with her brother Hammy the Corgi. The pair built a fan base of more than 6 million followers on TikTok alone. Their hammyandolivia page has accumulated over 127 million likes. Died at the age of 8."
                            9 -> "ELLIE THE PUG, was The eldest of Daniel Middleton's famous pugs, she gained fame appearing with her fur siblings on their Instagram account EllieDarciePugs. The dogs also appear on Daniel's popular secondary YouTube channel MoreTDM. Died at the age of 9."
                            99 -> "PRINCE PHILIP, was the Duke of Edinburgh and husband of Queen Elizabeth II. He earned the distinction of being the longest-serving and oldest spouse of a reigning British monarch. Died at the age of 99."
                            else -> "Nobody known to me died at this age"
                        }
                        resultTextView.text = result
                    }
                }
            }
        }

        clearButton.setOnClickListener {
            ageEditText.text.clear()
            resultTextView.text = ""
        }
    }
}

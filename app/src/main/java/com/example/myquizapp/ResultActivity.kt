package com.example.myquizapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_result)

        val tvName: TextView = findViewById(R.id.tv_name)
        var tvScore: TextView = findViewById(R.id.tv_score)
        var btnFinish: Button = findViewById(R.id.btn_finish)

        val totalQuestions = intent.getIntExtra(Constants.TOTAL_QUESTIONS,0)
        val CorrectAnswers = intent.getIntExtra(Constants.CORRECT_ANSWERS,0)

        tvName.text = intent.getStringExtra(Constants.USER_NAME)
        tvScore.text =  "Your score is ${CorrectAnswers} out of ${totalQuestions}"

        btnFinish.setOnClickListener{
            startActivity(Intent(this,MainActivity::class.java))
        }
    }
}
package com.example.android_task_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.android_task_2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var correctAnswers:Array<String?> = arrayOfNulls(4)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root) // Sets the activity layout

        populateCorrectAnswersArray();
        setButtonListener()
    }

    fun populateCorrectAnswersArray() {
        correctAnswers[0] = resources.getString(R.string.T)
        correctAnswers[1] = resources.getString(R.string.F)
        correctAnswers[2] = resources.getString(R.string.F)
        correctAnswers[3] = resources.getString(R.string.F)
    }

    fun setButtonListener() {
        binding.btnSubmit.setOnClickListener {
            onSubmitButtonPressed();
        }
    }

    fun onSubmitButtonPressed() {
        /*
        val answers = arrayOf(binding.etAnswerRowOne.text.toString(),binding.etAnswerRowTwo.text.toString(),binding.etAnswerRowThree.text.toString(),binding.etAnswerRowFour.text.toString())
        var amountCorrect = 0;
        for (i in 0..answers.size) {
            if(answers.get(i) == correctAnswers.get(i))
            {
                amountCorrect++;
                continue;
            }
        }

        showAmountCorrect(amountCorrect); */
    }

    fun showAmountCorrect(amountCorrect: Int) {
        Toast.makeText(this, resources.getString(R.string.answers_correct, amountCorrect), Toast.LENGTH_SHORT).show();
    }
}
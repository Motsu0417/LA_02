package app.motsu.hiromoto.count

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var number:Int = 0
        numberTextView.text = "0"

        button.setOnClickListener {
            number++;
            changeNumber(number)
        }

        button2.setOnClickListener {
            number--
            changeNumber(number)
        }

        button3.setOnClickListener {
            number = 0
            numberTextView.text = "0"
        }
    }

    fun changeNumber(number:Int){
        numberTextView.text = number.toString()
        if(number % 3 == 0){
            numberTextView.setTextColor(Color.BLUE)
        }else{
            numberTextView.setTextColor(Color.BLACK)
        }
    }
}
package com.android.memorija

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import kotlinx.android.synthetic.main.activity_kenny.*
import kotlin.random.Random


var number = 0
var runnable : Runnable = Runnable {  }
var handler : Handler = Handler()
class kenny : AppCompatActivity() {
var korkoro=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kenny)
        scoree.text=korkoro.toString()

adder.setOnClickListener(){
  ++korkoro
    scoree.text=korkoro.toString()

}
         number = 0

        runnable = object : Runnable {
            override fun run() {

                number = number + 1

                    var aka=Random(100)
                rnd.text =aka.toString()
                    handler.postDelayed(this,1000)


            }

        }

        handler.post(runnable)
    }

}

package com.android.memorija

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.os.Handler
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() {
    var number = 0
    var runnable : Runnable = Runnable {  }
    var handler : Handler=Handler()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val intent=intent
       textView.text= intent.getStringExtra("user")
    }
    fun tim (view: View){
        object: CountDownTimer(10000,1000){
            override fun onFinish() {
      Toast.makeText(applicationContext,"KUKUNON",Toast.LENGTH_LONG).show()
            }

            override fun onTick(p0: Long) {
                var time=p0/1000
                textView2.text= "a $time"
            }

        }.start()
    }
    fun start(view: View) {

        number = 0

        runnable = object : Runnable {
            override fun run() {

                number = number + 1
                textView.text = "Time: $number"

                handler.postDelayed(this,1000)

            }

        }

        handler.post(runnable)


    }

    fun stop(view: View) {

        handler.removeCallbacks(runnable)
        number = 0
        textView.text = "Time: 0"

    }

}
// fun save(view : View) {
//
//        val alert = AlertDialog.Builder(this@MainActivity)
//        alert.setTitle("Save")
//        alert.setMessage("Are You Sure?")
//
//        alert.setPositiveButton("Yes") {dialog, which ->
//
//            //OnClick Listener
//            Toast.makeText(this,"Saved",Toast.LENGTH_LONG).show()
//        }
//        alert.setNegativeButton("No") {dialog, which ->
//
//            //OnClick Listener
//            Toast.makeText(applicationContext,"Not Saved",Toast.LENGTH_LONG).show()
//
//        }
//
//        alert.show()

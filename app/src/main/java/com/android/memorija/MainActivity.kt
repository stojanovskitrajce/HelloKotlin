package com.android.memorija

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
    fun go (view: View){
val intent = Intent(applicationContext,Main2Activity::class.java)
        intent.putExtra("user",editText.text.toString())
    startActivity(intent)
    }
}
//lateinit var sharedPreferences : SharedPreferences
//    var ageFromPreferences : Int? = null
//
//
//
//        //SharedPrefences Initialize
//        sharedPreferences = this.getSharedPreferences("com.atilsamancioglu.storingdata",
//            Context.MODE_PRIVATE)
//
//        ageFromPreferences = sharedPreferences.getInt("age",-1)

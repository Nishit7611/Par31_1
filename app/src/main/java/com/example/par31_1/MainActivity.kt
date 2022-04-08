package com.example.par31_1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Toast.makeText(applicationContext,"This is a OnCreate",Toast.LENGTH_LONG).show()

       Handler().postDelayed({
           var intent:Intent=Intent(applicationContext,HomeScreen::class.java)
           startActivity(intent)
           finish()

       },3000)



    }

  /*  override fun onStart() {
        super.onStart()
        Toast.makeText(applicationContext,"This is a OnStart",Toast.LENGTH_LONG).show()
    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(applicationContext,"This is a OnResume",Toast.LENGTH_LONG).show()
    }

    override fun onPause() {
        super.onPause()
        Toast.makeText(applicationContext,"This is a OnPause",Toast.LENGTH_LONG).show()
        finish()
    }


    override fun onStop() {
        super.onStop()
        Toast.makeText(applicationContext,"This is a OnStop",Toast.LENGTH_LONG).show()
    }


    override fun onRestart() {
        super.onRestart()
        Toast.makeText(applicationContext,"This is a OnRestart",Toast.LENGTH_LONG).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(applicationContext,"This is a OnDestory",Toast.LENGTH_LONG).show()
    }*/



}
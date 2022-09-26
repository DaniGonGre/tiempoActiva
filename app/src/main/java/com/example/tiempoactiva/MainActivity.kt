package com.example.tiempoactiva

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var hrInicial: Long = 0
    val t= 0;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // Imprimimos en la ventana del "Logcat"
        Log.d("Estado","onCreate")
        hrInicial = System.nanoTime()
    }

    override fun onPause() {
        super.onPause()
        // Imprimimos en la ventana del "Logcat"
        Log.d("Estado","onPause")

        val hrFinal: Long = System.nanoTime()
        val t = (hrFinal - hrInicial)/1000000000
        Log.d("Estado", "$t")
    }

    override fun onStart() {
        super.onStart()
        // Imprimimos en la ventana del "Logcat"
        Log.d("Estado","onStart")
    }

    override fun onResume() {
        super.onResume()
        // Imprimimos en la ventana del "Logcat"
        Log.d("Estado","onResume")
    }

    override fun onStop() {
        super.onStop()
        // Imprimimos en la ventana del "Logcat"
        Log.d("Estado","onPause")

    }

    override fun onRestart() {
        super.onRestart()
        // Imprimimos en la ventana del "Logcat"
        Log.d("Estado","onDestroy")
    }

    override fun onDestroy() {
        super.onDestroy()
        // Imprimimos en la ventana del "Logcat"
        Log.d("Estado","onDestroy")
    }
}
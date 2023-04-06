package com.example.modul2_no1

import android.annotation.SuppressLint
import android.os.Build.VERSION_CODES.R
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.LinkMovementMethod
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);
        setContentView(com.example.modul2_no1.R.layout.activity_main);

        val yt = findViewById<TextView>(com.example.modul2_no1.R.id.youtube)
        yt.movementMethod = LinkMovementMethod.getInstance()

        val ht = findViewById<TextView>(com.example.modul2_no1.R.id.history)
        ht.movementMethod = LinkMovementMethod.getInstance()

        val sp = findViewById<TextView>(com.example.modul2_no1.R.id.spotify)
        sp.movementMethod = LinkMovementMethod.getInstance()

        val mv = findViewById<TextView>(com.example.modul2_no1.R.id.mv)
        mv.movementMethod = LinkMovementMethod.getInstance()


    }
}
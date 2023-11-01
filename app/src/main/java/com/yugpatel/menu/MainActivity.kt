package com.yugpatel.menu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    val customMenu=CustomMenu()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val showPopup=findViewById<Button>(R.id.button)
        showPopup.setOnClickListener {
            customMenu.customMenu(this,it)
        }
    }
}
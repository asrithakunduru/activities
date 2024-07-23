package com.example.activities

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import androidx.activity.enableEdgeToEdge

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val etUserMessage: EditText = findViewById(R.id.etUserMessage)
        val btnSendMsgToSecondActivity: Button = findViewById(R.id.btnSendMsgToSecondActivity)
        val btnSendMsgToThirdActivity: Button = findViewById(R.id.btnSendMsgToThirdActivity)

        btnSendMsgToSecondActivity.setOnClickListener {
            val message: String = etUserMessage.text.toString()
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("key", message)
            startActivity(intent)
        }

        btnSendMsgToThirdActivity.setOnClickListener {
            val message: String = etUserMessage.text.toString()
            val intent = Intent(this, ThirdActivity::class.java)
            intent.putExtra("key", message)
            startActivity(intent)
        }
    }
}

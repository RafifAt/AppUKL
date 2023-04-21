package com.example.appukl

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract.CommonDataKinds.Email
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

private lateinit var email: EditText
private lateinit var pass: EditText
private lateinit var btnSubmit: Button

private val EMAIL = ""
private val PASS = ""

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        email = findViewById<EditText>(R.id.textEmail)
        pass = findViewById<EditText>(R.id.textPassword)
        btnSubmit = findViewById<Button>(R.id.btnSubmit)

        val btnMove: Button = findViewById(R.id.btnapple)
        btnMove.setOnClickListener(this)

        btnSubmit.setOnClickListener {
            try {
                val Email = email.text.toString()
                val Pass = pass.text.toString()
                if (Email.isNotBlank() && Pass.isNotBlank()) {
                    val i = Intent(this, HomeActivity::class.java)
                    i.putExtra(EMAIL, Email)
                    i.putExtra(PASS, Pass)
                    startActivity(i)
                }else{
                    Toast.makeText(applicationContext, "PLEASE INPUT EMAIL", Toast.LENGTH_SHORT)
                        .show()
                }
            } catch (e: Exception) {

                e.printStackTrace()
                Toast.makeText(applicationContext, "TRY AGAIN",Toast.LENGTH_SHORT).show()
            }
        }
    }
    override fun onClick(v: View) {
       when (v.id){
           R.id.btnapple ->{
               val moveIntent = Intent(this@MainActivity, HomeActivity::class.java)
               startActivity(moveIntent)
           }
           R.id.btnfacebook ->{
               val moveIntent = Intent(this@MainActivity, HomeActivity::class.java)
               startActivity(moveIntent)
           }
           R.id.btngoogle ->{
               val moveIntent = Intent(this@MainActivity, HomeActivity::class.java)
               startActivity(moveIntent)
           }
       }
    }

}
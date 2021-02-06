package com.example.finals1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var auth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
    }
    private fun init() {
        auth = Firebase.auth
        signUp.setOnClickListener(){
            SignUp()

        }
    }
    private fun SignUp() {
        val email  = emailInput.text.toString()
        val password = passwordInput.text.toString()
        val repeatPassword = repeatInput.text.toString()
        if (email.isNotEmpty() && password.isNotEmpty() && repeatPassword.isNotEmpty()){
            if (password == repeatPassword){
                val intent = Intent(this, MainPage::class.java)
                startActivity(intent)
                Toast.makeText(this, "Registration successful!", Toast.LENGTH_SHORT).show()
                auth.createUserWithEmailAndPassword(email, password)
                    .addOnCompleteListener(this) { task ->
                        if (task.isSuccessful) {
                            // Sign in success, update UI with the signed-in user's information
                            Log.d("signUp", "createUserWithEmail:success")
                            val user = auth.currentUser
                        } else {
                            // If sign in fails, display a message to the user.
                            Log.d("signUp", "createUserWithEmail:failure", task.exception)
                            Toast.makeText(baseContext, "Authentication failed.",
                                Toast.LENGTH_SHORT).show()
                        }
                    }

            }else {
                Toast.makeText(this, "Passwords must match!", Toast.LENGTH_SHORT).show()
            }
        }else{
            Toast.makeText(this, "All fields must be filled!", Toast.LENGTH_SHORT).show()
        }
    }
}
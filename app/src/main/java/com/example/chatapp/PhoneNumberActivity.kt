package com.example.chatapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.chatapp.databinding.ActivityPhoneNumberBinding
import com.google.firebase.auth.FirebaseAuth

class PhoneNumberActivity : AppCompatActivity() {
    private lateinit var binding: ActivityPhoneNumberBinding
    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPhoneNumberBinding.inflate(layoutInflater)
        setContentView(binding.root)
        auth = FirebaseAuth.getInstance()
        CommonMethods.hideActionBar(supportActionBar)
        initViews()
    }

    private fun initViews() {
        binding.etPhoneNo.requestFocus()
        binding.btnContinue.setOnClickListener {
            // Start OTP activity
        }
    }
}
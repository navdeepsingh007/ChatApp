package com.example.chatapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.chatapp.databinding.ActivityOtpBinding
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.PhoneAuthOptions
import com.google.firebase.auth.PhoneAuthProvider
import java.util.concurrent.TimeUnit

class OtpActivity: AppCompatActivity() {
    private lateinit var binding: ActivityOtpBinding
    private lateinit var auth: FirebaseAuth
    private val FIREBASE_TIMEOUT = 30L

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOtpBinding.inflate(layoutInflater)
        setContentView(binding.root)
        auth = FirebaseAuth.getInstance()
        CommonMethods.hideActionBar(supportActionBar)
    }

    private fun authenticatePhoneNo(phoneNo: String) {
        val builder = PhoneAuthOptions.newBuilder()
            .setPhoneNumber(phoneNo)
            .setTimeout(FIREBASE_TIMEOUT, TimeUnit.SECONDS)
            .setActivity(this)
//            .setCallbacks(object: PhoneAuthProvider.OnVerificationStateChangedCallbacks {
//
//            })
    }
}
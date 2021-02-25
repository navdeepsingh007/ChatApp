package com.example.chatapp

import androidx.appcompat.app.ActionBar

class CommonMethods {

    companion object Factory {
        fun hideActionBar(supportActionBar: ActionBar?) {
            supportActionBar?.hide()
        }
    }
}
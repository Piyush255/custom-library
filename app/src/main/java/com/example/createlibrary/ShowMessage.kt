package com.example.createlibrary

import android.content.Context
import android.widget.Toast

class ShowMessage {
    fun showMessage(context : Context) {
        Toast.makeText(context, "this custom library view", Toast.LENGTH_SHORT).show()
    }
}
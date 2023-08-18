package com.example.kotlin_101

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.user_login_ui)


        window.decorView.rootView.setOnTouchListener(View.OnTouchListener{view, motionEvent ->
            Toast.makeText(this, "Ekrana Dokunuldu", Toast.LENGTH_SHORT).show()
            return@OnTouchListener true
        })

    }
    fun button2(view: View) {
       Toast.makeText(this, "Giriş yapıldı", Toast.LENGTH_LONG).show()
    }


}
package com.example.practica20

import android.health.connect.datatypes.units.Length
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.material3.Snackbar
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
    fun f(view: View){
        Snackbar.make(view,"Meow",Snackbar.LENGTH_LONG).show()
    }
    fun ff(fffjhhghgh: View){
        var fu = Snackbar.make(fffjhhghgh,"Woof",Snackbar.LENGTH_LONG)
        fu.show()
        fu.setAction("woof woof"){

        }
    }
    fun fff(view: View){
        var fuu = Snackbar.make(view,"Muuuu",Snackbar.LENGTH_LONG)
        fuu.show()
        fuu.setAction("Muuu"){
            Snackbar.make(view,"Muuuuuuu",Snackbar.LENGTH_LONG).show()

        }
    }

}
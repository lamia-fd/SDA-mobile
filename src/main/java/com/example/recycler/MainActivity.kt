package com.example.recycler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.snackbar.Snackbar
import android.text.Layout as Layout1

class MainActivity : AppCompatActivity() {
    val userInput = ArrayList<String>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val layout= this.findViewById<ConstraintLayout>(R.id.layout)
        val myRv =findViewById<RecyclerView>(R.id.rvMain)
        val button1=findViewById<Button>(R.id.button)
        val name = findViewById<EditText>(R.id.Name).text


        button1.setOnClickListener{


                userInput.add(name.toString())

                name.clear()

              ///  Snackbar.make(layout,"enter a name pleas!!",Snackbar.LENGTH_LONG)




        }

        myRv.adapter= recyclerView(userInput)
        myRv.layoutManager=LinearLayoutManager(this)

    }
}

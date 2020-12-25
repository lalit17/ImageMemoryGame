package com.example.imagememorygame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    // "lateinit" mean later declaration of variable in KOTLIN
    // Declaring UI element globally in KOTLIN
    private lateinit var recyclerView:RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Assigning object in UI variable
        recyclerView=findViewById(R.id.recyclerView);

        /*
            # In KOTLIN we never use "NEW" keyword like JAVA to declare OBJECT
            # spanCount -> no. of column
        * */
        recyclerView.layoutManager = GridLayoutManager(this, 2)
        

    }
}
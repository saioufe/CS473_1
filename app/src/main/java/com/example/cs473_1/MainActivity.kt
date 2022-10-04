package com.example.cs473_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Debug
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    var foods:MutableList<String> = mutableListOf("Hamburger" ,"Pizza" , "Mexican", "American",  "Chinese")
    lateinit var textSelectedView : TextView
    lateinit var editTextAddFood :EditText
    lateinit var btn_add:Button
    lateinit var btn_decide:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textSelectedView = findViewById(R.id.selectedFood)
        editTextAddFood = findViewById(R.id.addFoodEditText)
        btn_add = findViewById(R.id.btn_add)
        btn_decide = findViewById(R.id.btm_decide)


        btn_add.setOnClickListener(){
            if(editTextAddFood.text.isNotEmpty()){
                foods.add(editTextAddFood.text.toString())
                Toast.makeText(this,"Food Type have been added",Toast.LENGTH_SHORT).show()
                editTextAddFood.setText("")
            }
        }

        btn_decide.setOnClickListener(){
            var selectedFood:String = foods.random() //  = foods.get(Random(foods.size).nextInt())
            println(selectedFood + " this is the selected Food")
            textSelectedView.text = selectedFood
        }
    }


}
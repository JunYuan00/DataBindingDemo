package com.example.databindingdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.example.databindingdemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    //create an var bind to activity main
    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Way 2
        //bind to res > layout > activity main
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        //Assign in array
        //Student s = new Student();
        val s: Student = Student("W123456","Alibaba")
        binding.student = s

        binding.btnUpdate.setOnClickListener(){

            s.name = "Alex"

            binding.apply {
                invalidateAll()
            }

        }
        //binding.tvStudentName.text = s.name
        //binding.tvStudentID.text = s.id

        //Assign one by one
        //binding.tvStudentName.text = "Ali"
        //binding.tvStudentID.text = "W123456"

        //Way 1
        //val tvName: TextView = findViewById(R.id.tvStudentName)
        //tvName.text = "Ali"
    }
}
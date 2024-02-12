package com.josimarferreira.ativprat11ativ5

import android.annotation.SuppressLint
import android.graphics.Typeface
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.get
import com.josimarferreira.ativprat11ativ5.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {
    
    private var selectedAppetizer : Int? = null
    private var selectedMainCourse: Int? = null
    private var selectedDessert   : Int? = null
    private var selectedDrinks    : Int? = null

    private var valueAppetizer : Float = 0f
    private var valueMainCourse: Float = 0f
    private var valueDessert   : Float = 0f
    private var valueDrinks    : Float = 0f

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnCalcular.setOnClickListener {

            selectedAppetizer = binding.rdgAppetizer.checkedRadioButtonId
            selectedMainCourse = binding.rdgMainCourse.checkedRadioButtonId
            selectedDessert = binding.rdgDessert.checkedRadioButtonId
            selectedDrinks = binding.rdgDrinks.checkedRadioButtonId

            this.onClick()

        }

    }

    private fun onClick() {

        selectedAppetizer = binding.rdgAppetizer.checkedRadioButtonId

        valueAppetizer = when (selectedAppetizer){
            binding.rbAppetizer1.id -> 25.6f
            binding.rbAppetizer2.id -> 28.3f
            binding.rbAppetizer3.id -> 22.3f
            binding.rbAppetizer4.id -> 25.86f
            else -> {0.0f}
        }

        selectedMainCourse = binding.rdgMainCourse.checkedRadioButtonId

        valueMainCourse = when (selectedMainCourse) {
            binding.rbMainCourse1.id -> 125.86f
            binding.rbMainCourse2.id -> 105.80f
            binding.rbMainCourse3.id -> 115.56f
            binding.rbMainCourse4.id -> 15.67f
            else -> {
                0.0f
            }
        }

        selectedDessert = binding.rdgDessert.checkedRadioButtonId

        valueDessert = when (selectedDessert) {
            binding.rbDessert1.id -> 25.86f
            binding.rbDessert2.id -> 25.56f
            binding.rbDessert3.id -> 25.56f
            binding.rbDessert4.id -> 12.56f
            else -> {
                0.0f
            }
        }

        selectedDrinks = binding.rdgDrinks.checkedRadioButtonId

        valueDrinks = when (selectedDrinks) {
            binding.rbDrink1.id -> 7.0f
            binding.rbDrink2.id -> 175.37f
            binding.rbDrink3.id -> 225.56f
            binding.rbDrink4.id -> 12.56f
            else -> {
                0.0f
            }
        }

        binding.txtTotal.text = "R$ ${String.format("%.2f", calculate())}"

    }

    private fun calculate():Float{
        return valueAppetizer+valueMainCourse+valueDessert+valueDrinks
    }

    override fun onClick(v: View?) {
        TODO("Not yet implemented")
    }

}
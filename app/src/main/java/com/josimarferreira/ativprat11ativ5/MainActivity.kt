package com.josimarferreira.ativprat11ativ5

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
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

            onClick()

        }

    }

    @SuppressLint("SetTextI18n")
    private fun onClick() {

        selectedAppetizer = binding.rdgAppetizer.checkedRadioButtonId

        valueAppetizer = when (selectedAppetizer){
            2131231075 -> 25.6f
            2131231076 -> 28.3f
            2131231077 -> 22.3f
            2131231078 -> 25.86f
            else -> {0.0f}
        }

        selectedMainCourse = binding.rdgMainCourse.checkedRadioButtonId

        valueMainCourse = when (selectedMainCourse) {
            2131231087 -> 125.86f
            2131231088 -> 105.80f
            2131231089 -> 115.56f
            2131231090 -> 15.67f
            else -> {
                0.0f
            }
        }

        selectedDessert = binding.rdgDessert.checkedRadioButtonId

        valueDessert = when (selectedDessert) {
            2131231079 -> 25.86f
            2131231080 -> 25.56f
            2131231081 -> 25.56f
            2131231082 -> 12.56f
            else -> {
                0.0f
            }
        }

        selectedDrinks = binding.rdgDrinks.checkedRadioButtonId

        valueDrinks = when (selectedDrinks) {
            2131231083 -> 7.0f
            2131231084 -> 175.37f
            2131231085 -> 225.56f
            2131231086 -> 12.56f
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
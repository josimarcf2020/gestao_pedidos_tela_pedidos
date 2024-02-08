package com.josimarferreira.ativprat11ativ5

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.josimarferreira.ativprat11ativ5.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private var valueAppetizer: Float = 0f
    private var valueMainCourse:Float = 0f
    private var valueDessert:   Float = 0f
    private var valueDrinks:    Float = 0f

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.rdgAppetizer.setOnClickListener(this)
        binding.rdgMainCourse.setOnClickListener(this)
        binding.rdgDessert.setOnClickListener(this)
        binding.rdgDrinks.setOnClickListener(this)

    }

    override fun onClick(view: View?) {
        if (binding.rdgAppetizer.isActivated){
            valueAppetizer = when (binding.rdgAppetizer.checkedRadioButtonId){
                 0 -> 25.6f
                 1 -> 28.3f
                 2 -> 22.3f
                 3 -> 25.86f
                else -> {0.0f}
            }
        }

        if (binding.rdgMainCourse.isActivated){
            valueMainCourse = when (binding.rdgMainCourse.checkedRadioButtonId){
                0 -> 125.86f
                1 -> 105.80f
                2 -> 115.56f
                3 -> 15.67f
                else -> {0.0f}
            }
        }

        if (binding.rdgDessert.isActivated){
            valueDessert = when (binding.rdgDessert.checkedRadioButtonId){
                0 -> 25.86f
                1 -> 25.56f
                2 -> 25.56f
                3 -> 12.56f
                else -> {0.0f}
            }
        }

        if (binding.rdgDrinks.isActivated){
            valueDrinks = when (binding.rdgDrinks.checkedRadioButtonId){
                0 -> 7.0f
                1 -> 175.37f
                2 -> 225.56f
                3 -> 12.56f
                else -> {0.0f}
            }
        }

        Toast.makeText(this, calculate().toString(), Toast.LENGTH_LONG).show()
    }

    private fun calculate(): Float {
        return valueAppetizer + valueDessert + valueDrinks + valueMainCourse
    }

}
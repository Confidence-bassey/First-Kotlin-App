package com.confidenceb.firstkotlinandroidproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.core.graphics.toColorInt
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    private lateinit var oValue:TextView
    private lateinit var iValue:TextView
    private lateinit var btn:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btn = findViewById(R.id.doubleBtn)
        oValue = findViewById<TextView>(R.id.numberDisp);
        iValue = findViewById(R.id.numberDispT)

        btn.setOnClickListener { view ->
            val a = Integer.parseInt(oValue.text.toString()).toInt()
            //val c = oValue.text.toString().toColorInt()
            val d = Integer.parseInt(iValue.text.toString()).toInt()
            val b = a*2
            val c = d+2
            oValue.text = b.toString()
            iValue.text = c.toString()
            Snackbar.make(view, "Value $a changed to $b and Value $d changed to $c", Snackbar.LENGTH_LONG)
            //.setAction("Action", null)
            .show()
        }
    }
}
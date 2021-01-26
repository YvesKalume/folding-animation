package com.yvkalume.foldinanimation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.button.MaterialButton
import com.ramotion.foldingcell.FoldingCell

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fc = findViewById<FoldingCell>(R.id.folding_cell)
        val btnSee = findViewById<MaterialButton>(R.id.btnSee)
        val btnClose = findViewById<MaterialButton>(R.id.btnClose)
        btnSee.setOnClickListener {
            fc.toggle(false)
        }

        btnClose.setOnClickListener {
            fc.toggle(false)
        }
    }
}
package com.beatrice.gridlayoutexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.beatrice.simplecard.SimpleCard
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val simpleCard = findViewById<SimpleCard>(R.id.myCard)
        simpleCard.setLabelText("Hp Laptop")
        simpleCard.setValueText("Ksh.50000")

        val simpleCard1 = findViewById<SimpleCard>(R.id.myCard1)
        simpleCard1.setLabelText("Dell")
        simpleCard1.setValueText("Ksh.70000")

        val simpleCard2 = findViewById<SimpleCard>(R.id.myCard2)
        simpleCard2.setLabelText("MacBook")
        simpleCard2.setValueText("KSh.200000")
    }
}

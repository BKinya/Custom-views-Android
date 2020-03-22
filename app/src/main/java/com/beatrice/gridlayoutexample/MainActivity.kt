package com.beatrice.gridlayoutexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.beatrice.simplecard.CardItem

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val simpleCard = findViewById<CardItem>(R.id.myCard)
        simpleCard.setLabelText("Today")
        simpleCard.setValueText("20")

        val simpleCard1 = findViewById<CardItem>(R.id.myCard1)
        simpleCard1.setLabelText("This Week")
        simpleCard1.setValueText("240")

        val simpleCard2 = findViewById<CardItem>(R.id.myCard2)
        simpleCard2.setLabelText("This Month")
        simpleCard2.setValueText("600")
    }
}

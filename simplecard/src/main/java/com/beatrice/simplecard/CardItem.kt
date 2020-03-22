package com.beatrice.simplecard

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import androidx.cardview.widget.CardView
import kotlinx.android.synthetic.main.simple_card.view.*

class CardItem @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
     defStyleAttr: Int = 0
) : CardView(context, attrs, defStyleAttr) {

    init {
        val inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        inflater.inflate(R.layout.simple_card, this)
    }

    fun setLabelText(label : String){
        labelTxtView.setText(label)
    }

    fun setValueText(value: String){
        valueTxtView.setText(value)
    }
}
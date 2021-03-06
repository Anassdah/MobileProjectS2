package com.example.myapplication

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.text.SpannableString
import android.text.Spanned
import android.text.style.ForegroundColorSpan
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

//salam
//wa3alaykom salammm
class MainActivity : AppCompatActivity() {
    fun openActivity2(){
        val intent =Intent(this,MainActivity2::class.java)
        startActivity(intent)

    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val textview : TextView = findViewById(R.id.text_view )
        val button: Button=findViewById(R.id.start_app)
        button.setOnClickListener { openActivity2() }
        val text ="  WELCOME \n         TO \n BARCELONA"
        val ss = SpannableString(text)
        val rdB : ForegroundColorSpan= ForegroundColorSpan(Color.parseColor("#008B8B"))
        //A
        val ylA : ForegroundColorSpan= ForegroundColorSpan(Color.parseColor("#008B8B"))
        val rd1R : ForegroundColorSpan= ForegroundColorSpan(Color.parseColor("#008B8B"))
        val yl1C : ForegroundColorSpan= ForegroundColorSpan(Color.parseColor("#008B8B"))
        val rd2E : ForegroundColorSpan= ForegroundColorSpan(Color.parseColor("#FFA500"))
        val yl2 : ForegroundColorSpan= ForegroundColorSpan(Color.parseColor("#FFA500"))
        val rd3 : ForegroundColorSpan= ForegroundColorSpan(Color.parseColor("#FFA500"))
        val yl3 : ForegroundColorSpan= ForegroundColorSpan(Color.parseColor("#FFA500"))
        val rd4 : ForegroundColorSpan= ForegroundColorSpan(Color.parseColor("#FFA500"))


        //welco
        val bl = ForegroundColorSpan(Color.parseColor("#FFA500"))
        //me
        val me = ForegroundColorSpan(Color.parseColor("#008B8B"))
        //to
        val to = ForegroundColorSpan(Color.parseColor("#FFA500"))

        ss.setSpan(rdB,24,26, Spanned.SPAN_INCLUSIVE_EXCLUSIVE)
        ss.setSpan(ylA,26,27, Spanned.SPAN_INCLUSIVE_EXCLUSIVE)
        ss.setSpan(rd1R,27,28, Spanned.SPAN_INCLUSIVE_EXCLUSIVE)
        ss.setSpan(yl1C,28,29, Spanned.SPAN_INCLUSIVE_EXCLUSIVE)
        ss.setSpan(rd2E,29,30, Spanned.SPAN_INCLUSIVE_EXCLUSIVE)
        ss.setSpan(yl2,30,31, Spanned.SPAN_INCLUSIVE_EXCLUSIVE)
        ss.setSpan(rd3,31,32, Spanned.SPAN_INCLUSIVE_EXCLUSIVE)
        ss.setSpan(yl3,32,33, Spanned.SPAN_INCLUSIVE_EXCLUSIVE)
        ss.setSpan(rd4,33,34, Spanned.SPAN_INCLUSIVE_EXCLUSIVE)
        ss.setSpan(bl,0,5, Spanned.SPAN_INCLUSIVE_EXCLUSIVE)
        ss.setSpan(me,5,20, Spanned.SPAN_INCLUSIVE_EXCLUSIVE)
        ss.setSpan(to,20,24, Spanned.SPAN_INCLUSIVE_EXCLUSIVE)






        textview.text = ss
        /**
         * This is for gradient color "#2AF598"
         */
/*        val paint = text_view.paint
        val width = paint.measureText(text_view.text.toString())
        val textShader: Shader = LinearGradient(0f, 0f, width, text_view.textSize, intArrayOf(
                Color.parseColor("#100680"),
                Color.parseColor("#2AF598"),
                /*Color.parseColor("#64B678"),
                Color.parseColor("#478AEA"),*/
                Color.parseColor("#8446CC")
        ), null, Shader.TileMode.REPEAT)

        text_view.paint.shader = textShader
*/
    }

}
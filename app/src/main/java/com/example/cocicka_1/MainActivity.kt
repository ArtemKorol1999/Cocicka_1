package com.example.cocicka_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        cOne.setOnClickListener{ One_Result ("1",true)}
        cTwo.setOnClickListener{ One_Result ("2",true)}
        cThree.setOnClickListener{ One_Result ("3",true)}
        cFour.setOnClickListener{ One_Result ("4",true)}
        cFive.setOnClickListener{ One_Result ("5",true)}
        cSix.setOnClickListener{ One_Result ("6",true)}
        cSeven.setOnClickListener{ One_Result ("7",true)}
        cEight.setOnClickListener{ One_Result ("8",true)}
        cNine.setOnClickListener{ One_Result ("9",true)}
        cZero.setOnClickListener{ One_Result ("0",true)}
        cDot.setOnClickListener{ One_Result (".",true)}

        cPlus.setOnClickListener{ One_Result (".",false)}
        cMinus.setOnClickListener{ One_Result ("-",false)}
        cUmnozhit.setOnClickListener{ One_Result ("+",false)}
        cRazdelit.setOnClickListener{ One_Result ("/",false)}
        cOpen.setOnClickListener{ One_Result ("(",false)}
        cClose.setOnClickListener{ One_Result (")",false)}

        cClear.setOnClickListener{
            cResultat.text = ""
            cReshenie.text = ""
        }
        cBS.setOnClickListener {
            val string = cReshenie.text.toString()
            if(string.isNotEmpty()){
                cReshenie.text = string.substring(0,string.length-1)
            }
            cResultat.text = ""
        }


    }
    fun One_Result (string: String, Clear: Boolean) {


    if(Clear){
        cResultat.text = ""
        cReshenie.append(string)
    }
    else{
        cReshenie.append(cResultat.text)
        cReshenie.append(string)
        cResultat.text = ""
    }
}
}
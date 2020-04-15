package com.omar.calculater

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
var d=0
    var oldnumber:Double?=null
    var flag=false
    var content_text:String?=null
    var op=""
    fun button_click(view: View){
        if(d==0){
            content_text=""
            d++
        }else{
       content_text =ET.text.toString()}
        var button=view as Button
        when(button.id) {
            but1.id -> {
                content_text += "1"
            }
            but2.id -> {
                content_text += "2"
            }
            but3.id -> {
                content_text += "3"
            }
            but4.id -> {
                content_text += "4"
            }
            but5.id -> {
                content_text += "5"
            }
            but6.id -> {
                content_text += "6"
            }
            but7.id -> {
                content_text += "7"
            }
            but8.id -> {
                content_text += "8"
            }
            but9.id -> {
                content_text += "9"
            }
            but0.id -> {
                content_text += "0"
            }
            but_minus.id -> {
                content_text = "-"+content_text
            }
            but_dot.id -> {
                content_text += "."
            }

        }
        ET.setText(content_text)
    }




    fun operation_click(view:View){
        var button=view as Button
        when(button.id) {
            but_add.id->{
                if(content_text==""){
                    Toast.makeText(this,"can not it",Toast.LENGTH_SHORT).show()
                }
                else{
                if(!flag){
                    oldnumber=content_text!!.toDouble()
                    content_text=""
                    ET.setText(content_text)

                    flag=true
                }
                else{
                oldnumber=oldnumber!!+content_text!!.toDouble()
                content_text=""
                ET.setText(content_text!!)}
                op="+"
            }}
            but_mult.id->{
                if(content_text==""){
                    Toast.makeText(this,"can not it",Toast.LENGTH_SHORT).show()
                }
                else{
                if(!flag){
                    oldnumber=content_text!!.toDouble()
                    content_text=""
                    ET.setText(content_text!!)
                    flag=true
                }
                else{
                oldnumber=oldnumber!!*content_text!!.toDouble()
                content_text=""
                ET.setText(content_text!!)
                }}
                op="*"
            }
            but_div.id->{
                if(content_text==""){
                    Toast.makeText(this,"can not it",Toast.LENGTH_SHORT).show()
                }
                else{
                if(!flag) {
                    oldnumber = content_text!!.toDouble()
                    content_text = ""
                    ET.setText(content_text)
                    flag=true
                }
                else{
                    oldnumber = oldnumber!!/content_text!!.toDouble()
                    content_text = ""
                    ET.setText(content_text)
                }}
                op="/"
            }
            but_subtract.id->{
                if(content_text==""){
                    Toast.makeText(this,"can not it",Toast.LENGTH_SHORT).show()
                }
                else{
                if(!flag){
                oldnumber=oldnumber!!-content_text!!.toDouble()
                content_text=""
                ET.setText(content_text)
                flag=true
                }
                else
                {
                    oldnumber=content_text!!.toDouble()
                    content_text=""
                    ET.setText(content_text)
                }}
                op="-"

            }
           but_persnt.id->{
           }



            }

        }

    fun equal_and_erase_click(view:View){
        var button=view as Button
        when(button.id){
            but_equal.id->{
                when(op){
                    "+"->oldnumber=oldnumber!!+content_text!!.toDouble()
                    "*"->oldnumber=oldnumber!!*content_text!!.toDouble()
                    "/"->oldnumber=oldnumber!!/content_text!!.toDouble()
                    "-"->oldnumber=oldnumber!!-content_text!!.toDouble()
                }



                ET.setText(oldnumber.toString())
                oldnumber=0.0
                flag=false
                content_text=""

            }
            but_erase.id->{
                ET.setText("")
                oldnumber=0.0
                flag=false
            }

        }
    }


    }


package com.example.project

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.io.File
import java.io.IOException
import java.io.InputStream


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val exmmplist = generateList()
        
   val  recycler_view = findViewById<RecyclerView>(R.id.recycler_view)
        recycler_view.adapter = myadapter(exmmplist)
        recycler_view.layoutManager = LinearLayoutManager(this)
        recycler_view.setHasFixedSize(true)
    }

    private fun generateList(): List<items> {
        var text : String? = null
        var string: String = ""
        var  Array: List<String> = emptyList()
        val Arry = arrayListOf<Int>()

        val list = ArrayList<items>()

        try {
            val inputStream: InputStream = assets.open("dictionnaire.txt")
            text = inputStream.bufferedReader().use { it.readText() }
          string = text
            Array = string.split(":")
        } catch (e : IOException){

        }

            for (i in 0 until Array.count()-1 step  2) {
                var j = 0
            val drawable = R.drawable.flesh
 val item = items(drawable, Array[i], Array[i+1])
                j=j+1
                list += item
        }
        return list
    }
}
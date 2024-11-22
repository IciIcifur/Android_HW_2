package com.example.hw_2

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var stickerList: ArrayList<StickerModel>
    lateinit var imageList: Array<Int>
    lateinit var titleList: Array<String>
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)


        imageList = arrayOf(
            R.drawable.s1,
            R.drawable.s2,
            R.drawable.s3,
            R.drawable.s4,
            R.drawable.s5,
            R.drawable.s6,
            R.drawable.s7,
            R.drawable.s8,
            R.drawable.s9,
            R.drawable.s10,
            R.drawable.s11,
            R.drawable.s12,
            R.drawable.s13,
            R.drawable.s14,
            R.drawable.s15,
            R.drawable.s16,
            R.drawable.s17,
            R.drawable.s18,
            R.drawable.s19,
            R.drawable.s20,
            R.drawable.s21,
            R.drawable.s22,
            R.drawable.s23,
            R.drawable.s24,
            R.drawable.s25,
            R.drawable.s26,
            )
        titleList = arrayOf(
            "Note",
            "Note",
            "Sticker",
            "Flower",
            "Note",
            "Sticker",
            "Flower",
            "Note",
            "Note",
            "Note",
            "Note",
            "Note",
            "Note",
            "Note",
            "Note",
            "Note",
            "Note",
            "Painting",
            "Eye",
            "Eyes",
            "Eyes",
            "Eye",
            "Eye",
            "Hands",
            "Hands",
            "Lips",
        )

        recyclerView = findViewById(R.id.myRecyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)

        stickerList = arrayListOf<StickerModel>()
        getStickers()

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    private fun getStickers() {
        for (i in imageList.indices) {
            val stickerModel = StickerModel(titleList[i], imageList[i])
            stickerList.add(stickerModel)
        }
        recyclerView.adapter = StickerAdapter(stickerList)
    }
}
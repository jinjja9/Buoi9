package com.example.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val items = listOf(
            Pair(
                "Ban điều hành",
                listOf(R.drawable.bdh1, R.drawable.bdh2, R.drawable.bdh3, R.drawable.bdh4)
            ),
            Pair(
                "Ban đào tạo",
                listOf(R.drawable.bdt1, R.drawable.bdt2, R.drawable.bdt3, R.drawable.bdt4)
            ),
            Pair(
                "Ban truyền thông",
                listOf(R.drawable.btt1, R.drawable.btt2, R.drawable.btt3, R.drawable.btt4)
            ),
            Pair(
                "Ban sự kiện",
                listOf(R.drawable.bsk1, R.drawable.bsk2, R.drawable.bsk3, R.drawable.bsk4)
            )
        )

        val adapter = CycleAdapter(items)
        recyclerView.adapter = adapter
    }
}

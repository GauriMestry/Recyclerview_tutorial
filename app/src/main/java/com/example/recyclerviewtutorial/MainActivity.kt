package com.example.recyclerviewtutorial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var mRecyclerView: RecyclerView
    private lateinit var mRecyclerAdapter: RecyclerAdapter
    private var itemList=ArrayList<ListModel>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mRecyclerView=findViewById(R.id.recyclerview)
        mRecyclerView.hasFixedSize()
        mRecyclerView.layoutManager=LinearLayoutManager(applicationContext)


        itemList.add(ListModel("item1"))
        itemList.add(ListModel("item2"))
        itemList.add(ListModel("item3"))
        itemList.add(ListModel("item4"))
        itemList.add(ListModel("item5"))
        itemList.add(ListModel("item6"))
        itemList.add(ListModel("item7"))
        itemList.add(ListModel("item8"))
        itemList.add(ListModel("item9"))
        itemList.add(ListModel("item10"))


        mRecyclerAdapter= RecyclerAdapter(itemList)
        mRecyclerView.adapter=mRecyclerAdapter

    }
}
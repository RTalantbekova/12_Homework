package com.example.l12_homework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private var recycleView : RecyclerView? = null
    private var btnDelete : Button? = null
    val adapter = RecycleAdapter()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
        setupRecyclerView()
        showData()
        onClick()
    }

    private fun initViews(){

        recycleView = findViewById(R.id.recyclerView)
        btnDelete = findViewById(R.id.btnDelete)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_add, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.btn_add -> adapter.add(ItemData("Android's sport 1", "Excercise 1"))
        }
        return super.onOptionsItemSelected(item)
    }

    private fun onClick(){
        btnDelete?.setOnClickListener {
            adapter.delete(0)
        }
    }

    private fun setupRecyclerView(){
        recycleView?.adapter = adapter
        adapter.update(showData())
    }

    private fun showData(): ArrayList<ItemData> {
        val list = arrayListOf<ItemData>()

        for (i in 1..20){
            list.add(ItemData("Android's sport $i", "Exercise $i"))
        }
        return list
    }
}
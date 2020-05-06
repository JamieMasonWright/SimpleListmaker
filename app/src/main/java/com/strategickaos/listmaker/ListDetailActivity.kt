package com.strategickaos.listmaker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import kotlinx.android.synthetic.main.activity_list_detail.*

class ListDetailActivity : AppCompatActivity() {

    lateinit var list : TaskList
    lateinit var listItemsRecyclerView : RecyclerView
    lateinit var addTaskButton : FloatingActionButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_detail)

        listItemsRecyclerView = findViewById(R.id.list_items_recyclerview)
        listItemsRecyclerView .adapter = ListItemsRecyclerViewAdapter(list)
        listItemsRecyclerView.layoutManager = LinearLayoutManager(this)

        list = intent.getParcelableExtra(MainActivity.INTENT_LIST_KEY)

        title = list.name

        addTaskButton = findViewById(R.id.add_task_button)
        addTaskButton.setOnClickListener{
            showCreateTaskDialog()
        }
    }

    private fun showCreateTaskDialog(){

    }
}

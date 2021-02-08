package com.peculiaruc.notesapp.fragments.tasks

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.peculiaruc.notesapp.R
import com.peculiaruc.notesapp.adapter.BaseRecyclerAdapter
import com.peculiaruc.notesapp.model.Task


class TasksAdapter(taskList: MutableList<Task> = mutableListOf() ) :
       BaseRecyclerAdapter<Task>(taskList) {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder
            = ViewHolder( LayoutInflater.from(parent.context).inflate(R.layout.list_tasks_item, parent,
                false))


    class ViewHolder(view: View) : BaseViewHolder<Task>(view) {
        override fun onBind(data: Task) {
         //   view.text_View.text = data.title

//            data.todos.forEach {todo ->
//                val list_todo = LayoutInflater.from(view.context).inflate(R.layout.list_todo_list, view.todo_container, false ).apply {
//                    todo_description.text = todo.descripyion
//                    complete_checkbox.isComplete = todo.isComplete
//                }
//                view.todo_container.addView(list_todo)
//
//            }
        }


    }
}
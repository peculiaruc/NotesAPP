package com.peculiaruc.notesapp.fragments.tasks

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
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
        }


    }
}
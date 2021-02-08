package com.peculiaruc.notesapp.fragments.tasks

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.peculiaruc.notesapp.R
import com.peculiaruc.notesapp.fragments.notes.NotesViewModel
import com.peculiaruc.notesapp.model.Task
import com.peculiaruc.notesapp.model.Todo

class TasksFragment : Fragment() {

    private lateinit var tasksViewModel: NotesViewModel
    private  lateinit var recyclerView: RecyclerView

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        tasksViewModel =
                ViewModelProvider(this).get(NotesViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_notes, container, false)
        val textView: TextView = root.findViewById(R.id.title_View)
        val list_todo: LinearLayout = root.findViewById(R.id.todo_container)
        val todo_description: TextView = root.findViewById(R.id.todo_description)

        tasksViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        recyclerView.layoutManager = LinearLayoutManager(context)

        val adapter = TasksAdapter(
                mutableListOf(
                        Task("Testing one", mutableListOf(
                                Todo("Todo 1", true),
                                Todo("Todo 2", true)
                        )),
                        Task("Testing teo")
                ))
        recyclerView.adapter = adapter
    }
}
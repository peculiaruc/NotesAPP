package com.peculiaruc.notesapp.fragments.notes

import android.provider.ContactsContract
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.peculiaruc.notesapp.R
import com.peculiaruc.notesapp.adapter.BaseRecyclerAdapter
import com.peculiaruc.notesapp.model.Task

class NotesAdapter(note: MutableList<ContactsContract.CommonDataKinds.Note> = mutableListOf())
    : BaseRecyclerAdapter<Task>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder =
            ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.list_notes, parent,
                    false))


        class ViewHolder( view: View): BaseViewHolder<ContactsContract.CommonDataKinds.Note>(view) {
            override fun onBind(data: Task) {
           //    view.notes_View.text = data.note
            }


        }
}
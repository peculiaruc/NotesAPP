package com.peculiaruc.notesapp.model

data class Task @JvmOverloads constructor (
    var title: String,
    val todos: MutableList<Todo> = mutableListOf(),
    var tag: Tag? = null
)

data class Todo(
    var descripyion: String,
    var isComplete: Boolean  = false
)

data class Npte(
    var descripyion: String,
    var tag: Tag? = null
)

data class Tag(
    var name: String,
    var colorResId: Int

)
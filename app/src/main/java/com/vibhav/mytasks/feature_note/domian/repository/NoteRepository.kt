package com.vibhav.mytasks.feature_note.domian.repository

import com.vibhav.mytasks.feature_note.domian.model.Note
import kotlinx.coroutines.flow.Flow

interface NoteRepository {

    fun getNotes(): Flow<List<Note>>

    suspend fun getNoteById(id: Int):Note?

    suspend fun insertNote(note: Note)

    suspend fun deleteNote(note: Note)
}

package com.vibhav.mytasks.feature_note.data.data_source

import androidx.room.Database
import androidx.room.RoomDatabase
import com.vibhav.mytasks.feature_note.domian.model.Note

@Database(
    entities = [Note::class],
    version = 1
)
abstract class NoteDatabase: RoomDatabase() {
    abstract val noteDao: NoteDao
}
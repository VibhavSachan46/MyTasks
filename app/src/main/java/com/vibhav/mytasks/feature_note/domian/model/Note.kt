package com.vibhav.mytasks.feature_note.domian.model

import android.icu.text.CaseMap.Title
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.vibhav.mytasks.ui.theme.*

@Entity
data class Note(
    val title: String,
    val content: String,
    val timeStamp: Long,
    val color: Int,

    @PrimaryKey val id: Int?= null
){
    companion object{
        val noteColors = listOf(RedOrange , LightGreen, Violet, BabyBlue, RedPink)
    }
}

class InvalidNoteException(message: String): Exception(message)
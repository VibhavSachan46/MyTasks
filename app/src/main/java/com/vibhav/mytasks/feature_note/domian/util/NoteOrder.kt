package com.vibhav.mytasks.feature_note.domian.util

sealed class NoteOrder(val orderType: OrderType){
     class Title(orderType: OrderType): NoteOrder(orderType)
     class Date(orderType: OrderType): NoteOrder(orderType)
     class Color(orderType: OrderType): NoteOrder(orderType)
}
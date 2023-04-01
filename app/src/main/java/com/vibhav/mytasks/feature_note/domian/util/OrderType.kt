package com.vibhav.mytasks.feature_note.domian.util

sealed class OrderType{
    object Ascending: OrderType()
    object Descending: OrderType()
}

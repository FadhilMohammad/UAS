package com.example.duniapremiereleague.ui.favorite

import com.example.duniapremiereleague.data.db.entities.EventFavorite

interface ClickListener {
    fun onClickListener(eventFavorite: EventFavorite)
}
package com.example.duniapremiereleague.ui.event

import com.example.duniapremiereleague.data.model.Event

interface EventView{
    fun showLoading()
    fun hideLoading()
    fun showEventList(data: List<Event>)
}
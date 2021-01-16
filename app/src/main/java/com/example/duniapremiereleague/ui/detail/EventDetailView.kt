package com.example.duniapremiereleague.ui.detail


import com.example.duniapremiereleague.data.model.EventDetail

interface EventDetailView{
    fun showLoading()
    fun hideLoading()
    fun showEventDetail(data: List<EventDetail>)
}
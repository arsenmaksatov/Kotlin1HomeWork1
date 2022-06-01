package com.example.kotlin1homework1.ui.fragments.first

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.kotlin1homework1.model.Model

class FirstViewModel: ViewModel() {

    val liveData = MutableLiveData<ArrayList<Model>>()
    val list = ArrayList<Model>()

    fun getList() {
        list.add(Model("free"))
        list.add(Model("jhon"))
        list.add(Model("marazm"))
        list.add(Model("xexexe"))
        list.add(Model("vasers"))
        list.add(Model("labns"))
        liveData.value = list
    }
}
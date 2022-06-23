package com.example.livedata

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    val luckyNumber: MutableLiveData<String> = MutableLiveData()

    fun btnPressed(){
        val randomNumber:Double = Math.random()
        val randomNumberFrom0To100 =(randomNumber * 100).toInt()
        luckyNumber.value = randomNumberFrom0To100.toString()
    }
}
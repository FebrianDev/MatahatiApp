package com.febrian.matahatiapp

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MovementViewModel @Inject constructor(private val repository: MovementRepository) : ViewModel() {

    private val _getItem = MutableLiveData<Result<List<ItemMovement?>>>()
    val getItem : LiveData<Result<List<ItemMovement?>>> get() = _getItem

    fun getAllCategory(){
        viewModelScope.launch {
            _getItem.value = repository.getAllMovement()

        }
    }

}
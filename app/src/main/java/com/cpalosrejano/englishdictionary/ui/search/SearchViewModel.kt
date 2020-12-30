package com.cpalosrejano.englishdictionary.ui.search

import androidx.lifecycle.*
import com.cpalosrejano.englishdictionary.repository.word.WordRepository

class SearchViewModel(
        private val repository: WordRepository
) : ViewModel() {

    // FactoryClass to create new instance of this ViewModel
    class Factory(private val repository: WordRepository) : ViewModelProvider.NewInstanceFactory() {
        override fun <T : ViewModel?> create(modelClass: Class<T>): T {
            return SearchViewModel(repository) as T
        }
    }

}
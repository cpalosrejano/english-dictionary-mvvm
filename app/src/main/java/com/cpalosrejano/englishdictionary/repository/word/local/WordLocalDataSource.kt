package com.cpalosrejano.englishdictionary.repository.word.local

import android.content.Context
import com.cpalosrejano.englishdictionary.model.Word
import com.cpalosrejano.englishdictionary.repository.word.WordRepository
import com.cpalosrejano.englishdictionary.repository.word.dto.WordDTO

class WordLocalDataSource(context: Context) : WordRepository.LocalDataSource {

    override suspend fun getWord(word: String): WordDTO? {
        TODO("Not yet implemented")
    }

    override suspend fun addWord(word: WordDTO) : Boolean {
        TODO("Not yet implemented")
    }

    override suspend fun update(word: WordDTO) : Boolean {
        TODO("Not yet implemented")
    }

    override suspend fun delete(word: WordDTO) : Boolean {
        TODO("Not yet implemented")
    }
}
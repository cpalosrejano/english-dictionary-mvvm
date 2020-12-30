package com.cpalosrejano.englishdictionary.repository.word.remote

import android.content.Context
import com.cpalosrejano.englishdictionary.repository.word.WordRepository
import com.cpalosrejano.englishdictionary.repository.word.dto.WordDTO

class WordRemoteDataSource(context: Context) : WordRepository.RemoteDataSource {

    override suspend fun getWord(word: String): WordDTO? {
        TODO("Not yet implemented")
    }

}
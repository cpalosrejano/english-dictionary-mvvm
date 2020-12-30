package com.cpalosrejano.englishdictionary.repository.word

import com.cpalosrejano.englishdictionary.model.Word
import com.cpalosrejano.englishdictionary.repository.word.dto.WordDTO

interface WordRepository {

    /**
     * Get a list of definitions for a word
     */
    suspend fun getWord(word: String) : Word?

    interface LocalDataSource {

        /**
         * Get from database all definitions for a word
         */
        suspend fun getWord(word: String) : WordDTO?

        suspend fun addWord(word: WordDTO) : Boolean

        suspend fun update(word: WordDTO) : Boolean

        suspend fun delete(word: WordDTO) : Boolean
    }

    interface RemoteDataSource {

        /**
         * Make a request to OwlBot to find definition of a word
         */
        suspend fun getWord(word: String) : WordDTO?
    }

}
package com.cpalosrejano.englishdictionary.repository.word.dto

import com.cpalosrejano.englishdictionary.model.Word
import com.cpalosrejano.englishdictionary.repository.DTOBase
import com.cpalosrejano.englishdictionary.repository.asDomain

class WordDTO() : DTOBase<Word>() {

    var word: String? = null
    var definitions: List<DefinitionDTO>? = null
    var pronunciation: String? = null

    constructor(word: Word) : this() {
        // init this DTO with Word object
        this.word = word.word
        this.definitions = word.definitions?.map { DefinitionDTO(it) }
        this.pronunciation = word.pronunciation
    }

    override fun asDomain(): Word {
        // convert this DTO into Word object
       return Word(
               word,
               definitions?.asDomain(),
               pronunciation
       )
    }
}
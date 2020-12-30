package com.cpalosrejano.englishdictionary.repository.word.dto

import com.cpalosrejano.englishdictionary.model.Definition
import com.cpalosrejano.englishdictionary.repository.DTOBase

class DefinitionDTO(): DTOBase<Definition>() {

    var type: String? = null
    var definition: String? = null
    var example: String? = null
    var imageUrl: String? = null
    var emoji: String? = null

    constructor(definition: Definition) : this() {
        // init this DTO with Definition object
        this.type = definition.type
        this.definition = definition.definition
        this.example = definition.example
        this.imageUrl = definition.imageUrl
        this.emoji = definition.emoji
    }

    override fun asDomain(): Definition {
        // convert this DTO into Definition object
        return Definition(
                type,
                definition,
                example,
                imageUrl,
                emoji
        )
    }
}
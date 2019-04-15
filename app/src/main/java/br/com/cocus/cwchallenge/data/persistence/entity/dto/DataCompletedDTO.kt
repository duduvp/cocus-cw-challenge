package br.com.cocus.cwchallenge.data.persistence.entity.dto

import java.util.*
import kotlin.collections.ArrayList

data class DataCompletedDTO(
        val id: String,
        val name: String,
        val slug: String,
        val completedAt: Date,
        val completedLanguages: ArrayList<String>
)
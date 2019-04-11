package br.com.cocus.cwchallenge.data.local.entity

import java.util.*
import kotlin.collections.ArrayList

data class DataCompleted(
        val id: String,
        val name: String,
        val slug: String,
        val completedAt: Date,
        val completedLanguages: ArrayList<String>
)
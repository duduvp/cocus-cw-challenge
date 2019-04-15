package br.com.cocus.cwchallenge.data.persistence.entity.dto

data class DataAuthoredDTO(
        val id: String,
        val name: String,
        val description: String,
        val rank: Int,
        val rankName: String,
        val tags: ArrayList<String>,
        val languages: ArrayList<String>
)
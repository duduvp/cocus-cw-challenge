package br.com.cocus.cwchallenge.data.persistence.entity

data class DataAuthored(
        val id: String,
        val name: String,
        val description: String,
        val rank: Int,
        val rankName: String,
        val tags: ArrayList<String>,
        val languages: ArrayList<String>
)
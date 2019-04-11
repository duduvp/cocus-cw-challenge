package br.com.cocus.cwchallenge.data.local.entity

data class DataAuthored(
        val id: String,
        val name: String,
        val description: String,
        val rank: Int,
        val rankName: String,
        val tags: ArrayList<String>,
        val languages: ArrayList<String>
)
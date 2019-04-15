package br.com.cocus.cwchallenge.data.persistence.entity

data class CompletedChallenges(
        val totalPages: Int,
        val totalItems: Int,
        val data: List<DataCompleted>
)
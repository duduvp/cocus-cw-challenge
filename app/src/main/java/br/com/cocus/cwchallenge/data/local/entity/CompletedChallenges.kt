package br.com.cocus.cwchallenge.data.local.entity

data class CompletedChallenges(
        val totalPages: Int,
        val totalItems: Int,
        val data: List<DataCompleted>
)
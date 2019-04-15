package br.com.cocus.cwchallenge.data.persistence.entity.dto

data class CompletedChallengesDTO(
        val totalPages: Int,
        val totalItems: Int,
        val data: List<DataCompletedDTO>
)
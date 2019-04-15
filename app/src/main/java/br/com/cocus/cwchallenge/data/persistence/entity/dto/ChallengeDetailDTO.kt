package br.com.cocus.cwchallenge.data.persistence.entity.dto

import java.util.*
import kotlin.collections.ArrayList

data class ChallengeDetailDTO(
        val id: String,
        val name: String,
        val slug: String,
        val category: String,
        val publishedAt: Date,
        val approvedAt: Date,
        val languages: ArrayList<String>,
        val url: String,
        val rank: RankMinDTO,
        val createdBy: CreatedOrApprovedDTO,
        val approvedBy: CreatedOrApprovedDTO,
        val description: String,
        val totalAttempts: Int,
        val totalCompleted: Int,
        val totalStars: Int,
        val tags: ArrayList<String>
)
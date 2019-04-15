package br.com.cocus.cwchallenge.data.persistence.entity.dto

import com.google.gson.annotations.SerializedName

data class RankDTO(
        @SerializedName("rank")
        val rank: Int = -1,
        @SerializedName("name")
        val name: String = "",
        @SerializedName("color")
        val color: String = "",
        @SerializedName("score")
        val score: Int = -1
)
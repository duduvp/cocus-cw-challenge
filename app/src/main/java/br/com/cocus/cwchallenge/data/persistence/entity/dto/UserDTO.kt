package br.com.cocus.cwchallenge.data.persistence.entity.dto

import com.google.gson.annotations.SerializedName

data class UserDTO (
    @SerializedName("name")
    val name: String = "",
    @SerializedName("ranks")
    val ranks : RanksDTO = RanksDTO()
)
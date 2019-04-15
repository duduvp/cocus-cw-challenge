package br.com.cocus.cwchallenge.data.persistence.entity

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey
import com.google.gson.annotations.SerializedName
import java.util.Date

@Entity(tableName = "user")
data class User(
        @PrimaryKey
        val name: String,
        val rank: Long, //TODO FUNCTION TO GET RANK FROM API
        val search: Date
)
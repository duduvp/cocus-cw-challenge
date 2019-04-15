package br.com.cocus.cwchallenge.data.persistence.entity

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey
import com.google.gson.annotations.SerializedName
import java.util.Date

@Entity(tableName = "user")
data class User(
        @PrimaryKey
        @SerializedName("name")
        val name: String,
        @SerializedName("rank")
        val rank: Long,
        val search: Date
)
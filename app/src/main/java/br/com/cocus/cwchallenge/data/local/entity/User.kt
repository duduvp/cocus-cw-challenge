package br.com.cocus.cwchallenge.data.local.entity

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey
import java.util.Date

@Entity(tableName = "user")
data class User(
        @PrimaryKey
        val username: String,
        val name: String,
        val honor: Int,
        val clan: String,
        val leaderboardPosition: Int,
        val skills: ArrayList<String>,
        val ranks: Ranks,
        val codeChallenges: CodeChallenges,
        val search: Date
)
package br.com.cocus.cwchallenge.data.persistence.dao

import android.arch.persistence.room.*
import br.com.cocus.cwchallenge.data.persistence.entity.User

@Dao
interface UserDao {

    @Delete
    fun delete(user: User)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(user: User)

    @Query("SELECT * FROM user ORDER BY search DESC")
    fun queryByLastSearches(): List<User>

    @Query("SELECT * FROM user ORDER BY ranks")
    fun queryByRank(): List<User>

}
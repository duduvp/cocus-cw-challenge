package br.com.cocus.cwchallenge.data.persistence

import android.arch.persistence.room.Database
import android.arch.persistence.room.Room
import android.arch.persistence.room.RoomDatabase
import android.arch.persistence.room.TypeConverters
import android.content.Context
import br.com.cocus.cwchallenge.data.persistence.converter.DateConverter
import br.com.cocus.cwchallenge.data.persistence.dao.UserDao
import br.com.cocus.cwchallenge.data.persistence.entity.User

@Database(
        entities = [User::class],
        version = 1
)
@TypeConverters(DateConverter::class)
abstract class AppDatabase : RoomDatabase() {

    abstract fun userDao(): UserDao

    companion object {
        @Volatile
        private var INSTANCE: AppDatabase? = null

        fun getDatabase(context: Context): AppDatabase {
            val tempInstance = INSTANCE
            if (tempInstance != null) {
                return tempInstance
            }
            synchronized(this) {
                val instance = Room.databaseBuilder(
                        context.applicationContext,
                        AppDatabase::class.java,
                        "app_cw_challenge"
                ).build()
                INSTANCE = instance
                return instance
            }
        }
    }
}
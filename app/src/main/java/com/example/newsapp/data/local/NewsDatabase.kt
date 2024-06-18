package com.example.newsapp.data.local

import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.newsapp.app.App
import com.example.newsapp.data.local.dao.NewsDao
import com.example.newsapp.domain.model.Article

@Database(entities = [Article::class], version = 2)
@TypeConverters(NewsTypeConverter::class)
abstract class NewsDatabase : RoomDatabase() {

    abstract fun newsDao(): NewsDao

    companion object {
        @Volatile
        private var INSTANCE: NewsDatabase? = null

        fun getDatabase(): NewsDatabase {
            val tempInstance = INSTANCE
            if (tempInstance != null) {
                return tempInstance
            }
            synchronized(this) {
                val instance = Room.databaseBuilder(
                    context = App.instance.applicationContext,
                    klass = NewsDatabase::class.java,
                    name = "news_database"
                ).addTypeConverter(NewsTypeConverter())
                    .fallbackToDestructiveMigration()
                    .build()
                INSTANCE = instance
                return instance
            }
        }
    }

}
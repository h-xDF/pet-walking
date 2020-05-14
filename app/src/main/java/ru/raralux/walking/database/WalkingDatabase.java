package ru.raralux.walking.database;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {Walk.class, Companioins.class}, version = 1)
public abstract class WalkingDatabase extends RoomDatabase {

    abstract WalkingDao getWalkingDao();
}

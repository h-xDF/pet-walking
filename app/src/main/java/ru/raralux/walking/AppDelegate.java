package ru.raralux.walking;

import android.app.Application;

import androidx.room.Room;

import ru.raralux.walking.database.WalkingDatabase;

public class AppDelegate extends Application {
    private WalkingDatabase mWalkingDataBase;

    @Override
    public void onCreate() {
        super.onCreate();
        mWalkingDataBase = Room
                .databaseBuilder(this, WalkingDatabase.class, "walking_database")
                .build();
    }
}

package ru.raralux.walking.database;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface WalkingDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    long insertCompanion(String name);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    long insertWalk(int[] companions, long startWalk, long finishWalk);

    @Query("select * from companioins")
    List<Companioins> getCompanions();

    @Query("select * from walk")
    List<Walk> getWalks();

    @Update
    void updateCompanion(Companioins companion);

    @Update
    void updateWalk(Walk walk);

    @Delete
    void deleteCompanion(int id);

    @Delete
    void deleteWalk(int id);
}

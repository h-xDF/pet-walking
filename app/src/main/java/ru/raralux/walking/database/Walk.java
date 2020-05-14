package ru.raralux.walking.database;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Walk {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    private int mId;

    @ColumnInfo(name = "companions")
    private int[] companions;

    @ColumnInfo(name = "start_walk")
    private long startTimeWalk;

    @ColumnInfo(name = "finish_walk")
    private long finishTimeWalk;

    public Walk() {
    }

    public Walk(int mId, int[] companions, long startTimeWalk, long finishTimeWalk) {
        this.mId = mId;
        this.companions = companions;
        this.startTimeWalk = startTimeWalk;
        this.finishTimeWalk = finishTimeWalk;
    }

    public int getmId() {
        return mId;
    }

    public void setmId(int mId) {
        this.mId = mId;
    }

    public int[] getCompanions() {
        return companions;
    }

    public void setCompanions(int[] companions) {
        this.companions = companions;
    }

    public long getStartTimeWalk() {
        return startTimeWalk;
    }

    public void setStartTimeWalk(long startTimeWalk) {
        this.startTimeWalk = startTimeWalk;
    }

    public long getFinishTimeWalk() {
        return finishTimeWalk;
    }

    public void setFinishTimeWalk(long finishTimeWalk) {
        this.finishTimeWalk = finishTimeWalk;
    }
}

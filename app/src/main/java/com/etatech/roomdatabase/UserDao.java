package com.etatech.roomdatabase;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Update;

@Dao
public interface UserDao {
    @Insert
    public void insert(User user);
    @Update
    public void update(User user);
    @Delete
    public void delete(User user);

}

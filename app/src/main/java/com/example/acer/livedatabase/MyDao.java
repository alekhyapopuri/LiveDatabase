package com.example.acer.livedatabase;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

@Dao
public interface MyDao {
    @Insert
    public void insertContact(MyEntity entity);

    @Update
    public void updateContact(MyEntity entity);

    @Delete
    public void  deleteContact(MyEntity entity);

    @Query("select * from contact_details" )
    public LiveData<List<MyEntity>> getAllContacts();

    @Query("delete from contact_details")
    public void deleteAll();
}

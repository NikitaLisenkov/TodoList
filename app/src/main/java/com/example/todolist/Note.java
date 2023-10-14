package com.example.todolist;

import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

@Entity(tableName = "notes")

public class Note {

    @PrimaryKey(autoGenerate = true)
    private int id;
    private String text;
    private int priotity;

    public Note(int id, String text, int priotity) {
        this.id = id;
        this.text = text;
        this.priotity = priotity;
    }

    @Ignore
    public Note(String text, int priotity) {
        this.text = text;
        this.priotity = priotity;
    }

    public int getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public int getPriotity() {
        return priotity;
    }
}

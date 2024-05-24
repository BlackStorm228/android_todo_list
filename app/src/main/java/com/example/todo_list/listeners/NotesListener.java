package com.example.todo_list.listeners;

import android.provider.ContactsContract;

import com.example.todo_list.entites.Note;

public interface NotesListener {
    void onNoteClicked(Note note, int position);
}

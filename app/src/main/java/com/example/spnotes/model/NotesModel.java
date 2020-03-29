package com.example.spnotes.model;

public class NotesModel {
    String judul, isi;

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getIsi() {
        return isi;
    }

    public void setIsi(String isi) {
        this.isi = isi;
    }


    public NotesModel(String judul, String isi) {
        this.judul = judul;
        this.isi = isi;
    }
}

package com.project.music.bean;

import jakarta.persistence.Entity;

import jakarta.persistence.Id;

import lombok.Data;

@Entity
@Data
public class songs {

    @Id
    private int SrNo;
    private String Song_Name;
    private String Audio_Link;
    private String Video_Link;
    private String Language;
    private String Genre;

    public int getSrNo() {
        return SrNo;
    }
    public void setSrNo(int srNo) {
        SrNo = srNo;
    }
    public String getSong_Name() {
        return Song_Name;
    }
    public void setSong_Name(String song_Name) {
        Song_Name = song_Name;
    }
    public String getAudio_Link() {
        return Audio_Link;
    }
    public void setAudio_Link(String audio_Link) {
        Audio_Link = audio_Link;
    }
    public String getVideo_Link() {
        return Video_Link;
    }
    public void setVideo_Link(String video_Link) {
        Video_Link = video_Link;
    }
    public String getLanguage() {
        return Language;
    }
    public void setLanguage(String language) {
        Language = language;
    }
    public String getGenre() {
        return Genre;
    }
    public void setGenre(String genre) {
        Genre = genre;
    }

    public songs(int srNo, String song_Name, String audio_Link, String video_Link, String language, String genre) {
        SrNo = srNo;
        Song_Name = song_Name;
        Audio_Link = audio_Link;
        Video_Link = video_Link;
        Language = language;
        Genre = genre;
    }
    public songs() {
    }
    @Override
    public String toString() {
        return "songs [SrNo=" + SrNo + ", Song_Name=" + Song_Name + ", Audio_Link=" + Audio_Link + ", Video_Link="
                + Video_Link + ", Language=" + Language + ", Genre=" + Genre + "]";
    }

    
}

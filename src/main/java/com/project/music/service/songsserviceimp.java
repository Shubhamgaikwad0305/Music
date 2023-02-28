package com.project.music.service;

import com.project.music.dao.songsdao;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.music.bean.songs;

@Service
public class songsserviceimp implements songsservice {

    @Autowired
    songsdao dao;

    @Override
    public List<songs> show() {

        List<songs> song = dao.findAll();
        return song;
    }

    @Override
    public void addsong(songs song) {
        dao.save(song);
    }

}

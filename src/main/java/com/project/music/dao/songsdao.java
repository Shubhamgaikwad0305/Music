package com.project.music.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.music.bean.songs;

public interface songsdao extends JpaRepository<songs,Integer> {
       
}

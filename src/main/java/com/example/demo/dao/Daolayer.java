package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.pojo.UrlList;

public interface Daolayer extends JpaRepository<UrlList, Integer> {

}

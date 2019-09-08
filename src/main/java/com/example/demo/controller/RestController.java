package com.example.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.dao.Daolayer;
import com.example.demo.pojo.UrlList;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/rest")
public class RestController {
    @Autowired
	Daolayer dao;
    
  
	
    @GetMapping("/url/{id}")
    public Optional<UrlList> getUrl(@PathVariable Integer id) {
    
    	return dao.findById(id);
    }
    
    @PostMapping("/post")
    public String postUrl(@RequestBody UrlList url) {
    	if(dao.existsById(url.getId())) {
    		return "This id already exists";
    	}
    	dao.save(url);
    	return "URL saved";
    	
    }
}

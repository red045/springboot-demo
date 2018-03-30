package com.kennyw.jpa.controller;

import com.kennyw.jpa.Repository.GirlRepository;
import com.kennyw.jpa.model.Girl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Administrator on 2018/3/31 0031
 */
@RestController
public class GirlController {

    @Autowired
    private GirlRepository girlRepository;

    @GetMapping("/girls")
    public List<Girl> listGirls() {
        return girlRepository.findAll();
    }
}

package com.titus.hellopostgres.controller;

import com.titus.hellopostgres.model.Link;
import com.titus.hellopostgres.service.ILinkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Links {

    @Autowired
    private ILinkService linkService;

    @GetMapping("/links")
    public List<Link> getLinks()
    {
        return linkService.findAll();

    }
}

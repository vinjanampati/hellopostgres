package com.titus.hellopostgres.service;

import com.titus.hellopostgres.model.Link;
import com.titus.hellopostgres.repository.LinkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class LinkService implements ILinkService {

    @Autowired
    private LinkRepository repository;

    @Override
    public List<Link> findAll() {
        List<Link> links = (List<Link>) repository.findAll();
        return links;
    }
}

package com.titus.hellopostgres.service;

import com.titus.hellopostgres.model.Link;

import java.util.List;

public interface ILinkService {

    List<Link> findAll();
}

package com.titus.hellopostgres.repository;

import com.titus.hellopostgres.model.Link;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LinkRepository extends CrudRepository<Link, Integer> {
}

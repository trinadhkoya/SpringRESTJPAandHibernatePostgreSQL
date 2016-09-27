package com.example;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


/**
 * Created by trina on 9/28/2016.
 */

@RepositoryRestResource
public interface EmployRepository extends CrudRepository<Employee,Long> {
}

package com.data.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.data.model.Student;

@RepositoryRestResource(collectionResourceRel = "students", path = "students")
public interface StudentDao extends JpaRepository<Student, Integer> {

}

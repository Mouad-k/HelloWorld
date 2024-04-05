package com.project.HelloWorld.Repositories;

import com.project.HelloWorld.Entities.HelloEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HelloRepository extends JpaRepository<HelloEntity, Long> {

}

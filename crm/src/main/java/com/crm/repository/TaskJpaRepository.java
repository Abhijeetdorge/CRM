package com.crm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crm.model.Task;

@Repository
public interface TaskJpaRepository extends JpaRepository<Task,Integer>{

}

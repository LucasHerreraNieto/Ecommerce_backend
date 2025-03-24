package com.deve.inventory_sistem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.scheduling.config.Task;
import org.springframework.stereotype.Repository;

@Repository
public interface SaleRepository extends JpaRepository<Task, Long> {

}

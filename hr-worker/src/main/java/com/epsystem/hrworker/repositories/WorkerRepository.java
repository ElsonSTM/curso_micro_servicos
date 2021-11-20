package com.epsystem.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.epsystem.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {	

}

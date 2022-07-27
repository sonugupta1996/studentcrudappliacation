package com.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.student.entity.Standard;

public interface StandardRepo extends JpaRepository<Standard, Integer> {

}

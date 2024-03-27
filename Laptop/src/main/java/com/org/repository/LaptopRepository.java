package com.org.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.org.dto.Laptop;

public interface LaptopRepository extends JpaRepository<Laptop, Integer>{

}

package com.ipru.icm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ipru.icm.entity.ICM;

@Repository
public interface ICMRepository extends JpaRepository<ICM, Integer>{

}

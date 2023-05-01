package com.icin.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.icin.entity.CheckbookEntity;

public interface CheckbookRepo extends JpaRepository<CheckbookEntity,Integer>{

}

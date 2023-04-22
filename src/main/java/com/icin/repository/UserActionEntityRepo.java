package com.icin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.icin.entity.UserActionEntity;

@Repository
public interface UserActionEntityRepo extends JpaRepository<UserActionEntity, Integer>{

}

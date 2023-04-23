package com.icin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.icin.entity.TransactionEntity;

@Repository
public interface TransactionRepo extends JpaRepository<TransactionEntity, Integer>{

}

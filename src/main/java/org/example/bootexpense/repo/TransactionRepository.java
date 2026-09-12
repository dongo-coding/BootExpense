package org.example.bootexpense.repo;

import org.example.bootexpense.entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface TransactionRepository extends JpaRepository<Transaction,Long> {
}


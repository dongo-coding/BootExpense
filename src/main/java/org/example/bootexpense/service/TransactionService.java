package org.example.bootexpense.service;

import org.example.bootexpense.repo.TransactionRepository;
import org.example.bootexpense.entity.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TransactionService {
    @Autowired

    private TransactionRepository transactionRepo;

    public List <Transaction> getAllTransactions(){
        return transactionRepo.findAll();
    }

    public Transaction saveTransaction (Transaction transaction){
        return transactionRepo.save(transaction);
    }

    public void deleteTransaction (Long id){
        transactionRepo.deleteById(id);
    }


}

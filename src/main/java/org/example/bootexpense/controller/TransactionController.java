package org.example.bootexpense.controller;

import org.example.bootexpense.entity.Transaction;
import org.example.bootexpense.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/transactions")
public class TransactionController {

    @Autowired
    private TransactionService transactionService;

    @GetMapping
    public String viewHomePage(Model model) {
        model.addAttribute("listTransactions", transactionService.getAllTransactions());
        model.addAttribute("transaction", new Transaction());
        return "index";
    }

    @PostMapping("/save")
    public String saveTransaction(@ModelAttribute("transaction") Transaction transaction) {
        transactionService.saveTransaction(transaction);
        return "redirect:/transactions";
    }

    @GetMapping("/delete/{id}")
    public String deleteTransaction(@PathVariable(value = "id") long id) {
        transactionService.deleteTransaction(id);
        return "redirect:/transactions";
    }
}
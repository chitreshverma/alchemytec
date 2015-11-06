package com.chitresh.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.chitresh.dao.ExpensesDao;
import com.chitresh.model.Expenses;

@Service
public class ExpensesService {
    @Autowired
    private ExpensesDao expensesDao;

    @Transactional
    public Expenses createExpense(Expenses expenses)  {
        expensesDao.save(expenses);
        return expenses;
    }

    @Transactional
    public List<Expenses> getExpenses()  {
        return expensesDao.findAll();
    }

    @Transactional
    public Expenses getExpense(String code)  {
        return expensesDao.findByCode(code);
    }

    @Transactional
    public String deleteExpenses(String code)  {
        Expenses expenses = expensesDao.findByCode(code);
        expensesDao.delete(expenses);
        return "Success delete";
    }

}

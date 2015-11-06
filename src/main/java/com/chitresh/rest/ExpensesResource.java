package com.chitresh.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.chitresh.model.Expenses;
import com.chitresh.rest.wrapper.CommonResponse;
import com.chitresh.service.ExpensesService;

@RestController
@RequestMapping(value = "/expenses",
        produces = "application/json")
public class ExpensesResource {
    @Autowired	
    private ExpensesService expensesService;


    @RequestMapping(method = RequestMethod.POST)
    public Expenses createExpense(@RequestBody Expenses expense) {
        return expensesService.createExpense(expense);
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Expenses> listExpenses() {
        return expensesService.getExpenses();
    }

    @RequestMapping(value = "{code}", method = RequestMethod.GET)
    public Expenses viewExpenses(@PathVariable String code) {
        return expensesService.getExpense(code);
    }

    @RequestMapping(value = "{code}", method = RequestMethod.DELETE)
    public CommonResponse deleteExpense(@PathVariable String code) {
        String message = expensesService.deleteExpenses(code);
        return new CommonResponse(message);
    }
    
}

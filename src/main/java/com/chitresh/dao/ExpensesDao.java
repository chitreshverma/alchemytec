package com.chitresh.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.chitresh.model.Expenses;

@Repository
public class ExpensesDao {
    @Autowired
    private SessionFactory sessionFactory;

    public void save(Expenses expenses) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(expenses);
    }

    public void update(Expenses expenses) {
        Session session = sessionFactory.getCurrentSession();
        session.update(expenses);
    }

    public Expenses findOne(Long expenseId) {
        Session session = sessionFactory.getCurrentSession();
        return (Expenses)session.load(Expenses.class, expenseId);

    }

    @SuppressWarnings("unchecked")
    public List<Expenses> findAll() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Expenses").list();
    }

    public Expenses findByCode(String code) {
        Session session = sessionFactory.getCurrentSession();
        return (Expenses)session.createQuery("from Expenses where code = :code")
                .setParameter("code", code)
                .uniqueResult();
    }

    public void delete(Expenses expenses)   {
        Session session = sessionFactory.getCurrentSession();
        session.delete(expenses);
    }


}

package edu.jsp.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import edu.jsp.entity.Account;
import edu.jsp.entity.Bank;

public class Delete {

	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("uni_onetoone2");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();

		Account account = manager.find(Account.class, 1);

		Bank bank = manager.find(Bank.class, 1);

		if (bank != null && account != null) {
			transaction.begin();
			manager.remove(account);
			manager.remove(bank);
			transaction.commit();
			
			System.out.println("Account Deleted!");
		} else {
			System.out.println("Account Not Found");
		}
	}

	}


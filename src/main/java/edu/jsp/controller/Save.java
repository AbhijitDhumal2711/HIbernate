package edu.jsp.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import edu.jsp.entity.Account;
import edu.jsp.entity.Bank;

public class Save {

	public static void main(String[] args) {
		

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("uni_onetoone2");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();

		Account account = new Account();
		account.setAccId(1);
		account.setAccHName("abhi");
		account.setBalance(100);
		

		Bank bank = new Bank();
		bank.setAccId(1);
		bank.setAccHName("Vishal");
		bank.setBalance(10000);
		bank.setAccount(account);

		transaction.begin();
		manager.persist(bank);
		manager.persist(account);
		transaction.commit();

		System.out.println("Account Saved!");
	}


	

		
	}


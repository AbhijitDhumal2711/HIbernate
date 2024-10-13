package edu.jsp.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import edu.jsp.entity.Account;
import edu.jsp.entity.Bank;

public class Search {

	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("uni_onetoone2");
		EntityManager manager = factory.createEntityManager();

		Account account = manager.find(Account.class, 1);

		Bank bank = manager.find(Bank.class, 1);

		if (bank != null && account != null) {
			System.out.println("---------------------------------------");
			System.out.println("Account ID : " + bank.getAccId());
			System.out.println("Account Holder Name : " + bank.getAccHName());
			System.out.println("Bank Balance : " + bank.getBalance());
			System.out.println("Account ID : " + account.getAccId());
			System.out.println("Account Holder Name : " + account.getAccHName());
;
		} else {
			System.out.println("Account not found");
		}
	}

	}


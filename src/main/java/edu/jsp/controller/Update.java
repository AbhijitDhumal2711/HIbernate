package edu.jsp.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import edu.jsp.entity.Account;
import edu.jsp.entity.Bank;

public class Update {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("uni_onetoone2");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		
		Account account = manager.find(Account.class, 1);
		Bank bank = manager.find(Bank.class, 1);
		
		if(bank != null && account != null) {
			transaction.begin();
			account.setBalance(100);
			
			bank.setAccHName("V V");
			bank.setBalance(20000);
			bank.setAccount(account);
			
			manager.merge(account);
			manager.merge(bank);
			transaction.commit();
			System.out.println("Bank Acoount Details Updated!");
		} else {
			System.out.println("Bank Account Not FounD ");
		}
	}

}

package edu.jsp.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Account {
	
	
		@Id
		private int accId;
		private String accHName;
		private double balance;

		@OneToOne
		Account account;

		public int getAccId() {
			return accId;
		}

		public void setAccId(int accId) {
			this.accId = accId;
		}

		public String getAccHName() {
			return accHName;
		}

		public void setAccHName(String accHName) {
			this.accHName = accHName;
		}

		public double getBalance() {
			return balance;
		}

		public void setBalance(double balance) {
			this.balance = balance;
		}

		public Account getAccount() {
			return account;
		}

		public void setAccount(Account account) {
			this.account = account;
		}

		public Account() {
			super();
		}

		
}

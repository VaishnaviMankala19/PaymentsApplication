package com.vaishnavi.PaymentsApplication.entity;

import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class UserEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String fullName;
    private String email;
    private String password;
    private String phone;
    
    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public UserAccountDetailsEntity getAccountDetails() {
		return accountDetails;
	}

	public void setAccountDetails(UserAccountDetailsEntity accountDetails) {
		this.accountDetails = accountDetails;
	}

	public List<BankAccountsEntity> getBankAccounts() {
		return bankAccounts;
	}

	public void setBankAccounts(List<BankAccountsEntity> bankAccounts) {
		this.bankAccounts = bankAccounts;
	}

	public List<TransactionEntity> getTransactions() {
		return transactions;
	}

	public void setTransactions(List<TransactionEntity> transactions) {
		this.transactions = transactions;
	}

	@OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
    private UserAccountDetailsEntity accountDetails;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<BankAccountsEntity> bankAccounts;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<TransactionEntity> transactions;
    
}

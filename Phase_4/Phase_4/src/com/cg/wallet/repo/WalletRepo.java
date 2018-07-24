package com.cg.wallet.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.wallet.beans.Customer;

public interface WalletRepo extends JpaRepository<Customer, String>{

/*	public boolean save(Customer customer);
	
	public Customer findOne(String mobileNo);
*/
}

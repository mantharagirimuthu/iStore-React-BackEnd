package com.istore.repository;

import com.istore.entity.Address;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepo extends JpaRepository<Address, Long>{
    
}

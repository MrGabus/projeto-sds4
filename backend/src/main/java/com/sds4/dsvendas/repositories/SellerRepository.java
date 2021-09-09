package com.sds4.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sds4.dsvendas.entities.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long> {

}
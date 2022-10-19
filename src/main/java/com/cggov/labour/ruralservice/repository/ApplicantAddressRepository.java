package com.cggov.labour.ruralservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cggov.labour.ruralservice.datamodel.ApplicantAddressData;

public interface ApplicantAddressRepository extends JpaRepository<ApplicantAddressData, Long> { 
	
	
}
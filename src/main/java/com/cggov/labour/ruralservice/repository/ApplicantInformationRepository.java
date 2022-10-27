package com.cggov.labour.ruralservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cggov.labour.ruralservice.datamodel.ApplicantInformationData;


public interface ApplicantInformationRepository extends JpaRepository<ApplicantInformationData, Integer> {

	List<ApplicantInformationData> findByStatus(int status);

}

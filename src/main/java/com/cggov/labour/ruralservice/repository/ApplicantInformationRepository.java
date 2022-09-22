package com.cggov.labour.ruralservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cggov.labour.ruralservice.datamodel.ApplicantInformationData;


public interface ApplicantInformationRepository extends JpaRepository<ApplicantInformationData, Long> {

}

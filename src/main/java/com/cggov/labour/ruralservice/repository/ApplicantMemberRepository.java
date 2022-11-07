package com.cggov.labour.ruralservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cggov.labour.ruralservice.datamodel.ApplicantMemberData;

public interface ApplicantMemberRepository extends JpaRepository<ApplicantMemberData, Integer> {
	
	
	List<ApplicantMemberData> findByApplicantIdAndStatus(int applicantId, int status);

}

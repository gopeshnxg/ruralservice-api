package com.cggov.labour.ruralservice.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cggov.labour.ruralservice.api.model.ApplicantInformation;
import com.cggov.labour.ruralservice.datamodel.ApplicantInformationData;
import com.cggov.labour.ruralservice.repository.ApplicantInformationRepository;

@Service
public class ApplicantInformationService {

	
	ApplicantInformationData  applicantInformationData;
	
	
	Optional<ApplicantInformationData>  applicantInformationDataOptional;
	
	@Autowired
	ApplicantInformationRepository  applicantInformationRepository;

	
	public ApplicantInformation createApplicantInformation(ApplicantInformation applicantInfo) throws Exception {
		
		System.out.println("name===="+applicantInfo.getName());
		
		applicantInformationData = new ApplicantInformationData();
		
		ApplicantInformation applicantInformation;
		applicantInformationData.setName(applicantInfo.getName());
		
		try {
			
			applicantInformationData = applicantInformationRepository.save(applicantInformationData);
			
			System.out.println( "id === "+applicantInformationData.getId());
			
		    applicantInformation = new ApplicantInformation(applicantInformationData.getId(), applicantInformationData.getName());
			
		}catch(Exception ex) {
			
			throw new Exception(" Unable to Save Data");
		}
		
		return applicantInformation;
	}
	
	
	public ApplicantInformation getApplicantInformationById(long applicantId) throws Exception {
		
		applicantInformationDataOptional = applicantInformationRepository.findById(applicantId);
			
		if(applicantInformationDataOptional.isPresent()) {
			applicantInformationData = applicantInformationDataOptional.get();
		    return new ApplicantInformation(applicantInformationData.getId(), applicantInformationData.getName());
		}
		else
			throw new Exception(" No Data found");
	}
}

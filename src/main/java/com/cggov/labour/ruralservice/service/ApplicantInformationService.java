package com.cggov.labour.ruralservice.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.cggov.labour.ruralservice.datamodel.ApplicantAddressData;
import com.cggov.labour.ruralservice.datamodel.ApplicantInformationData;
import com.cggov.labour.ruralservice.model.ApplicantAddress;
import com.cggov.labour.ruralservice.model.ApplicantInformation;
import com.cggov.labour.ruralservice.repository.ApplicantAddressRepository;
import com.cggov.labour.ruralservice.repository.ApplicantInformationRepository;

@Service
public class ApplicantInformationService {

	
	ApplicantInformationData  applicantInformationData;
	
	
	Optional<ApplicantInformationData>  applicantInformationDataOptional;
	
	@Autowired
	ApplicantInformationRepository  applicantInformationRepository;

	@Autowired
	ApplicantAddressRepository applicantAddressRepository;

	
	public ApplicantInformation createApplicantInformation(ApplicantInformation applicantInfo) throws Exception {
		
		System.out.println("name===="+applicantInfo.getName());
		
		applicantInformationData = new ApplicantInformationData();
		
		ApplicantInformation applicantInformation;
		applicantInformationData.setName(applicantInfo.getName());
		ApplicantAddress applicantPermAddress = applicantInfo.getPermanentAddress();
		ApplicantAddress applicantCurrAddress = applicantInfo.getCurrentAddress();
		
		List<ApplicantAddressData> applicantAddressDataList = new ArrayList<ApplicantAddressData>();

		ApplicantAddressData  applicantPermAddressData = new ApplicantAddressData();
		applicantPermAddressData.setAddress(applicantPermAddress.getAddress());

		ApplicantAddressData applicantCurrAddressData = new ApplicantAddressData();
		applicantCurrAddressData.setAddress(applicantCurrAddress.getAddress());

		applicantAddressDataList.add(applicantPermAddressData);
		applicantAddressDataList.add(applicantCurrAddressData);
		
        // Prepare data for ManyToOne
		applicantPermAddressData.setApplicantInformationData(applicantInformationData);
		applicantCurrAddressData.setApplicantInformationData(applicantInformationData);
        
		applicantInformationData.setApplicantAddressData(applicantAddressDataList);

		try {
			
			applicantInformationData = applicantInformationRepository.save(applicantInformationData);
			//applicantAddressRepository.save(applicantPermAddressData);
			//applicantAddressRepository.save(applicantCurrAddressData);

			System.out.println( "id === "+applicantInformationData.getApplicantInfoId());
			
		    applicantInformation = new ApplicantInformation();
			
		}catch(Exception ex) {
			
			throw new Exception(" Unable to Save Data");
		}
		
		return applicantInformation;
	}
	
	
	public ApplicantInformation getApplicantInformationById(long applicantId) throws Exception {
		
		applicantInformationDataOptional = applicantInformationRepository.findById(applicantId);
			
		if(applicantInformationDataOptional.isPresent()) {
			applicantInformationData = applicantInformationDataOptional.get();
			ApplicantInformation applicantInformation = new ApplicantInformation();
			applicantInformation.setId(BigDecimal.valueOf(applicantInformationData.getApplicantInfoId()));
			applicantInformation.setName(applicantInformationData.getName());
	
		    return applicantInformation;
		}
		else
			throw new Exception(" No Data found");
	}
	
	
	public ApplicantInformation updateApplicationInformation(ApplicantInformation applicantInfo) {
		
		ApplicantInformation applicantInformation;

		
		System.out.println("Indise Service Applicant Name "+applicantInfo.getName());
		
		applicantInformationData = new ApplicantInformationData();
		
		applicantInformationData.setName(applicantInfo.getName());
		applicantInformationData.setApplicantInfoId(applicantInfo.getId().longValue());

		applicantInformationRepository.save(applicantInformationData);
		
	    applicantInformation = new ApplicantInformation();
	    applicantInformation.setId(BigDecimal.valueOf(applicantInformationData.getApplicantInfoId()));
	    applicantInformation.setName(applicantInformationData.getName());
		
		return applicantInformation;
	}
}

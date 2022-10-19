package com.cggov.labour.ruralservice.service;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.cggov.labour.ruralservice.api.model.ApplicantAddress;
import com.cggov.labour.ruralservice.api.model.ApplicantInformation;
import com.cggov.labour.ruralservice.datamodel.ApplicantAddressData;
import com.cggov.labour.ruralservice.datamodel.ApplicantInformationData;
import com.cggov.labour.ruralservice.repository.ApplicantAddressRepository;
import com.cggov.labour.ruralservice.repository.ApplicantInformationRepository;

@Service
public class ApplicantInformationService {

	ApplicantInformationData applicantInformationData;

	Optional<ApplicantInformationData> applicantInformationDataOptional;

	@Autowired
	ApplicantInformationRepository applicantInformationRepository;

	@Autowired
	ApplicantAddressRepository applicantAddressRepository;

	public ApplicantInformation createApplicantInformation(ApplicantInformation applicantInfo) throws Exception {

		applicantInformationData = new ApplicantInformationData();

		ApplicantInformation applicantInformation;
		try {
			applicantInformationData.setName(applicantInfo.getName());
			System.out.println("name====" + applicantInfo.getName());
			applicantInformationData.setPmjjyMoney(applicantInfo.getPmjjyMoney());
			applicantInformationData.setKaryaSwaroop(applicantInfo.getKaryaSwaroop().intValue());
			applicantInformationData.setKaryaPrakriti1(applicantInfo.getKaryaPrakriti1().intValue());
			applicantInformationData.setKaryaPrakriti2(applicantInfo.getKaryaPrakriti2().intValue());
			applicantInformationData.setKaryaPrakriti3(applicantInfo.getKaryaPrakriti3().intValue());
			applicantInformationData.setName(applicantInfo.getName());
			applicantInformationData.setNameAsAADHAR(applicantInfo.getNameasAADHAR());
			applicantInformationData.setFatherNameorHusbandName(applicantInfo.getFatherNameorHusbandName());
			applicantInformationData.setFatherORhusband(applicantInfo.getFatherORhusband().intValue());
			applicantInformationData.setMotherName(applicantInfo.getMotherName());
			applicantInformationData.setGender(applicantInfo.getGender().intValue());
			applicantInformationData.setMarriage(applicantInfo.getMarriage().intValue());
			System.out.println("getDob====" + applicantInfo.getDob());

			SimpleDateFormat sdf1 = new SimpleDateFormat("dd-MM-yyyy");
			java.util.Date date = sdf1.parse(applicantInfo.getDob());
			java.sql.Date sqlStartDate = new java.sql.Date(date.getTime());
			System.out.println("sqlStartDate====" +sqlStartDate);

			applicantInformationData.setDob(sqlStartDate);
			applicantInformationData.setAge(applicantInfo.getAge().intValue());
			applicantInformationData.setCaste(applicantInfo.getCaste().intValue());
			applicantInformationData.setManrega(applicantInfo.getManrega());
			applicantInformationData.setRation(applicantInfo.getRation());
			applicantInformationData.setVoterId(applicantInfo.getVoterId());
			applicantInformationData.setRsBy(applicantInfo.getRsBy());
			applicantInformationData.setAadharCard(applicantInfo.getAadharCard());
			applicantInformationData.setBankName(applicantInfo.getBankName());
			applicantInformationData.setBranchName(applicantInfo.getBranchName());
			applicantInformationData.setAcNumber(applicantInfo.getAcNumber());
			applicantInformationData.setIfsCode(applicantInfo.getIfsCode());
			applicantInformationData.setEsiNumber(applicantInfo.getEsiNumber());
			applicantInformationData.setEpfNumber(applicantInfo.getEpfNumber());
			applicantInformationData.setStatus(1);//Active Applicant status will be 1

			ApplicantAddress applicantPermAddress = applicantInfo.getPermanentAddress();
			System.out.println("applicantPermAddress====" + applicantPermAddress.getAddress());

			ApplicantAddress applicantCurrAddress = applicantInfo.getCurrentAddress();
			System.out.println("applicantCurrAddress====" + applicantCurrAddress.getAddress());

			List<ApplicantAddressData> applicantAddressDataList = new ArrayList<ApplicantAddressData>();

			ApplicantAddressData applicantPermAddressData = new ApplicantAddressData();
			applicantPermAddressData.setAddressType("PERMANENT");
			applicantPermAddressData.setAddress(applicantPermAddress.getAddress());
			applicantPermAddressData.setDistrict(applicantPermAddress.getDistrict().intValue());
			applicantPermAddressData.setSelectedAddressType(applicantPermAddress.getSelectedAddressType().intValue());
			applicantPermAddressData.setVidhansabhaArea(applicantPermAddress.getVidhansabhaArea().intValue());
			applicantPermAddressData.setVikasKhand(applicantPermAddress.getVikasKhand().intValue());
			applicantPermAddressData.setPanchayat(applicantPermAddress.getPanchayat().intValue());
			applicantPermAddressData.setWard(applicantPermAddress.getWard().intValue());
			applicantPermAddressData.setAddress(applicantPermAddress.getAddress());
			applicantPermAddressData.setHouseNo(applicantPermAddress.getHouseNo());

			ApplicantAddressData applicantCurrAddressData = new ApplicantAddressData();
			applicantCurrAddressData.setAddressType("CURRENT");

			applicantCurrAddressData.setAddress(applicantCurrAddress.getAddress());
			applicantCurrAddressData.setDistrict(applicantCurrAddress.getDistrict().intValue());
			applicantCurrAddressData.setSelectedAddressType(applicantCurrAddress.getSelectedAddressType().intValue());
			applicantCurrAddressData.setVidhansabhaArea(applicantCurrAddress.getVidhansabhaArea().intValue());
			applicantCurrAddressData.setVikasKhand(applicantCurrAddress.getVikasKhand().intValue());
			applicantCurrAddressData.setPanchayat(applicantCurrAddress.getPanchayat().intValue());
			applicantCurrAddressData.setWard(applicantCurrAddress.getWard().intValue());
			applicantCurrAddressData.setAddress(applicantCurrAddress.getAddress());
			applicantCurrAddressData.setHouseNo(applicantCurrAddress.getHouseNo());
			applicantCurrAddressData.setMobile1(applicantCurrAddress.getMobile1().intValue());
			applicantCurrAddressData.setMobile2(applicantCurrAddress.getMobile2().intValue());

			applicantAddressDataList.add(applicantPermAddressData);
			applicantAddressDataList.add(applicantCurrAddressData);

			// Prepare data for ManyToOne
			applicantPermAddressData.setApplicantInformationData(applicantInformationData);
			applicantCurrAddressData.setApplicantInformationData(applicantInformationData);

			applicantInformationData.setApplicantAddressData(applicantAddressDataList);

			applicantInformationData = applicantInformationRepository.save(applicantInformationData);
			// applicantAddressRepository.save(applicantPermAddressData);
			// applicantAddressRepository.save(applicantCurrAddressData);

			System.out.println("id === " + applicantInformationData.getApplicantInfoId());

			applicantInformation = new ApplicantInformation();
			
			return applicantInformation;


		} catch (Exception ex) {

			throw new Exception(" Unable to Save Data");
		}

	}

	public ApplicantInformation getApplicantInformationById(long applicantId) throws Exception {

		applicantInformationDataOptional = applicantInformationRepository.findById(applicantId);

		if (applicantInformationDataOptional.isPresent()) {
			applicantInformationData = applicantInformationDataOptional.get();
			ApplicantInformation applicantInformation = new ApplicantInformation();
			applicantInformation.setId(BigDecimal.valueOf(applicantInformationData.getApplicantInfoId()));
			applicantInformation.setName(applicantInformationData.getName());

			return applicantInformation;
		} else
			throw new Exception(" No Data found");
	}

	public ApplicantInformation updateApplicationInformation(ApplicantInformation applicantInfo) {

		ApplicantInformation applicantInformation;

		System.out.println("Indise Service Applicant Name " + applicantInfo.getName());

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

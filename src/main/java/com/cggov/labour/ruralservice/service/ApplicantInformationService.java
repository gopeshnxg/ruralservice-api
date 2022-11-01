package com.cggov.labour.ruralservice.service;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
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
	
	List<ApplicantInformationData> applicantInformationDataList;


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

			SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
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
			applicantPermAddressData.setMobile1(applicantPermAddress.getMobile1());
			applicantPermAddressData.setMobile2(applicantPermAddress.getMobile2());

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
			applicantCurrAddressData.setMobile1(applicantCurrAddress.getMobile1());
			applicantCurrAddressData.setMobile2(applicantCurrAddress.getMobile2());

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
			applicantInformation.setId(applicantInformationData.getApplicantInfoId());
			
			return applicantInformation;


		} catch (Exception ex) {

			throw new Exception(" Unable to Save Data");
		}

	}

	public ApplicantInformation getApplicantInformationById(int applicantId) throws Exception {

		applicantInformationDataOptional = applicantInformationRepository.findById(applicantId);

		if (applicantInformationDataOptional.isPresent()) {
			applicantInformationData = applicantInformationDataOptional.get();
			ApplicantInformation applicantInformation = new ApplicantInformation();
			applicantInformation.setId(applicantInformationData.getApplicantInfoId());
			applicantInformation.setName(applicantInformationData.getName());
			applicantInformation.setPmjjyMoney(applicantInformationData.isPmjjyMoney());
			applicantInformation.setKaryaSwaroop(applicantInformationData.getKaryaSwaroop());
			applicantInformation.setKaryaPrakriti1(applicantInformationData.getKaryaPrakriti1());
			applicantInformation.setKaryaPrakriti2(applicantInformationData.getKaryaPrakriti2());
			applicantInformation.setKaryaPrakriti3(applicantInformationData.getKaryaPrakriti3());
			applicantInformation.setName(applicantInformationData.getName());
			applicantInformation.nameasAADHAR(applicantInformationData.getNameAsAADHAR());
			applicantInformation.setFatherNameorHusbandName(applicantInformationData.getFatherNameorHusbandName());
			applicantInformation.setFatherORhusband(applicantInformationData.getFatherORhusband());
			applicantInformation.setMotherName(applicantInformationData.getMotherName());
			applicantInformation.setGender(applicantInformationData.getGender());
			applicantInformation.setMarriage(applicantInformationData.getMarriage());
			System.out.println("getDob====" + applicantInformationData.getDob());

			applicantInformation.setDob(applicantInformationData.getDob().toString());
			applicantInformation.setAge(applicantInformationData.getAge());
			applicantInformation.setCaste(applicantInformationData.getCaste());
			applicantInformation.setManrega(applicantInformationData.isManrega());
			applicantInformation.setRation(applicantInformationData.getRation());
			applicantInformation.setVoterId(applicantInformationData.getVoterId());
			applicantInformation.setRsBy(applicantInformationData.getRsBy());
			applicantInformation.setAadharCard(applicantInformationData.getAadharCard());
			applicantInformation.setBankName(applicantInformationData.getBankName());
			applicantInformation.setBranchName(applicantInformationData.getBranchName());
			applicantInformation.setAcNumber(applicantInformationData.getAcNumber());
			applicantInformation.setIfsCode(applicantInformationData.getIfsCode());
			applicantInformation.setEsiNumber(applicantInformationData.getEsiNumber());
			applicantInformation.setEpfNumber(applicantInformationData.getEpfNumber());
			
			ApplicantAddress applicantPermAddress = new ApplicantAddress();
			ApplicantAddress applicantCurrAddress = new ApplicantAddress();

			List<ApplicantAddressData> applicantAddressDataList = applicantInformationData.getApplicantAddressData();
			for (ApplicantAddressData applicantAddressData : applicantAddressDataList) {
				if("PERMANENT".equals(applicantAddressData.getAddressType())) { 
					applicantPermAddress.setAddress(applicantAddressData.getAddress());
					applicantPermAddress.setDistrict(applicantAddressData.getDistrict());
					applicantPermAddress.setSelectedAddressType(applicantAddressData.getSelectedAddressType());
					applicantPermAddress.setVidhansabhaArea(applicantAddressData.getVidhansabhaArea());
					applicantPermAddress.setVikasKhand(applicantAddressData.getVikasKhand());
					applicantPermAddress.setPanchayat(applicantAddressData.getPanchayat());
					applicantPermAddress.setWard(applicantAddressData.getWard());
					applicantPermAddress.setHouseNo(applicantAddressData.getHouseNo());

					
				}else {
					
					applicantCurrAddress.setAddress(applicantAddressData.getAddress());
					applicantCurrAddress.setDistrict(applicantAddressData.getDistrict());
					applicantCurrAddress.setSelectedAddressType(applicantAddressData.getSelectedAddressType());
					applicantCurrAddress.setVidhansabhaArea(applicantAddressData.getVidhansabhaArea());
					applicantCurrAddress.setVikasKhand(applicantAddressData.getVikasKhand());
					applicantCurrAddress.setPanchayat(applicantAddressData.getPanchayat());
					applicantCurrAddress.setWard(applicantAddressData.getWard());
					applicantCurrAddress.setHouseNo(applicantAddressData.getHouseNo());
					applicantCurrAddress.setMobile1(applicantAddressData.getMobile1());
					applicantCurrAddress.setMobile2(applicantAddressData.getMobile2());

				}
			}
				
		   applicantInformation.setPermanentAddress(applicantPermAddress);
		   applicantInformation.setCurrentAddress(applicantCurrAddress);


			return applicantInformation;
		} else
			throw new Exception(" No Data found");
	}

	
	public List<ApplicantInformation> getAllApplicantInformation() throws Exception {

		List<ApplicantInformation> applicantInformationList = new ArrayList<ApplicantInformation>();
		
		applicantInformationDataList = applicantInformationRepository.findByStatus(1);
		

		if (applicantInformationDataList.size() > 0) {
			
			for (ApplicantInformationData applicantInformationData : applicantInformationDataList) {
				
				
				ApplicantInformation applicantInformation = new ApplicantInformation();
				
				applicantInformation.setId(applicantInformationData.getApplicantInfoId());
				applicantInformation.setName(applicantInformationData.getName());
				applicantInformation.setPmjjyMoney(applicantInformationData.isPmjjyMoney());
				applicantInformation.setKaryaSwaroop(applicantInformationData.getKaryaSwaroop());
				applicantInformation.setKaryaPrakriti1(applicantInformationData.getKaryaPrakriti1());
				applicantInformation.setKaryaPrakriti2(applicantInformationData.getKaryaPrakriti2());
				applicantInformation.setKaryaPrakriti3(applicantInformationData.getKaryaPrakriti3());
				applicantInformation.setName(applicantInformationData.getName());
				applicantInformation.nameasAADHAR(applicantInformationData.getNameAsAADHAR());
				applicantInformation.setFatherNameorHusbandName(applicantInformationData.getFatherNameorHusbandName());
				applicantInformation.setFatherORhusband(applicantInformationData.getFatherORhusband());
				applicantInformation.setMotherName(applicantInformationData.getMotherName());
				applicantInformation.setGender(applicantInformationData.getGender());
				applicantInformation.setMarriage(applicantInformationData.getMarriage());
				System.out.println("getDob====" + applicantInformationData.getDob());

				applicantInformation.setDob(applicantInformationData.getDob().toString());
				applicantInformation.setAge(applicantInformationData.getAge());
				applicantInformation.setCaste(applicantInformationData.getCaste());
				applicantInformation.setManrega(applicantInformationData.isManrega());
				applicantInformation.setRation(applicantInformationData.getRation());
				applicantInformation.setVoterId(applicantInformationData.getVoterId());
				applicantInformation.setRsBy(applicantInformationData.getRsBy());
				applicantInformation.setAadharCard(applicantInformationData.getAadharCard());
				applicantInformation.setBankName(applicantInformationData.getBankName());
				applicantInformation.setBranchName(applicantInformationData.getBranchName());
				applicantInformation.setAcNumber(applicantInformationData.getAcNumber());
				applicantInformation.setIfsCode(applicantInformationData.getIfsCode());
				applicantInformation.setEsiNumber(applicantInformationData.getEsiNumber());
				applicantInformation.setEpfNumber(applicantInformationData.getEpfNumber());
				
				ApplicantAddress applicantPermAddress = new ApplicantAddress();
				ApplicantAddress applicantCurrAddress = new ApplicantAddress();

				List<ApplicantAddressData> applicantAddressDataList = applicantInformationData.getApplicantAddressData();
				for (ApplicantAddressData applicantAddressData : applicantAddressDataList) {
					if("PERMANENT".equals(applicantAddressData.getAddressType())) { 
						applicantPermAddress.setAddress(applicantAddressData.getAddress());
						applicantPermAddress.setDistrict(applicantAddressData.getDistrict());
						applicantPermAddress.setSelectedAddressType(applicantAddressData.getSelectedAddressType());
						applicantPermAddress.setVidhansabhaArea(applicantAddressData.getVidhansabhaArea());
						applicantPermAddress.setVikasKhand(applicantAddressData.getVikasKhand());
						applicantPermAddress.setPanchayat(applicantAddressData.getPanchayat());
						applicantPermAddress.setWard(applicantAddressData.getWard());
						applicantPermAddress.setHouseNo(applicantAddressData.getHouseNo());

						
					}else {
						
						applicantCurrAddress.setAddress(applicantAddressData.getAddress());
						applicantCurrAddress.setDistrict(applicantAddressData.getDistrict());
						applicantCurrAddress.setSelectedAddressType(applicantAddressData.getSelectedAddressType());
						applicantCurrAddress.setVidhansabhaArea(applicantAddressData.getVidhansabhaArea());
						applicantCurrAddress.setVikasKhand(applicantAddressData.getVikasKhand());
						applicantCurrAddress.setPanchayat(applicantAddressData.getPanchayat());
						applicantCurrAddress.setWard(applicantAddressData.getWard());
						applicantCurrAddress.setHouseNo(applicantAddressData.getHouseNo());
						applicantCurrAddress.setMobile1(applicantAddressData.getMobile1());
						applicantCurrAddress.setMobile2(applicantAddressData.getMobile2());

					}
				}
					
			   applicantInformation.setPermanentAddress(applicantPermAddress);
			   applicantInformation.setCurrentAddress(applicantCurrAddress);
			   
			   applicantInformationList.add(applicantInformation);

			}
			


			return applicantInformationList;
		} else
			throw new Exception(" No Data found");
	}

	public ApplicantInformation updateApplicationInformation(int id, ApplicantInformation applicantInfo) throws ParseException {

		ApplicantInformation applicantInformation;

		applicantInformationDataOptional = applicantInformationRepository.findById(id);
		if (applicantInformationDataOptional.isPresent()) {
			
			applicantInformationData = applicantInformationDataOptional.get();
			applicantInformationData.setName(applicantInfo.getName());
			applicantInformationData.setPmjjyMoney(applicantInfo.getPmjjyMoney());
			applicantInformationData.setKaryaSwaroop(applicantInfo.getKaryaSwaroop().intValue());
			applicantInformationData.setKaryaPrakriti1(applicantInfo.getKaryaPrakriti1().intValue());
			applicantInformationData.setKaryaPrakriti2(applicantInfo.getKaryaPrakriti2().intValue());
			applicantInformationData.setKaryaPrakriti3(applicantInfo.getKaryaPrakriti3().intValue());
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

			ApplicantAddress applicantPermAddress = applicantInfo.getPermanentAddress();
			System.out.println("applicantPermAddress====" + applicantPermAddress.getAddress());

			ApplicantAddress applicantCurrAddress = applicantInfo.getCurrentAddress();
			System.out.println("applicantCurrAddress====" + applicantCurrAddress.getAddress());

			List<ApplicantAddressData> applicantAddressDataList = applicantInformationData.getApplicantAddressData();

			for (ApplicantAddressData applicantAddressData : applicantAddressDataList) {
				if("PERMANENT".equals(applicantAddressData.getAddressType())) { 
					applicantAddressData.setAddress(applicantPermAddress.getAddress());
					applicantAddressData.setDistrict(applicantPermAddress.getDistrict());
					applicantAddressData.setSelectedAddressType(applicantPermAddress.getSelectedAddressType());
					applicantAddressData.setVidhansabhaArea(applicantPermAddress.getVidhansabhaArea());
					applicantAddressData.setVikasKhand(applicantPermAddress.getVikasKhand());
					applicantAddressData.setPanchayat(applicantPermAddress.getPanchayat());
					applicantAddressData.setWard(applicantPermAddress.getWard());
					applicantAddressData.setHouseNo(applicantPermAddress.getHouseNo());

					
				}else {
					
					applicantAddressData.setAddress(applicantCurrAddress.getAddress());
					applicantAddressData.setDistrict(applicantCurrAddress.getDistrict());
					applicantAddressData.setSelectedAddressType(applicantCurrAddress.getSelectedAddressType());
					applicantAddressData.setVidhansabhaArea(applicantCurrAddress.getVidhansabhaArea());
					applicantAddressData.setVikasKhand(applicantCurrAddress.getVikasKhand());
					applicantAddressData.setPanchayat(applicantCurrAddress.getPanchayat());
					applicantAddressData.setWard(applicantCurrAddress.getWard());
					applicantAddressData.setHouseNo(applicantCurrAddress.getHouseNo());
					applicantAddressData.setMobile1(applicantCurrAddress.getMobile1());
					applicantAddressData.setMobile2(applicantCurrAddress.getMobile2());

				}
			}

			applicantInformationData.setApplicantAddressData(applicantAddressDataList);


		}
		System.out.println("Indise Service Applicant Name " + applicantInfo.getName());



		applicantInformationRepository.save(applicantInformationData);

		applicantInformation = new ApplicantInformation();
		applicantInformation.setId(applicantInformationData.getApplicantInfoId());
		applicantInformation.setName(applicantInformationData.getName());

		return applicantInformation;
	}

	public ApplicantInformation deleteApplicationInformation(int id) {

		ApplicantInformation applicantInformation;

		applicantInformationDataOptional = applicantInformationRepository.findById(id);
		if (applicantInformationDataOptional.isPresent()) {
			
			applicantInformationData = applicantInformationDataOptional.get();
			applicantInformationData.setStatus(0);


		}

		applicantInformationRepository.save(applicantInformationData);

		applicantInformation = new ApplicantInformation();
		applicantInformation.setId(applicantInformationData.getApplicantInfoId());
		applicantInformation.setName(applicantInformationData.getName());

		return applicantInformation;
	}

}

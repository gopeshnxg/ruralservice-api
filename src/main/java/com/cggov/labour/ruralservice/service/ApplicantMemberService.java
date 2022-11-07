package com.cggov.labour.ruralservice.service;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cggov.labour.ruralservice.api.model.ApplicantAddress;
import com.cggov.labour.ruralservice.api.model.ApplicantFamily;
import com.cggov.labour.ruralservice.api.model.ApplicantFamilyMembers;
import com.cggov.labour.ruralservice.api.model.ApplicantInformation;
import com.cggov.labour.ruralservice.datamodel.ApplicantAddressData;
import com.cggov.labour.ruralservice.datamodel.ApplicantInformationData;
import com.cggov.labour.ruralservice.datamodel.ApplicantMemberData;
import com.cggov.labour.ruralservice.repository.ApplicantAddressRepository;
import com.cggov.labour.ruralservice.repository.ApplicantInformationRepository;
import com.cggov.labour.ruralservice.repository.ApplicantMemberRepository;

@Service
public class ApplicantMemberService {

	ApplicantInformationData applicantInformationData;

	List<ApplicantInformationData> applicantInformationDataList;


	@Autowired
	ApplicantMemberRepository apllicantMemberRepository;


	/**
	 * @param applicantFamily
	 * @return
	 * @throws ParseException
	 */
	public ApplicantFamily createOrUpdateOrDeleteApplicantMember(ApplicantFamily applicantFamily) throws ParseException {
		// TODO Auto-generated method stub

		List<ApplicantMemberData> memberDataList = new ArrayList<ApplicantMemberData>();

		int applicatId = applicantFamily.getApplicantId();

		List<ApplicantFamilyMembers> memberList = applicantFamily.getMembers();
		for (ApplicantFamilyMembers applicantFamilyMembers : memberList) {

			int memberId = applicantFamilyMembers.getMemberId();
			// Check if newMemberId
			if (memberId == 0) {

				System.out.println(" Adding New Member");
				ApplicantMemberData applicantMemberData = new ApplicantMemberData();
				applicantMemberData.setApplicantId(applicatId);
				applicantMemberData.setMemberName(applicantFamilyMembers.getMemberName());
				applicantMemberData.setRelation(applicantFamilyMembers.getRelation());

				SimpleDateFormat sdf1 = new SimpleDateFormat("dd-MM-yyyy");
				java.util.Date date = sdf1.parse(applicantFamilyMembers.getMemberDOB().toString());
				java.sql.Date sqlStartDate = new java.sql.Date(date.getTime());
				System.out.println("sqlStartDate====" + sqlStartDate);

				applicantMemberData.setMemberDOB("2010-10-10");
				applicantMemberData.setAge(applicantFamilyMembers.getAge());
				applicantMemberData.setMemberGender(applicantFamilyMembers.getMemberGender());
				applicantMemberData.setMemberAadhar(applicantFamilyMembers.getMemberAadhar());
				applicantMemberData.setNominee(applicantFamilyMembers.getNominee());
				applicantMemberData.setMemberPercentDistribution(applicantFamilyMembers.getMemberPercentDistribution());
				applicantMemberData.setMemberEducation(applicantFamilyMembers.getMemberEducation());
				applicantMemberData.setMemberSchoolGrade(applicantFamilyMembers.getMemberSchoolGrade());
				applicantMemberData.setMemberMaritalStatus(applicantFamilyMembers.getMemberMaritalStatus());
				applicantMemberData.setProgramName(applicantFamilyMembers.getProgramName());
				applicantMemberData.setStatus(1);

				//memberDataList.add(applicantMemberData);
				apllicantMemberRepository.save(applicantMemberData);

			} else { // For existing memberId

				System.out.println(" Updating Existing Member");

				Optional<ApplicantMemberData> applicantMemberDataOptonal = apllicantMemberRepository.findById(memberId);
				if (applicantMemberDataOptonal.isPresent()) {

					ApplicantMemberData applicantMemberData = applicantMemberDataOptonal.get();

					//applicantMemberData.setMemberId(applicantMemberData.getMemberId());

					applicantMemberData.setApplicantId(applicatId);
					applicantMemberData.setMemberName(applicantFamilyMembers.getMemberName());
					applicantMemberData.setRelation(applicantFamilyMembers.getRelation());

					SimpleDateFormat sdf1 = new SimpleDateFormat("dd-MM-yyyy");
					java.util.Date date = sdf1.parse(applicantFamilyMembers.getMemberDOB().toString());
					java.sql.Date sqlStartDate = new java.sql.Date(date.getTime());
					System.out.println("sqlStartDate====" + sqlStartDate);

					applicantMemberData.setMemberDOB("2010-10-10");
					applicantMemberData.setAge(applicantFamilyMembers.getAge());
					applicantMemberData.setMemberGender(applicantFamilyMembers.getMemberGender());
					applicantMemberData.setMemberAadhar(applicantFamilyMembers.getMemberAadhar());
					applicantMemberData.setNominee(applicantFamilyMembers.getNominee());
					applicantMemberData
							.setMemberPercentDistribution(applicantFamilyMembers.getMemberPercentDistribution());
					applicantMemberData.setMemberEducation(applicantFamilyMembers.getMemberEducation());
					applicantMemberData.setMemberSchoolGrade(applicantFamilyMembers.getMemberSchoolGrade());
					applicantMemberData.setMemberMaritalStatus(applicantFamilyMembers.getMemberMaritalStatus());
					applicantMemberData.setProgramName(applicantFamilyMembers.getProgramName());
					applicantMemberData.setStatus(applicantFamilyMembers.getStatus());

					//memberDataList.add(applicantMemberData);
					apllicantMemberRepository.save(applicantMemberData);

				}

			}

		}


		return applicantFamily;
	}


	public ApplicantFamily getApplicantMember(int applicantid) {
		
		ApplicantFamily applicantFamily  = new ApplicantFamily();
		
		applicantFamily.setApplicantId(applicantid);

		List<ApplicantMemberData> applicantMemberDataList = apllicantMemberRepository.findByApplicantIdAndStatus(applicantid, 1);
		
		System.out.println(" Finde Members "+applicantMemberDataList.size()+"  for " + applicantid + " is " +applicantMemberDataList);
		
		for (ApplicantMemberData applicantMemberData : applicantMemberDataList) {
			
			ApplicantFamilyMembers applicantFamilyMembers = new ApplicantFamilyMembers();
			System.out.println(  " member id = " +applicantMemberData.getMemberId());
			applicantFamilyMembers.setMemberId(applicantMemberData.getMemberId());

			applicantFamilyMembers.setMemberName(applicantMemberData.getMemberName());
			applicantFamilyMembers.setRelation(applicantMemberData.getRelation());
			applicantFamilyMembers.setAge(applicantMemberData.getAge());
			applicantFamilyMembers.setMemberGender(applicantMemberData.getMemberGender());
			applicantFamilyMembers.setMemberAadhar(applicantMemberData.getMemberAadhar());
			

			applicantFamilyMembers.setMemberDOB(applicantMemberData.getMemberDOB());
			applicantFamilyMembers.setNominee(applicantMemberData.isNominee());
			applicantFamilyMembers.setMemberPercentDistribution(applicantMemberData.getMemberPercentDistribution());
			applicantFamilyMembers.setMemberEducation(applicantMemberData.getMemberEducation());
			applicantFamilyMembers.setMemberSchoolGrade(applicantMemberData.getMemberSchoolGrade());
			applicantFamilyMembers.setMemberMaritalStatus(applicantMemberData.getMemberMaritalStatus());
			applicantFamilyMembers.setProgramName(applicantMemberData.getProgramName());

			applicantFamilyMembers.setStatus(applicantMemberData.getStatus());

			applicantFamily.addMembersItem(applicantFamilyMembers);
			
		}

		return applicantFamily;
	}

}

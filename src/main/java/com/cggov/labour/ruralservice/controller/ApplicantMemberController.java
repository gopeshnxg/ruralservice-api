package com.cggov.labour.ruralservice.controller;

import java.text.ParseException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cggov.labour.ruralservice.api.model.ApplicantFamily;
import com.cggov.labour.ruralservice.api.model.ApplicantInformation;
import com.cggov.labour.ruralservice.service.ApplicantInformationService;
import com.cggov.labour.ruralservice.service.ApplicantMemberService;

@RestController
@RequestMapping(path = "/cgruralservice/api/v1")
public class ApplicantMemberController {
	
	
	@Autowired
	ApplicantMemberService applicantMemberService;


	@PutMapping(value = "/applicantinformation/familymember", consumes = "application/json", produces = "application/json")    
	ResponseEntity<Object> createOrUpdateOrDeleteApplicantMember(@RequestBody ApplicantFamily applicantFamily) {
		
		
		try {
			ApplicantFamily applicantInformation = applicantMemberService.createOrUpdateOrDeleteApplicantMember(applicantFamily);
			
			return  ResponseHandler.generateResponse("Successfully added data!", HttpStatus.CREATED, applicantFamily);
        } catch (Exception e) {
        	
            return ResponseHandler.generateResponse(e.getMessage(), HttpStatus.MULTI_STATUS, null);
        }
		
	}

	@GetMapping(value = "/applicantinformation/{applicantid}/familymember")    
	ResponseEntity<Object> getApplicantMember(@PathVariable("applicantid") int applicantid) {
		
		
		try {
			System.out.println(" Get member for applicant Id " + applicantid);
			ApplicantFamily applicantFamily = applicantMemberService.getApplicantMember(applicantid);
			
			return new ResponseEntity<>(applicantFamily, HttpStatus.OK);
        } catch (Exception e) {
        	
            return ResponseHandler.generateResponse(e.getMessage(), HttpStatus.NOT_FOUND, null);
        }
		
	}

}

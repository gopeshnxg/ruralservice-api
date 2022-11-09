package com.cggov.labour.ruralservice.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.cggov.labour.ruralservice.api.model.ApplicantFamily;
import com.cggov.labour.ruralservice.api.model.ApplicantInformation;

import java.util.HashMap;
import java.util.Map;

public class ResponseHandler {
	public static ResponseEntity<Object> generateResponse(String message, HttpStatus status, Object responseObj) {
		Map<String, Object> map = new HashMap<String, Object>();

		if (responseObj != null && (responseObj instanceof ApplicantInformation)) {
			map.put("message", message);
			map.put("status", status.value());
			map.put("applicantId", ((ApplicantInformation) responseObj).getApplicantId());

			return new ResponseEntity<Object>(map, status);
		}
		if (responseObj != null && (responseObj instanceof ApplicantFamily)) {
			map.put("message", message);
			map.put("status", status.value());
			map.put("members created or updated: ", ((ApplicantFamily) responseObj).getMembers().size());

			return new ResponseEntity<Object>(map, status);
		}
		else
		{			map.put("message", message);
					map.put("status", status.value());
					map.put("applicantId", null);

			return new ResponseEntity<Object>(map, status);
		}
	}
}
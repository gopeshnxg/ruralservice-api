package com.cggov.labour.ruralservice.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.cggov.labour.ruralservice.api.model.ApplicantInformation;

import java.util.HashMap;
import java.util.Map;

public class ResponseHandler {
	public static ResponseEntity<Object> generateResponse(String message, HttpStatus status, Object responseObj) {
		Map<String, Object> map = new HashMap<String, Object>();

		if (responseObj != null) {
			map.put("message", message);
			map.put("status", status.value());
			map.put("applicantId", ((ApplicantInformation) responseObj).getId());

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
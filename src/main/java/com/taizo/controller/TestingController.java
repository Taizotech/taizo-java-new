package com.taizo.controller;


import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.taizo.model.CanLeadModel;
import com.taizo.repository.CanLeadRepository;


@RestController
public class TestingController {
	
	@Autowired
	CanLeadRepository canLeadRepository;	
	
	@GetMapping("/getCanDetails")
    public ResponseEntity<?> getCanDetails(@RequestParam(required = false) Long mn) {
        HashMap<String, Object> map = new HashMap<>();

        if (mn == null) {
            map.put("statuscode", 400);
            map.put("message", "Mobile number is required");
            return new ResponseEntity<>(map, HttpStatus.BAD_REQUEST);
        }

        try {
            CanLeadModel canLead = canLeadRepository.findByMobileNumber(mn);

            if (canLead != null) {
                map.put("statuscode", 200);
                map.put("message", "success");
                map.put("canLeadDetails", canLead);
                return new ResponseEntity<>(map, HttpStatus.OK);
            } else {
                map.put("statuscode", 404);
                map.put("message", "CanLeadModel not found for mobile number: " + mn);
                return new ResponseEntity<>(map, HttpStatus.NOT_FOUND);
            }
        } catch (Exception e) {
            map.put("statuscode", 500);
            map.put("message", "Internal Server Error");
            return new ResponseEntity<>(map, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}

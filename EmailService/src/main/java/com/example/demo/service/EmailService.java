package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modal.EmailOtp;
import com.example.demo.repository.EmailOtpRepository;

@Service
public class EmailService {

	@Autowired
	private EmailOtpRepository emailOtpRepo;
	
	public String addEmailOtp(EmailOtp emailOtp)
	{
		EmailOtp emailOtp1=emailOtpRepo.save(emailOtp);
		if(emailOtp1!=null)
		    return "email otp saved successfully";
		else
			return "something went wrong";
	}
	
	public List<EmailOtp> getEmailOtpByEmail(String email) {
		List<EmailOtp> emailOtp=emailOtpRepo.findByEmail(email);
	    return emailOtp;
	}
	
}

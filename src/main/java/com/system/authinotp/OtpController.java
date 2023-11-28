package com.system.authinotp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/otp")
public class OtpController {

    @Autowired
    private OtpService otpService;

    @PostMapping("/generate")
    public String generateOtp() {
        // Generate and send OTP to the user (e.g., via email or SMS)
        String generatedOtp = otpService.generateOtp();
        // Implement your logic to send the OTP (e.g., via email or SMS)
        return "OTP generated and sent to the user.";
    }

    @PostMapping("/validate")
    public String validateOtp(@RequestParam String userEnteredOtp) {
        // Implement your logic to validate the user-entered OTP
        // Compare userEnteredOtp with the OTP sent to the user
        // Return success or failure message accordingly
        return "OTP validation result.";
    }
}

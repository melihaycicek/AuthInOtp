package com.system.authinotp;

import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class OtpService {

    public String generateOtp() {
        // Implement your OTP generation logic here (e.g., using a random number generator)
        Random random = new Random();
        int otp = 100000 + random.nextInt(900000);
        return String.valueOf(otp);
    }
}

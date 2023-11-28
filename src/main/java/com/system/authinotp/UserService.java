package com.system.authinotp;

import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final PasswordService passwordService;

    public UserService(UserRepository userRepository, PasswordService passwordService) {
        this.userRepository = userRepository;
        this.passwordService = passwordService;
    }

    public void registerUser(User user) {
        // Kullanıcının parolasını hash'le
        user.setPassword(passwordService.hashPassword(user.getPassword()));
        // Kullanıcıyı veritabanına kaydet
        userRepository.save(user);
    }

    public boolean authenticateUser(String username, String password) {
        // Kullanıcının adına göre veritabanından kullanıcıyı al
        User user = userRepository.findByUsername(username);
        if (user != null) {
            // Girilen parolanın doğruluğunu kontrol et
            return passwordService.checkPassword(password, user.getPassword());
        }
        return false;
    }
}

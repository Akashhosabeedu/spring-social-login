//package com.akash.security.facebookloginexample.service;
//
//import com.akash.security.facebookloginexample.entity.Provider;
//import com.akash.security.facebookloginexample.entity.User;
//import com.akash.security.facebookloginexample.repo.UserRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//@Service
//public class UserService {
//
//    @Autowired
//    private UserRepository repo;
//
//    public void processOAuthPostLogin(String username) {
//        User existUser = repo.getUserByUsername(username);
//
//        if (existUser == null) {
//            User newUser = new User();
//            newUser.setUsername(username);
//            newUser.setProvider(Provider.FACEBOOK);
//            newUser.setEnable(true);
//
//            repo.save(newUser);
//        }
//
//    }
//}
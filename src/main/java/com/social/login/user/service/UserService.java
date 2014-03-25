package com.social.login.user.service;

import com.social.login.model.User;
import com.social.login.user.dto.RegistrationForm;

public interface UserService {

    public User registerNewUserAccount(RegistrationForm userAccountData) throws DuplicateEmailException;
}
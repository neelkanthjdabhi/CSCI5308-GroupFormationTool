package com.app.group15.UserManagement.SignupManagement;

import com.app.group15.UserManagement.UserAbstractDao;

public interface ISignUpServiceInjector {
    public void injectUserDao(UserAbstractDao userDao);
}

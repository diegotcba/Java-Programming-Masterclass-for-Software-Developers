package com.diegot;

/**
 * Created by DiegoT on 25/06/2019.
 */
public class ExtendedPassword extends Password {
    private int decryptedPassword;

    public ExtendedPassword(int password) {
        super(password);
        this.decryptedPassword = password;
    }

}

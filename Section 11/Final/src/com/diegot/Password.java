package com.diegot;

/**
 * Created by DiegoT on 25/06/2019.
 */
public class Password {
    private static final int key = 1243123;

    private final int encryptedPassword;

    public Password(int password) {
        this.encryptedPassword = encryptDecrypt(password);
    }

    private int encryptDecrypt(int password) {
        return password ^ key ;
    }

    public final void storePassword() {
        System.out.println("Saving password as " + encryptedPassword);
    }

    public boolean letMeIn(int password) {
        if (encryptDecrypt(password) == encryptedPassword) {
            System.out.println("Welcome");
            return true;
        }

        System.out.println("Nope, you cannot come in");
        return false;
    }
}

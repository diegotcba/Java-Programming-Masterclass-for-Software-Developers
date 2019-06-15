package com.diegot;

public class Main {

    public static void main(String[] args) {
	    ITelephone diegoPhone;
        diegoPhone = new DeskPhone(1243676);

        diegoPhone.powerOn();
        diegoPhone.callPhone(1243676);
        diegoPhone.answer();

        diegoPhone = new MobilePhone(1233334);
        diegoPhone.powerOn();
        diegoPhone.callPhone(1233334);
        diegoPhone.answer();
    }
}

package com.company;

public class Main {

    public static void main(String[] args) {
	    int switchValue = 6;

        switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3:case 4:case 5:
                System.out.println("Value was a 3, or a 4, or a 5");
                System.out.println("Actually was a " + switchValue);
                break;
            default:
                System.out.println("Was not 1,2,3,4 or 5");
                break;
        }

        // Create a new switch statement using char instead of int
        // create a new char variable
        // create a switch statement testing for
        // A, B, C, D, or E
        // display a message if any of these are found and then break
        // Add a default which displays a message saying not found
        char letter = 'A';

        switch (letter) {
            case 'A':
                System.out.println("Was letter A");
                break;
            case 'B':
                System.out.println("Was letter B");
                break;
            case 'C':
                System.out.println("Was letter C");
                break;
            case 'D':
                System.out.println("Was letter D");
                break;
            case 'E':
                System.out.println("Was letter E");
                break;
            default:
                System.out.println("Was not letter A,B,C,D or E");
                break;
        }

        String month = "january";

        switch (month.toLowerCase()) {
            case "january":
                System.out.println("Jan");
                break;
            case "june":
                System.out.println("Jun");
                break;
            default:
                System.out.println("Not sure");
                break;
        }
    }
}

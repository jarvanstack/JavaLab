package Git.Gitee.javalab.Lab11;

import java.util.Scanner;

public class SocSecProcessor {
    /**
     * Task 2.1
     * 1. In the main method:
     * a. The main method should read a name and social security number from the user as
     * Strings.
     * b. The main method should contain a try-catch statement. This statement tries to
     * check if the social security number is valid by using the method isValid. If the
     * social security number is valid, it prints the name and social security number. If a
     * SocSecException is thrown, it should catch it and print out the name, social
     * security number entered, and an associated error message indicating why the
     * social security number is invalid.
     * c. A loop should be used to allow the user to continue until the user indicates that
     * they do not want to continue.
     *
     * @param args
     */
    public static void main(String[] args) {
        //ead a name and social security number from the user as
        //     * Strings.
        boolean isContinue = true;
        //
        char inputIsContinue;
        //new scanner
        Scanner scanner = new Scanner(System.in);
        //name
        String name;
        //ssn
        String ssn;

        while (isContinue) {
            System.out.print("name?   ");
            name = scanner.nextLine();
            System.out.print("SSN?   ");
            ssn = scanner.nextLine();
            try {
                //This statement tries to
                //check if the social security number is valid by using the method isValid.

                if (isValid(ssn)) {
                    //If the
                    //social security number is valid,
                    // it prints the name and social security number.
                    System.out.println(name + " " + ssn + " is valid");
                }
            } catch (SocSecException e) {
                //If a
                //SocSecException is thrown,
                // it should catch it and print out the name, social
                //security number entered, and an associated error message indicating why the
                //social security number is invalid.
                System.out.println(e);
            }
            System.out.print("Continue?   ");
            inputIsContinue = scanner.nextLine().toLowerCase().charAt(0);
            isContinue = inputIsContinue == 'y';


        }
    }

    /**
     * Task #1.2
     * 2. Create a driver program called SocSecProcessor.java. This program will have a
     * main method and a static method called isValid that will check if the social
     * security number is valid.
     *
     * @param ssn ssn
     * @return boolean
     */
    public static boolean isValid(String ssn) throws SocSecException {//抛出异常 try catch才能捕获。
        //This method throws a SocSecException.
        //(i) Number of characters not equal to 11. (Just check the length of the string)
        if (ssn.length() != 11) {
            //必须添加 throw 关键字，不然就凉凉。
            throw new SocSecException("wrong number of characters");
        }
        // (ii) Dashes in the wrong spots.
        else if (ssn.charAt(3) != '-' || ssn.charAt(6) != '-') {
            throw new SocSecException(" dashes at wrong positions");
        }
        //(iii) Any non-digits in the SSN.
        for (int i = 0; i < ssn.length(); i++) {
            if (!(Character.isDigit(ssn.charAt(i)) || ssn.charAt(i) == '-')) {
                throw new SocSecException(" contains a character that is not a digit");
            }
        }
        return true;
    }
}

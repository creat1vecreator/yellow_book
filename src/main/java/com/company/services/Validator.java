package com.company.services;

class Validator {

    static boolean validateName(String name) {

        return name.matches("\\w+.(|-|)\\w+");
    }

    static boolean validateNumber(String number) {
        if (number.length() != 11)
            return false;
        return number.matches("\\d+");
    }

    static boolean validateAge(String age) {
        if (!age.matches("\\d+"))
            return false;
        int ageInt = Integer.parseInt(age);
        return ageInt > 0 && ageInt < 140;
    }
}
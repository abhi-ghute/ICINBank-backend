package com.icin.dto;

import java.util.Random;

public class AccountNumberGenerator {
    public static String generateAccountNumber() {
        final int ACCOUNT_NUMBER_LENGTH = 6;
        final String NUMBERS = "0123456789";
        StringBuilder accountNumber = new StringBuilder();
        accountNumber.append("886185");
        Random random = new Random();
        for (int i = 0; i < ACCOUNT_NUMBER_LENGTH; i++) {
            int index = random.nextInt(NUMBERS.length());
            accountNumber.append(NUMBERS.charAt(index));
        }

        return accountNumber.toString();
    }
}

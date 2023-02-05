package com.joaoaslan.linkencurtator.util;

public class LinkEncoder {
    private final static String alphaNumerics = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" +
                                                "abcdefghijklmnopqrstuvwxyz" +
                                                "1234567890";

    public static String generateCode() {
        int maxLength = randomNumeric();
        StringBuilder sb = new StringBuilder(maxLength);
        for (int i = 0; i < maxLength; i++) {
            int index = (int) (alphaNumerics.length() * Math.random());
            sb.append(alphaNumerics.charAt(index));
        }
        return sb.toString();
    }

    private static int randomNumeric() {
        return (int) (Math.random() * (10 - 5) + 5);
    }
}


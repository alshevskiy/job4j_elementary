package ru.job4j.array;

public class JavaNameValidator {
    public static boolean isNameValid(String name) {
        boolean valid = !name.isEmpty() && isLowerLatinLetter(name.codePointAt(0));
        if (valid) {
            for (int index = 1; index < name.length(); index++) {
                if (!isSpecialSymbol(name.codePointAt(index)) && !isUpperLatinLetter(name.codePointAt(index))
                        && !isLowerLatinLetter(name.codePointAt(index)) && !Character.isDigit(name.charAt(index))) {
                    valid = false;
                    break;
                }
            }
        }
        return valid;
    }

    public static boolean isSpecialSymbol(int code) {
        return code == 36 || code == 95;
    }

    public static boolean isUpperLatinLetter(int code) {
        return code >= 65 && code <= 90;
    }

    public static boolean isLowerLatinLetter(int code) {
        return code >= 97 && code <= 122;
    }
}
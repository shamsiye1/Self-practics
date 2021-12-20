package a_mentorRequiredPractice;

public class Q07_PasswordValidationTask {

    public static Boolean validPassword(String password) {

        boolean isUppercase = false;
        boolean isLowercase = false;
        boolean isSpecialCharacter = false;
        boolean isDigit = false;


        if (password.length() >= 6 && !password.contains(" ")) {

            for (int i = 0; i < password.length(); i++) {

                if (Character.isLowerCase(password.charAt(i))) {

                    isLowercase = true;
                }

                if (Character.isUpperCase(password.charAt(i))) {
                    isUppercase = true;
                }

                if (!(Character.isDigit(password.charAt(i)) || Character.isAlphabetic(password.charAt(i)))) { // none number either non alphabetic
                    isSpecialCharacter = true;
                }

                if (Character.isDigit(password.charAt(i))) {

                    isDigit = true;
                }
            }


        }


        return isDigit && isLowercase && isUppercase && isSpecialCharacter;
    }

    public static void main(String[] args) {

        String str="Xhhs55!";
        System.out.println(validPassword(str));


    }
}

package lexicon.se.utilExamples;

import java.security.SecureRandom;

public class PasswordGenerator {
    public static String generate() {
        String validChars = "abcdefghijklmnopgrstuvwxyz0123456789!@#%&*()-_=+[]{}:;,.<>?  " ;
        int passwordLength = 8;
        StringBuilder stringBuilder = new StringBuilder() ;
        SecureRandom random = new SecureRandom() ;
        for (int i= 0; i< passwordLength;i++){
          int randomIndex= random.nextInt(validChars.length()); // 1
            StringBuilder.append(Boolean.parseBoolean(String.valueOf(validChars.charAt(1)))) ;


        }
    return  stringBuilder.toString();
        }
    }


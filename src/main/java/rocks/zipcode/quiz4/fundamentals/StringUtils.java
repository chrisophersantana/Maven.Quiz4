package rocks.zipcode.quiz4.fundamentals;

/**
 * @author leon on 21/12/2018.
 */
public class StringUtils {
    public static Character getMiddleCharacter(String string) {
        return string.charAt(string.length()/2);
    }

    public static String capitalizeMiddleCharacter(String str) {
        char [] chars = str.toCharArray();
        chars[str.length()/2] = Character.toUpperCase(chars[str.length()/2]);

        return String.valueOf(chars);
    }

    public static String lowerCaseMiddleCharacter(String str) {
        char [] chars2 = str.toCharArray();
        chars2[str.length()/2] = Character.toLowerCase(chars2[str.length()/2]);

        return String.valueOf(chars2);

    }

    public static Boolean isIsogram(String str) {
        char[] chars = str.toCharArray();
        for(int i = 0;i<str.length();i++){
            int count = 0;
            char check = chars[i];
            for(char other : chars) {
                if(check == other) count++;
            }
            if(count > 1) return false;
        }

        return true;
    }

    public static Boolean hasDuplicateConsecutiveCharacters(String str) {
        for(int i =0; i< str.length()-1;i++){
            Character character1 = str.charAt(i);
            Character character2 = str.charAt(i+1);

            if(character1.equals(character2)) return true;
        }

        return false;
    }

    public static String removeConsecutiveDuplicateCharacters(String str) {
        int count = 0;

        for(int i =0; i< str.length()-1;i++){

            if (str.charAt(i) != str.charAt(i+1)){
                 count++;
            }

        }


        return String.valueOf(count);

    }

    public static String invertCasing(String str) {
        char[] chars = str.toCharArray();
        for(int i = 0;i < str.length();i++) {
            if (Character.isLowerCase(chars[i])) {
                chars[i] = Character.toUpperCase(chars[i]);
            } else {
                chars[i] = Character.toLowerCase(chars[i]);
            }
        }
        return String.valueOf(chars);
    }
}
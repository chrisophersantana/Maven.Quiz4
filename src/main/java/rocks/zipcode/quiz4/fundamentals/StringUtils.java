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

    public static Boolean isIsogram(String str) { return null; }

    public static Boolean hasDuplicateConsecutiveCharacters(String str) {
        for(int i =0; i< str.length()-1;i++){
            Character character1 = str.charAt(i);
            Character character2 = str.charAt(i+1);

            if(character1.equals(character2)) return true;
        }

        return false;
    }

    public static String removeConsecutiveDuplicateCharacters(String str) {


        return null;
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
package rocks.zipcode.quiz4.arrays;

/**
 * @author leon on 01/01/2019.
 */
public class ArrayUtils {
    public static String getMiddleElement(String[] values) {

        return values[values.length/2];
    }

    public static String[] removeMiddleElement(String[] values) {

        String[] arrayOne = new String[values.length-1];
        for(int i = 0; i<arrayOne.length/2;i++) {
            arrayOne[i] = values [i];
        }
        for (int i = values.length/2; i < arrayOne.length;i++) {
            arrayOne[i] = values[i+1];
        }

        return arrayOne;
    }

    public static String getLastElement(String[] values) {

        return values[values.length-1];
    }

    public static String[] removeLastElement(String[] values) {

        String[] array2 = new String[values.length-1];
        for (int i = 0; i < array2.length;i++){
            array2[i] = values[i];
        }

        return array2;
    }
}
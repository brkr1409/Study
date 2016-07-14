package test;

/**
 * @author: A.V.Verkhoglyad a.v.verkhoglyad@gmail.com
 * 14.07.16 16:24
 */
public abstract class ArrayHelper {

    private ArrayHelper() {}

    public static boolean isEmpty(Object[] arr) {
        return (arr == null || arr.length == 0);
    }

    public static boolean isNotEmpty(Object[] arr) {
        return !isEmpty(arr);
    }

}

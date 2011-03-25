package pl.krajewski.euler.problems.utils.classes;

import java.lang.reflect.Array;

public class ArrayUtils {

    public static <T>  T[] createArrayWithSizeAndValue(int size, T value, Class<?> classValue) {
        
        T[] array = getArrayForSizeAndClass(size, classValue);
        for(int i=0; i<size; i++) {
            array[i] = value;
        }
        
        return array;
    }

    @SuppressWarnings("unchecked")
    private static <T> T[] getArrayForSizeAndClass(int size, Class<?> classValue) {
        return (T[])Array.newInstance(classValue, size);
    }
}

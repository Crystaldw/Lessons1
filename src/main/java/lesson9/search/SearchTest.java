package lesson9.search;

import java.util.Arrays;

public class SearchTest {

    public static void main(String[] args) {

        int[] array = {3, 7, 1, 3, 9,2,14,78,16,12,0,7,2, 50};

        System.out.println("Результат линейноо поиска: ");
        System.out.println(SearchUtils.linearSearch(array, 78));

        Arrays.sort(array);

        System.out.println("Отсортированный массив:");
        System.out.println(Arrays.toString(array));

        System.out.println("Результат двоичного поиска: ");
        System.out.println(SearchUtils.binarySearch(array, 100));
    }
}

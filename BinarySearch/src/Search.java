public class Search {
    public static int binarySearch(int[] array, int value) {
        int first = 0;
        int last = array.length - 1;
        int middle;
        while (first <= last) {
            middle = (first + last) / 2;
            if (value < array[middle]) {
                last = middle - 1;
            } else if (value > array[middle]) {
                first = middle + 1;
            } else {
                return middle;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        int[] array = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};
        System.out.println(binarySearch(array, 2));  /* 0 */
        System.out.println(binarySearch(array, 11)); /* 4 */
        System.out.println(binarySearch(array, 79)); /*12 */
        System.out.println(binarySearch(array, 1));  /*-1 */
        System.out.println(binarySearch(array, 5));  /*-1 */
        System.out.println(binarySearch(array, 80)); /*-1 */
    }
}


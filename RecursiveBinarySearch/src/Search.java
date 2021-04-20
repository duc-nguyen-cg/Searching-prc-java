public class Search {

    public static int RecursiveBinarySearch(int[] array, int first, int last, int value){
        int middle;
        if (first <= last){
            middle = (first + last)/2;
            if (value < array[middle]){
                return RecursiveBinarySearch(array, first, middle - 1, value);
            } else if (value > array[middle]){
                return RecursiveBinarySearch(array, middle + 1, last, value);
            } else {
                return middle;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};
        int first = 0;
        int last = array.length - 1;
        System.out.println(RecursiveBinarySearch(array, first, last, 2));   /* 0 */
        System.out.println(RecursiveBinarySearch(array, first, last, 11));  /* 4 */
        System.out.println(RecursiveBinarySearch(array, first, last, 79));  /*12 */
        System.out.println(RecursiveBinarySearch(array, first, last, 1));   /*-1 */
        System.out.println(RecursiveBinarySearch(array, first, last, 5));   /*-1 */
        System.out.println(RecursiveBinarySearch(array, first, last, 80));  /*-1 */
    }
}

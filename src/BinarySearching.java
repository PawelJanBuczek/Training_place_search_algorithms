public class BinarySearching {
    //    Complexity O(log) in optimistic O(1)
   private static int binarySearchIterative(int array[], int wanted, int startIndex, int lastIndex) {

        while (startIndex <= lastIndex) {
            int mid = startIndex + (lastIndex - startIndex) / 2;

            if (array[mid] == wanted) return mid;

            if (array[mid] < wanted) startIndex = mid + 1;

            else lastIndex = mid - 1;
        }

        return -1;
    }

    private static int binarySearchRecursive(int array[], int wanted, int indexStart, int indexLast) {

        if (indexLast >= indexStart) {
            int mid = indexStart + (indexLast - indexStart) / 2;

            if (array[mid] == wanted) return mid;

            if (array[mid] > wanted) return binarySearchRecursive(array, wanted, indexStart, mid - 1);

            return binarySearchRecursive(array, wanted, mid + 1, indexLast);
        }

        return -1;
    }

    public static void main(String[] args) {
       /* Test place */
        int array[] = {3, 4, 5, 6, 7, 8, 9};
        int lastIndex = array.length - 1;
        int wanted = 4;
        int result = binarySearchIterative(array, wanted, 0, lastIndex);
        if (result == -1)
            System.out.println("Not found");
        else
            System.out.println("Element found at index " + result);
    }

}

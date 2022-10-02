public class LinearSearching {

//    Complexity O(n) in optimistic O(1)

    private static boolean linearSearchIsIn(int[] arr, int found) {
        for (int i : arr) {
            if (i == found) return true;
        }
        return false;
    }

    private static int linearSearchFindIndexElement(int[] arr, int found) {
        if(arr.length == 0) return -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == found) return i;
        }
        return -1;
    }
    private static int linearSearchFindElement(int[]arr, int found){
        if(arr.length == 0) return -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == found) return arr[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        int array[] = {2, 4, 0, 1, 9};
        int x = 1;
        System.out.println("Check is in " + linearSearchIsIn(array, x) + " ||  Check is not in " + linearSearchIsIn(array, 7));
        System.out.println("Index : " + linearSearchFindIndexElement(array,x));
        System.out.println("Found Element : " + linearSearchFindElement(array,x));

    }

}

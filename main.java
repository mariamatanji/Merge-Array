public class ArrayMerge {

    public static void main(String[] args) {

        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {6, 7, 8, 9, 10};

        System.out.println("Array 1:");
        for (int i : array1) {
            System.out.print(i + " ");
        }

        System.out.println("\n\nArray 2:");
        for (int i : array2) {
            System.out.print(i + " ");
        }

        // create a new array of size array1.length + array2.length
        int[] mergedArray = new int[array1.length + array2.length];

        // copy elements from array1 to the new array
        for (int i = 0; i < array1.length; i++)
            mergedArray[i] = array1[i];

        // copy elements from array2 to the new array
        for (int i = 0; i < array2.length; i++)
            mergedArray[i + array1.length] = array2[i];

        // print merged array
        System.out.println("\n\nMerged Array:");
        for (int i : mergedArray) {
            System.out.print(i + " ");
        }
    }
}

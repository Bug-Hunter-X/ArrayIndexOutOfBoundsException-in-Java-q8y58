public class MyClass {
    public static void main(String[] args) {
        int[] arr = new int[5];
        if (5 >= 0 && 5 < arr.length) { //Check if the index is within the bounds
            arr[5] = 10;
        }
        else{
            System.out.println("Index out of bounds");
        }
        System.out.println(arr[4]);
    }
}
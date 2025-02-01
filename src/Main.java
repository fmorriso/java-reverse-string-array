import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        String[] a1 =  {"p","a","w","s"}; // swap spelled backwards
        System.out.format("Original: %s%n", Arrays.toString(a1));

        // reverse in-place
        reverseUsingWhileLoop(a1);
        System.out.format("Reversed: %s%n", Arrays.toString(a1));

        // now reverse it back to the original
        reverseUsingWhileLoop(a1);
        System.out.format("Original: %s%n", Arrays.toString(a1));

        // reverse using collection
        reverseUsingCollection(a1);
        System.out.format("Reversed: %s%n", Arrays.toString(a1));

        // now reverse back to the original
        reverseUsingCollection(a1);
        System.out.format("Original: %s%n", Arrays.toString(a1));

        // reverse using a Stack
        reverseUsingStack(a1);
        System.out.format("Reversed: %s%n", Arrays.toString(a1));

        // reverse back to the original
        reverseUsingStack(a1);
        System.out.format("Original: %s%n", Arrays.toString(a1));
    }

    private static void reverseUsingWhileLoop(String[] array) {
        // reverse array in place using a temp variable to swap elements
        int left = 0;
        int right = array.length - 1;
        // move the two end points towards the middle, swapping as we go
        while (left < right) {
            String temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
    }

    private static void reverseUsingCollection(String[] array) {
        List<String> list = Arrays.asList(array);
        Collections.reverse(list);
        array = list.toArray(new String[0]);
    }

    private static void reverseUsingStack(String[] array) {
        Stack<String> stack = new Stack<>();
        int top = 0;
        int len = array.length;
        for (String s : array) {
            stack.push(s);
        }

        for (int i = 0; i < len; i++) {
            array[i] = stack.pop();
        }
    }



}

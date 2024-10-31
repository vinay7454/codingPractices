import java.util.Stack;

public class NextLargestElement {
    public static void main(String[] args) {
        int[] inputArr = {5, 4, 6, 7, 9, 1};
        int[] output = findNextLargestElements(inputArr);

        for (int i : output) {
            System.out.print(i + " ");
        }
    }

    public static int[] findNextLargestElements(int[] inputArr) {
        int n = inputArr.length;
        int[] outputArr = new int[n];
        Stack<Integer> stack = new Stack<>();

        // Initialize the output array with -1 (for elements that don't have a next larger element)
        for (int i = 0; i < n; i++) {
            outputArr[i] = -1;
        }

        // Traverse the array from right to left
        for (int i = n - 1; i >= 0; i--) {
            // Pop elements from the stack that are smaller than or equal to the current element
            while (!stack.isEmpty() && stack.peek() <= inputArr[i]) {
                stack.pop();
            }

            // If stack is not empty, the top element is the next greater element
            if (!stack.isEmpty()) {
                outputArr[i] = stack.peek();
            }

            // Push the current element onto the stack
            stack.push(inputArr[i]);
        }

        return outputArr;
    }
}

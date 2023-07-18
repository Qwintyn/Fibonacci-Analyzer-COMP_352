package ca.concordia.algos;
public class FibonacciVariantAnalyzer {

    private static int calls = 0; //counter to keep track of recursive calls
   
    public static int Fibcode(int n) {
        //base case which will return the starting value of the sequence if any of these conditions are met
        if (n == 0 || n == 1 || n == 2 || n == 3) {
            //incrementing the call
            calls++;
            return 1;
        }
        //incrementing the call
        calls++;
        //recursive call that will return the values at each given order in the sequence
        int temp = (3 * Fibcode(n - 3)) + Fibcode(n - 1);
        return temp;

    }

    public static void main(String[] args) {
        //setting the input value
        int n = 8;
        //looping through the input value to print each element in the sequence
        for (int i = 0; i < n; i++) {
            System.out.print(Fibcode(i) + " ");
        }
        //printing the number of calls
        System.out.println("\n" + "Calls: " + calls);

    }
}


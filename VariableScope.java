// Jessica Kamienski

public class VariableScope {

    public static void main(String[] args) {
        // declare and initialize an int variable
        int number = 5;
        System.out.println("Before method call: " + number);
        // calling a method that tries to modify the integer
        tryToModify (number); // pass-by-value: original number is unchanged
        

        // declare and initialize int array
        int [] arr = {1, 2, 3, 4, 5};
        System.out.print ("Before: " );
        // print original array
        for (int val : arr) System.out.print(val + " ");
        System.out.println( " ");

        // call method trying to modify the array
        processArray(arr); // changes made affect the original
        // print array to show changes
        for (int val : arr) System.out.print(val + " ");
        System.out.println();
        
        // block-level variable scope
        demonstrateScope();
    }

    // method tries to modify the int
        public static void tryToModify(int number) {
            int result = number + 10;
        
        System.out.println("After method call: " + result);
        System.out.println(" ");
        
        }

    // method modifies array elements
public static void processArray (int [] array){
    //each element is doubled
            for (int i = 0; i < array.length; i++){
                array[i] = array[i] * 2;
            }
            System.out.print("After Method Call: ");
        } 

    //method showing variable scope within loops
        public static void demonstrateScope() {
            int x = 100; // declared outside but accessible in the method
            System.out.println();
            System.out.println("After method call: ");
            for(int i = 0; i < 3; i++) {
                   int y = i * 10; // declared inside, the scope is only within each iteration
            System.out.println("The value of x is: " + x + "The value of y is: " + y);
            }
           // Trying to print 'y' here would cause a compile-time error, because 'y' is out of scope
           // System.out.println(y);
            
}
}

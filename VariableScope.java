// Jessica Kamienski

 // 1. Create a method called 'tryToModify' that takes an integer parameter,
    //    adds 10 to it, and prints the value inside the method
    
    // 2. Create a method called 'processArray' that takes an integer array,
    //    doubles each element, and prints the array
    
    // 3. Create a method called 'demonstrateScope' that:
    //    - Declares a local variable 'x' with value 100
    //    - Uses a for loop (int i = 0; i < 3; i++)
    //    - INSIDE the for loop body, declare a variable 'y' with value i * 10
    //    - Prints both x and y inside the loop
    //    - Try to print y outside the loop (what happens?)
    
    public static void main(String[] args) {
        int number = 5;
        System.out.println("Before method call: " + number);
        tryToModify(number);
        System.out.println("After method call: " + number);
        
        int[] arr = {1, 2, 3, 4, 5};
        System.out.print("Before: ");
        for(int val : arr) System.out.print(val + " ");
        System.out.println();
        
        processArray(arr);
        
        System.out.print("After: ");
        for(int val : arr) System.out.print(val + " ");
        System.out.println();
        
        demonstrateScope();
    }
}

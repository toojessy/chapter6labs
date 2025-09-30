// Jessica Kamienski

public class VariableScope {

    public static void main(String[] args) {
        int number = 5;
        System.out.println("Before method call: " + number);
        tryToModify (number);
        
        
        int [] arr = {1, 2, 3, 4, 5};
        System.out.print ("Before: " );
        for (int val : arr) System.out.print(val + " ");
        System.out.println( " ");

        processArray(arr);
        for (int val : arr) System.out.print(val + " ");
        System.out.println();
        
        
        demonstrateScope();
    }
        public static void tryToModify(int number) {
            int result = number + 10;
        
        System.out.println("After method call: " + result);
        System.out.println(" ");
        
        }

public static void processArray (int [] array){
            for (int i = 0; i < array.length; i++){
                array[i] = array[i] * 2;
            }
            System.out.print("After Method Call: ");
        } 
                
        public static void demonstrateScope() {
            int x = 100;
            System.out.println();
            System.out.println("After method call: ");
            for(int i = 0; i < 3; i++) {
                   int y = i * 10;
            System.out.println("The value of x is: " + x + "The value of y is: " + y);
            }
           
}
}

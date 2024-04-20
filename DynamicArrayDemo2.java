package ArrayQuestions.DynamicArrays;

import java.util.Scanner;

public class DynamicArrayDemo2 {
    public static void main(String[] args) {
        DynamicArray2 array = new DynamicArray2();
        try (Scanner input = new Scanner(System.in)) {
            System.out.println(array.capacity);
            System.out.println(array.size);
            //System.out.println(array.array);
            System.out.println("Enter your name");
            for (int i = 0; i < 4; i++) {
                String name = input.next();
                array.add(name);
            }
        }
        
        
        //array.add("A");
        //array.add("B");
        //array.add("C");
        //array.add("D");
        //array.add("F");

        System.out.println(array);
    }
}

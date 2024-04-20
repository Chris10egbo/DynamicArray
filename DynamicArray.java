package ArrayQuestions.DynamicArrays;

import java.util.Scanner;

public class DynamicArray {
    public int size = 0;
    public final int MAXI_SIZE = 10;
    public String [] array = new String[MAXI_SIZE];
    boolean isEmpty;
    public boolean isEmpty() {
        return size==0;
    }
    public boolean isFull() {
        return size == MAXI_SIZE;
    }
    boolean isFull;
    // contructor
    public int getSize() {
        return size;
    }
    
    
    public String[] getArray() {
        return array;
    }
    public void setArray(Scanner input) {
        System.out.println("Enter Subject");
        this.array[size] = input.next();
        //String [] data = arrayME(input);
        size++;
    }
    public String[] arrayME(String [] data){
        System.out.println("\tSubjects");
        for (int i = 0; i < size; i++) {
            //System.out.printf("%s%n", arrays[i]);
            //System.out.println(arrays);
        }
        return array;
    }
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            DynamicArray mArray = new DynamicArray();
            mArray.setArray(input);
            //mArray.printArray(args);
            
        }
    }

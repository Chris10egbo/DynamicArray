package ArrayQuestions.DynamicArrays;

public class DynamicArray2 {
    int size;
    int capacity = 10;
    Object [] array;
    public DynamicArray2(){
        this.array = new Object[capacity];
    }
    public DynamicArray2(int capacity){
        this.capacity = capacity;
        this.array = new Object[capacity];
    }
    public void add(Object data){
        if (size >= capacity) {
            grow(data);
        }
        array[size] = data;
        size++;
    }
    public void insert(int index,Object data){
        if (size >= capacity) {
            grow(data);
        }
        for (int i = size; i < index; i--) {
            array[i] = array[i-1];
        }
        array[index] = data;
        size++;
    }
    public void delete(Object data){
        for (int i = 0; i < size; i++) {
            if (array[i] == data) {
                for (int j = 0; j < (size-i-1); j++) {
                    array[i+j] = array[i+j+1];
                }
                array[size-1] = null;
                size--;
                if (size<=(int) (capacity/3)) {
                    shrink(data);
                }
                break;
            }
        }
    }
    public int search(Object data){
        for (int i = 0; i < size; i++) {
            if (array[i]==data) {
                return i;
            }
        }
        return -1;
    }
    public void grow(Object data){
        int newcapacity = (int)capacity*2;
        Object[] newArray = new Object[newcapacity];
        for (int i = 0; i < size; i++) {
            newArray[i] = array[i];
        }
        capacity = newcapacity;
        array = newArray;
    }
    public void shrink(Object data){
        int newcapacity = (int)capacity/2;
        Object[] newArray = new Object[newcapacity];
        for (int i = 0; i < size; i++) {
            newArray[i] = array[i];
        }
        capacity = newcapacity;
        array = newArray;
    }
    public boolean isEmpty(){
        return size ==0;
    }
    public String toString(){
        String string = "";
        for (int i = 0; i < size; i++) {
            string += array[i] + ",";
        }
        if (string != "") {
            string = string.substring(0,string.length()-1);
        }else{
            string = "[]";
        }
        return string;
        
    }
}






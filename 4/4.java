import java.util.*;

class Stack{
    int capacity,nextIndex;
    int arr[];
    Stack(int capac){
        nextIndex=0;
        capacity=capac;
        arr = new int[capacity];
    }
    void push(int element){
        if(nextIndex<capacity){
            arr[nextIndex]=element;
            nextIndex++;
        }
    }
    int pop(){
        if(nextIndex>0){
            nextIndex--;
            return arr[nextIndex];
        }
        return -1;  // no data available to pop
    }
    void print(){
        for(int i=nextIndex-1; i>=0; i--){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        Stack s = new Stack(30);
        s.push(Integer.parseInt(args[0]));
        s.push(Integer.parseInt(args[1]));
        s.push(Integer.parseInt(args[2]));
        s.push(Integer.parseInt(args[3]));
        s.push(Integer.parseInt(args[4]));

        System.out.print("Printing Stack : ");
        s.print();

        s.pop();
        s.pop();
        s.pop();

        System.out.print("After popping, Stack : ");
        s.print();
    }
}

// 10 20 30 15 9 

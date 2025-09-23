package Librarydemo;

public class Stack {
    private int arr[];
    private int top;
    private int maxCapacity;
    Stack(int size){
        maxCapacity = size;
        arr = new int[maxCapacity];
        top = -1;

    }
    Stack(int[] inputArr) {
        maxCapacity = inputArr.length;
        arr = new int[maxCapacity];
        for (int i = 0; i < maxCapacity; i++) {
            arr[i] = inputArr[i];
        }
        top = maxCapacity - 1;
    }
    void push(int x) {
        if (top >= maxCapacity - 1) {
            System.out.println("Stack is full" + x);
        }
        arr[++top] = x;
        System.out.println("Pushed Element: " + x);
    }
    void push(int x, int y) {
        push(x);
        push(y);
    }
    int pop() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return -1;
        }
        return arr[top--];
    }
    void pop(int n) {
        if (n <= 0) {
            System.out.println("Sorry pop isn't possible.Enter a valid number");
            return;
        }
        for (int i = 0; i < n; i++) {
            int val = pop();
            if (val == -1) break;
            System.out.println("Popped Element: " + val);
        }
    }
    void display() {
        if (top == -1) {
            System.out.println("Stack is empty");
        }
        System.out.println("Stack content from Top to Bottom :");
        for (int i = top; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }
    void display(int n) {
        if (top==-1) {
            System.out.println("Stack is empty");
        }
        System.out.println("Top " + n + " elements:");
        for (int i = top; i >= 0 && i > top - n; i--) {
            System.out.println(arr[i]);
        }
    }

}

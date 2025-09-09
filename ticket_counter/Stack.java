package ticket_counter;

public class Stack {
    private Person arr[];
    private int top;
    private int capacity;

    //Constructor 1 = Empty stack with given size
    Stack(int Size){
        this.top = -1;
        this.capacity = Size;
        this.arr = new Person[this.capacity];
    }

    //Constructor 2 = Initialize Stack directly from array
    Stack(Person[]inputArr){
        this.capacity=inputArr.length;
        this.arr = new Person[this.capacity];
        for(int i = 0; i< inputArr.length; i++){
            this.arr[i]=inputArr[i];
        }
        this.top = inputArr.length-1;
    }

    //Push Method : Push Single person
    void push(Person p){
        if(top==arr.length-1){
            System.out.println("Stack is full");
        }else{
            arr[++top] = p;
        }
    }
    //Overloaded Push Method :Push 2 person
    void push(Person p1,Person p2){
        push(p1);
        push(p2);
    }
    //Pop Method
     Person pop(){
        if(top==-1){
            System.out.println("Stack is empty");
            return null;
        }else{
            return arr[top--];
        }
    }
    void pop(int n){
        if(n<=0){
            System.out.println("Invalid number");
        }
        for(int i=0; i<n; i++){
            Person val = pop();
            if(val == null){
                break;
            }
            val.display();
        }
        }

    void display() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return;
        } else {
            for (int i = 0; i <= top; i++) {
                arr[i].display();
            }
        }
    }
    // Overloaded Display: Show top n Persons
        void display(int n){
            if(top == -1){
                System.out.println("Stack is empty");
                return;
            }
            if(n<0){
                System.out.println("Please enter a positive integer");
            return;
            }
            if(n> top+1){
                System.out.println("Oops! You asked for "+n+" persons, but the stack only has "+(top + 1)+". Displaying everything I have!");
            }
            System.out.println("Top " + n + " elements:");
            for (int i = top; i >= 0 && i > top - n; i--) {
                arr[i].display();
            }
        }
    }



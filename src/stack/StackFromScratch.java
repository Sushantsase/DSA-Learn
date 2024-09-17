package stack;

import java.util.Stack;

class StackOpe {
    private int[] stackName;
    private int top;
    private int capacity;

    public StackOpe(int size) {
        this.stackName = new int[size];
        this.capacity = size;
        this.top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == capacity - 1;
    }

    public void push(int a) {
        if (isFull()) {
            System.out.println("Stack is full");
        } else {
            stackName[++top] = a;
        }

    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Empty Stack");
            return -1;
        }
           return stackName[top--];

    }

    public int peek(){
        if(isEmpty()){
            return -1;
        }
        return stackName[top];
    }
    public void display() {
        for (int i = 0; i <= top; i++) {
            System.out.print(stackName[i] + " ");
        }
        System.out.println();
    }

    public int search(int val) {
        for (int i = 0; i <= top; i++) {
            if(stackName[i] == val){
                return i;
            }
        }
        return -1;
    }


    public void display2() {
        for (int i:stackName) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}

public class StackFromScratch {
    public static void main(String[] args) {
        StackOpe st = new StackOpe(3);
        Stack n = new Stack();
        n.push("ssas");
        n.push("ssf");   n.push("sa");   n.push("ssasss");
        System.out.println(n.size());
        System.out.println(n);

        System.out.println(n.search("sgga"));
//        st.push(1);
//        st.push(2);
//        st.push(3);
//
//        st.display();
//        st.pop();
//        st.display();
//     //   st.pop();st.pop();st.pop();
//        st.push(3);
//
//        st.display();
//        System.out.println("Peek "+st.peek());
//        System.out.println(st.isEmpty());
//        System.out.println(st.isFull());
//        st.display();
//        System.out.println(st.search(2));

    }
}

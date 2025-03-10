class Stack { 
    //Please read sample.java file before starting.
    //Kindly include Time and Space complexity at top of each file

    // Time Complexity : O(1) -> Constant time lookup
    // Space Complexity : O(n) -> n is the number of elements in the stack

    static final int MAX = 1000; 
    int top;
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        return top == -1;
    } 

    Stack() 
    { 
        top = -1;
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        if(top >= MAX-1) {
            System.out.println("Stack Overflow");
            return false;
        }
        else { 
            top++;
            a[top] = x;
            return true; 
        }
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if(isEmpty()) {
            System.out.println("Stack Underflow");
            return 0;
        }
        int result = a[top];
        a[top] = 0;
        top--;
        return result;
    } 
  
    int peek() 
    { 
        //Write your code here
        if(isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return a[top];
    }
} 
  
// Driver code 
class Main { 
    public static void main(String args[]) 
    { 
        Stack s = new Stack(); 
        s.push(10); 
        s.push(20); 
        s.push(30); 
        System.out.println(s.pop() + " Popped from stack"); 
    } 
}

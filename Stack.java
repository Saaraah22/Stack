package arraystack;

public class ArrayStack {

  private int capacity;
  private int top = 0;
  private String[] storage;
  
  
  public ArrayStack(int size) {
   
   capacity=size;
   storage = new String[capacity];
  }

  public void show(){
   
    for (int i = capacity-1; i >= 0; i--) {
        System.out.println("Stack["+ i +"] =" + storage[i]);
    }
    System.out.println();
  }
  
  private boolean isEmpty() {
    if (storage[0] == null) {
      // print error message
      System.out.println("Storage is Empty");
      System.out.println();  
      return true;
    } 
    return false;
  }

  private boolean isFull() {
    if (top == capacity) {
      // print error message
   System.out.println("Stack is Full");
   System.out.println();
      return true;
    } 
    return false;
  }

  public void push(String value) {
    if (isFull()) {
      // print error message
      System.out.println("Adding Failed. Element did not push");
    } else {
      System.out.println("trying to push on stack[" + top + "] ... ");
      storage[top] = value;
      top++;
      /* increment or decrement top*/
      System.out.println(" ..." +value + " was successfully added.");
      System.out.println();
    }
  }

  public void pop() {
    if (isEmpty()) {
      // print error message
      System.out.println("Removing Failed");
      System.out.println();
    } else {
      System.out.println("... trying to pop stack[" + (top-1) + "] ...");
      storage[top-1] = null;
      top--;
      /* increment or decrement top*/
      System.out.println(storage[top] + " was successfully removed.");
      System.out.println();
    }
  }
  
  public void peek() {
    if (storage[top] == (storage[0])) {
      System.out.println("PEEK TOP = " + storage[top]);
      System.out.println();
    } else {
      System.out.println("PEEK TOP = " + storage[top-1]);
      System.out.println();
    }
       
  }
  
  public static void main(String[] args) {
      
      ArrayStack storage = new ArrayStack(10);
   
    System.out.println("STORAGE CAPACITY = " + storage.capacity);
    System.out.println();
   
    storage.isEmpty();
   
    storage.pop();
   
    storage.peek();
    storage.push("one");
    System.out.println("Updated Stack:");
    storage.show();
    storage.push("two");
    System.out.println("Updated Stack:");
    storage.show();
    storage.push("three");
    System.out.println("Updated Stack:");
    storage.show();
    storage.push("four");
    System.out.println("Updated Stack:");
    storage.show();
    storage.push("five");
    System.out.println("Updated Stack:");
    storage.show();
    storage.push("six");
    System.out.println("Upadted Stack:");
    storage.show();
    storage.push("seven");
    System.out.println("Updated Stack:");
    storage.show();
    storage.push("eight");
    System.out.println("Updated Stack:");
    storage.show();
    storage.push("nine");
    System.out.println("Updated Stack:");
    storage.show();
    storage.push("ten");
    System.out.println("Updated Stack:");
    storage.show();

    
    storage.pop();
    
   
   
   System.out.println("| S t a c k | \n"); 
   storage.show();
   
   
    
   
  }  

}
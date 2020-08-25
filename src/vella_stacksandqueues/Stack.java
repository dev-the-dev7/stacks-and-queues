
package vella_stacksandqueues;

/**
 *
 * @author Devin Vella
 */
public class Stack 
{
  //declare variables
  private static final int CAPACITY = 100;
  private int[] data;
  private int top = -1;

  public Stack()
  {   
    this(CAPACITY);
  }   
  
  public Stack(int capacity)
  {   
    data = new int[capacity];
  }
  
  boolean isEmpty()
  {
      return (top == -1);
  }
  
  public int size()
  {
      return(top + 1);
  }
  
  public int[] push(int value) throws IllegalStateException
  {
      if(size() == data.length)
      {
          throw new IllegalStateException("StackOverflowException");
      }
      top++;
      data[top] = value;
      return data;
  }
  
  public int pop()
  {
      if(isEmpty())
      {
          throw new IllegalStateException("StackEmptyException");
      }
      int topVal = data[top];
      top--;
      return topVal;
  }
  
  public int top() throws IllegalStateException
  {
      if(isEmpty())
      {
          throw new IllegalStateException("StackEmptyException");
      }
      return data[top];
  }
  
  public String print()
  {
    String output = "";  
      
    //print list
    for(int i = 0; i < data.length; i++)
    {
        output = String.valueOf(data[i]) + "\n";
    }
    return output;
  }
}

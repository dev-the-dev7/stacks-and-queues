
package vella_stacksandqueues;

import javax.swing.JOptionPane;

/**
 *
 * @author Devin Vella
 */
public class Queue 
{
    //declare variables
    private int size;
    private int Capacity = 100;
    private int [] data;
    int front = 0;
    int back = 0;

    public Queue()
    {   
       size = 0;
    } 
    
    boolean isEmpty()
    {
        return size == 0;
    }
    
    public int[] add(int value)
    {
        if(size >= Capacity)
        {   
            //Display message
            JOptionPane.showMessageDialog(null, "Queue is full.");
        }
        else
        {
            size++;
            data[back] = value;
            back = (++back) % (Capacity - 1);
        }
        return data;
    }
    
    public int remove()
    {
        int value;
        if(size <= 0)
        {   
            //Display message
            JOptionPane.showMessageDialog(null, "Queue is full.");
            return -999;
        }
        else
        {
            size--;
            value = data[front];
            front = (++front) % (Capacity - 1);
        }
        return value;
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

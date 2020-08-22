import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
 
public class Queue_reverseQ18{
     
    static Queue<Integer> Q;
    static void Print()
    {
    while (!Q.isEmpty()) {
    System.out.print( Q.peek() + " ");
    Q.remove();
    }
    }
    static void reversequeue()
    {
    Stack<Integer> s = new Stack<>();
    while (!Q.isEmpty()) {
      s.add(Q.peek());
      Q.remove();
        }
     while (!s.isEmpty()) {
    Q.add(s.peek());
    s.pop();
        }
    }
    public static void main(String args[])
    {
        Q = new LinkedList<Integer>();
       Q.add(8);
        Q.add(15);
        Q.add(25);
        Q.add(32);
        Q.add(44);
        Q.add(58);
        Q.add(64);
        
 
        reversequeue();
        Print();
    }
}
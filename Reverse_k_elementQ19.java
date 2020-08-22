import java.util.LinkedList; 
import java.util.Queue; 
import java.util.Stack;
import java.util.*; 
  
public class Reverse_k_elementQ19 { 
  
    static Queue<Integer> Q;   
    static void reverseQueueFirstKElements(int k) { 
        if (Q.isEmpty() == true || k > Q.size()) 
            return; 
        if (k <= 0) 
            return; 
  
        Stack<Integer> s = new Stack<Integer>();   
        for (int i = 0; i < k; i++) { 
            s.push(Q.peek()); 
            Q.remove(); 
        } 
        while (!s.empty()) { 
            Q.add(s.peek()); 
            s.pop(); 
        } 
        for (int i = 0; i < Q.size() - k; i++) { 
            Q.add(Q.peek()); 
            Q.remove(); 
        } 
    } 
    static void Print() { 
        while (!Q.isEmpty()) { 
            System.out.print(Q.peek() + " "); 
            Q.remove(); 
        } 
    } 
    public static void main(String args[]) { 
        Q = new LinkedList<Integer>(); 
        Q.add(10); 
        Q.add(20); 
        Q.add(30); 
        Q.add(40); 
        Q.add(50); 
        Q.add(60); 
        Q.add(70); 
        Q.add(80); 
         
		System.out.println("enter the value k:");
		Scanner sc=new Scanner(System.in);
		int k=sc.nextInt();
        reverseQueueFirstKElements(k); 
        Print(); 
    } 
} 
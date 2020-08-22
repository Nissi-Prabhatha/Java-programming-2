//17)Sorting a stack using a temporary stack
import java.util.Stack;
public class StackSortingQ17{

    public Stack<Integer> sorting(Stack<Integer> original) {
    //create a temporary stack
    Stack<Integer> temporaryStack = new Stack<>();

      while(!original.isEmpty()) {
       // pop out the first element from the original stack
      int x = original.pop();

   // while temporary stack is not empty and top of temporary stack is greater than x
   while(!temporaryStack.isEmpty() && temporaryStack.peek() > x) {
  // pop from temporary stack and push it to the original stack
        original.push(temporaryStack.pop());
         }

    // push x in temporary of stack
        temporaryStack.push(x);
        }
        return temporaryStack;
    }

    public static void main(String args[]) {

        StackSortingQ17 s = new StackSortingQ17();
        Stack<Integer> originalStack = new Stack<>();
        originalStack.add(15);
        originalStack.add(5);
        originalStack.add(65);
        originalStack.add(95);
        originalStack.add(105);
        originalStack.add(25);
        System.out.println("Original Stack: " + originalStack);
        Stack<Integer> sortedStack= s.sorting(originalStack);
        System.out.println("Sorted Stack is:" + sortedStack);
    }
}
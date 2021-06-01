/**
 * Implement a Queue using 2 stacks s1 and s2 .
 * A Query Q is of 2 Types
 * (i) 1 x (a query of this type means  pushing 'x' into the queue)
 * (ii) 2   (a query of this type means to pop element from queue and print the poped element)
 *
 * Example 1:
 *
 * Input:
 * 5
 * 1 2 1 3 2 1 4 2
 *
 * Output:
 * 2 3
 *
 * Explanation:
 * In the first testcase
 * 1 2 the queue will be {2}
 * 1 3 the queue will be {2 3}
 * 2   poped element will be 2 the queue
 *     will be {3}
 * 1 4 the queue will be {3 4}
 * 2   poped element will be 3.
 * Example 2:
 *
 * Input:
 * 4
 * 1 2 2 2 1 4
 *
 * Output:
 * 2 -1
 *
 * Explanation:
 * In the second testcase
 * 1 2 the queue will be {2}
 * 2   poped element will be 2 and
 *     then the queue will be empty
 * 2   the queue is empty and hence -1
 * 1 4 the queue will be {4}.
 */

import java.util.Stack;

public class QueueUsingStack
{
    static Stack<Integer> stack1 = new Stack<>();
    static Stack<Integer> stack2 = new Stack<>();
    public static void enqueue(int data)
    {
        stack1.push(data);
    }
    public static void dequeue()
    {
        if(stack1.isEmpty() && stack2.isEmpty())
            System.out.println("Stack is empty");
        if(stack2.isEmpty())
        {
            while (!stack1.isEmpty())
            {
                stack2.push(stack1.pop());
            }
        }
        stack2.pop();
    }
    public static void display()
    {
        Stack<Integer> stack3 = new Stack<>();
        if(stack1.isEmpty())
        {
            while (!stack2.isEmpty())
                stack3.push(stack2.pop());
            System.out.println(stack3);
            while (!stack3.isEmpty())
                stack2.push(stack3.pop());
        }
        else if(!stack1.isEmpty() && !stack2.isEmpty())
        {
            while (!stack2.isEmpty())
                stack3.push(stack2.pop());
            System.out.println(stack3);
            while (!stack3.isEmpty())
                stack2.push(stack3.pop());
            System.out.println(stack1);
        }
        else
            System.out.println(stack1);
    }
    public static void main(String[] args)
    {
        enqueue(10);
        enqueue(20);
        enqueue(30);
        enqueue(40);
        enqueue(50);
        display();
        dequeue();
        enqueue(60);
        display();

    }
}

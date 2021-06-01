/**
 * Given N integers, the task is to insert those elements in the queue.
 * Also, given M integers, task is to find the frequency of each number in the Queue.
 *
 * Example:
 *
 * Input:
 * 8
 * 1 2 3 4 5 2 3 1
 * 5
 * 1 3 2 9 10
 *
 * Output:
 * 2
 * 2
 * 2
 * -1
 * -1
 *
 * Explanation:
 * After inserting 1, 2, 3, 4, 5, 2, 3, 1 into the queue,
 * frequency of 1 is 2, 3 is 2, 2 is 2, 9 is -1 and 10 is
 * -1 (since, 9 and 10 is not there in the queue).
 */

import java.util.*;

public class QueueOperation
{
    static Queue<Integer> queue = new LinkedList<>();
    static void insert(int k)
    {
        queue.add(k);
    }
    static void findFrequency(int k)
    {
        int freq = Collections.frequency(queue,k);
        System.out.println(freq);
    }
    static void display()
    {
        System.out.println(queue);
    }
    public static void main(String[] args)
    {
        insert(10);
        insert(20);
        insert(30);
        insert(40);
        insert(50);
        insert(10);
        display();
        findFrequency(10);
    }
}

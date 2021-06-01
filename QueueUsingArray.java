/**
 * Implement a Queue using an Array. Queries in the Queue are of the following type:
 * (i) 1 x   (a query of this type means  pushing 'x' into the queue)
 * (ii) 2     (a query of this type means to pop element from queue and print the poped element)
 *
 * Example 1:
 *
 * Input:
 * Q = 5
 * Queries = 1 2 1 3 2 1 4 2
 * Output: 2 3
 * Explanation:
 * In the first test case for query
 * 1 2 the queue will be {2}
 * 1 3 the queue will be {2 3}
 * 2   poped element will be 2 the
 *     queue will be {3}
 * 1 4 the queue will be {3 4}
 * 2   poped element will be 3
 * Example 2:
 *
 * Input:
 * Q = 4
 * Queries = 1 3 2 2 1 4
 * Output: 3 -1
 * Explanation:
 * In the second testcase for query
 * 1 3 the queue will be {3}
 * 2   poped element will be 3 the
 *     queue will be empty
 * 2   there is no element in the
 *     queue and hence -1
 * 1 4 the queue will be {4}.
 */
public class QueueUsingArray
{
    static int arr[];
    static int front;
    static int rear;
    static int size;
    QueueUsingArray(int size)
    {
        this.size = size;
        this.arr = new int[size];
        this.front = 0;
        this.rear = 0;
    }
    public static void Enqueue(int data)
    {
        if(size == rear)
            System.out.println("Queue is Full");
        arr[rear] = data;
        rear++;
    }
    public static void Dequeue()
    {
        if(front == rear)
        {
            front=0;
            rear=0;
            System.out.println("Queue is Empty");
        }
        else
        {
            int temp = arr[front];
            front++;
            System.out.println(temp);
        }
    }
    public static void display()
    {
        for (int i=0;i<rear;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args)
    {
        QueueUsingArray q = new QueueUsingArray(5);
        q.Enqueue(1);
        q.Enqueue(2);
        q.Enqueue(3);
        q.Enqueue(4);
        q.Enqueue(5);
        q.display();
        q.Dequeue();
        q.display();
    }
}

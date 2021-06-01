import java.util.LinkedList;
import java.util.Queue;

public class QueueImplementation
{
    static int arr[];
    static int front;
    static int rear;
    static int size;
    static int currSize;
    QueueImplementation(int size)
    {
        this.size = size;
        this.arr = new int[size];
        this.front = 0;
        this.rear = -1;
        this.currSize = 0;
    }
    public static void enqueue(int data)
    {
        if (isFull())
        {
            System.out.println("Queue is full");
            return;
        }
        System.out.println("Insert Element " + data);
        rear = (rear + 1) % size;
        arr[rear] = data;
        currSize++;
    }
    public static void dequeue()
    {
        if(isEmpty())
        {
            System.out.println("Queue is empty");
            return;
        }
        System.out.println("Removing element "+arr[front]);
        front = (front+1)%size;
        currSize--;
    }
    public static void peek()
    {
        if(isEmpty())
        {
            System.out.println("Queue is empty");
            return;
        }
        System.out.println("Front Element "+arr[front]);
    }
    public static void display()
    {
        if(rear>=front)
        {
            for(int i=front;i<=rear;i++)
            {
                System.out.print(arr[i]+" ");
            }
        }
        else
        {
            for(int i=front;i<size;i++)
            {
                System.out.print(arr[i]+" ");
            }
            for (int i=0;i<=rear;i++)
            {
                System.out.print(arr[i]+" ");
            }
        }
        System.out.println();
    }
    public static boolean isFull()
    {
        if (currSize == size)
            return true;
        else
            return false;
    }
    public static boolean isEmpty()
    {
        if (currSize == 0)
            return true;
        else
            return false;
    }
    public static void main(String[] args)
    {
        QueueImplementation queue = new QueueImplementation(5);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        queue.dequeue();
        queue.enqueue(6);
        queue.peek();
        queue.display();
    }
}

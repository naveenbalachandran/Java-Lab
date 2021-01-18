import java.util.Scanner;
public class queue{
    static int[] queue_arr = new int[50];
    static int front = 0;
    static int rear = -1;
    static int max = 50;
    static Scanner scan = new Scanner(System.in);

    queue() {

    }

    queue(int x) {
        enqueue(x);
    }

    public static int isFull() {
        if (front == 0 && rear == max - 1) {
            return 1;
        } else {
            return -1;
        }
    }

    public static int isEmpty() {
        if (rear < front)
            return 1;
        else {
            return -1;
        }
    }

    public static void enqueue(int x) {
        if ((isFull() == 1)) {
            System.out.printf("Queue overflow\n");
        } else {
            rear = rear + 1;
            queue_arr[rear] = x;
        }

    }

    public static void dequeue() {
        if ((isEmpty() == 1)) {
            System.out.printf("Queue underflow\n");
        } else {
            System.out.printf("Deleted: %d\n", queue_arr[front]);
            front = front + 1;
        }

    }

    public static void display() {
        int front_pos = front, rear_pos = rear;
        if (rear < front) {
            System.out.printf("Queue is empty\n");
            return;
        }
        if (front_pos <= rear_pos)
            while (front_pos <= rear_pos) {
                System.out.printf("%d ", queue_arr[front_pos]);
                front_pos++;
            }
        else {
            while (front_pos <= max - 1) {
                System.out.printf("%d ", queue_arr[front_pos]);
                front_pos++;
            }
            front_pos = 0;
            while (front_pos <= rear_pos) {
                System.out.printf("%d ", queue_arr[front_pos]);
                front_pos++;
            }
        }
        System.out.printf("\n");

    }

    public static void main(String[] args) {
        int item,ch;
        do
    {
        System.out.printf("\n\n---------------------------------------\n");
        System.out.printf("1.Insert\n");
        System.out.printf("2.Delete\n");
        System.out.printf("3.Display\n");
        System.out.printf("4.Quit\n");
        System.out.printf("Enter your choice: ");
        ch = scan.nextInt();
        System.out.printf("---------------------------------------\n");
        switch (ch)
        {
        case 1:
            System.out.printf("Enter the element to insert: ");
            item = scan.nextInt();
            enqueue(item);
            break;
        case 2:
            dequeue();
            break;
        case 3:
            display();
            break;
        case 4:
            break;
        default:
            System.out.printf("Invalid Choice\n");
        }
    } while (ch != 4);

    
    }
}

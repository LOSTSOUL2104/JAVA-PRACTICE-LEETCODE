package HEAPS;

public class Priority_queue_ll {
    public static void main(String[] args) {
        priorityqueue pq = new priorityqueue();

        pq.insert(10, 2);
        pq.insert(5, 1);
        pq.insert(20, 3);

        System.out.println("Peek element: " + pq.peek());
        System.out.println("Removed element: " + pq.remove());

        System.out.println("Peek after removal: " + pq.peek());
    }
}

class Node {
    int data;
    int priority;
    Node next;

    public Node(int data, int priority) {
        this.data = data;
        this.priority = priority;
        this.next = null;
    }
}

class priorityqueue {
    private Node head;

    public priorityqueue() {
        head = null;
    }

    public void insert(int data, int priority) {
        Node newNode = new Node(data, priority);

        if (head == null || head.priority > priority) {
            newNode.next = head;
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null && temp.next.priority <= priority) {
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }
    }

    public int remove() {
        if (head == null) {
            return -1;
        }
        int data = head.data;
        head = head.next;
        return data;
    }

    public int peek() {
        if (head == null) {
            return -1;
        }
        return head.data;
    }

    public boolean isempty() {
        return head == null;
    }
}

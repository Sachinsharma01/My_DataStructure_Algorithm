package DSA_College.LinkList;

import java.util.HashMap;

public class SinglyLinkedList {
    private ListNode head;

    // display the LinkedList
    public void print() {
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.data +  " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }

    // add node to the beginning of the LinkedList
    public void addFirst(int data) {
        ListNode node = new ListNode(data);
        node.next = head;
        head = node;
    }


    public void add(int data) {
        ListNode node = new ListNode(data);
        if (head == null)
            addFirst(data);
        else {
            ListNode curr = head;
            while (curr.next != null)
                curr = curr.next;
            curr.next = node;
        }
    }

    // add node to the LinkedList
    public void add(int index, int data) throws Exception {
        ListNode node = new ListNode(data);
        if (index == 1)
            addFirst(data);
        else if (index == size())
            add(data);
        else if (index > size() || index < 0) {
            throw new Exception("Cannot Insert at " + index );
        }
        else {
            ListNode curr = head;
            int i = 0;
            while (i < index - 1) {
                curr = curr.next;
                i ++;
            }
            node.next = curr.next;
            curr.next = node;
        }
    }

    // insert a node in sorted order
    public void insertValue(int data) {
        ListNode n = head, node = new ListNode(data);
        while (n.next != null && n.data < data) {
            n = n.next;
        }
        node.next = n.next;
        n.next = node;
    }

    // delete node at the beginning
    public int deleteFirst() {
        if (head == null) {
            System.out.println("LinkedList is Empty!!");
            return -1;
        } else {
            int data = head.data;
//            System.out.println(data);
            head = head.next;
            return data;
        }
    }

    // delete node at a position
    public int delete(int pos) {
        if (pos == 1)
            deleteFirst();
        else if (pos == size())
            delete();
        else {
            ListNode crr = head;
            int i = 1;
            while (i < pos - 1) {
                crr = crr.next;
                i ++;
            }
            int data = crr.next.data;
            crr.next = crr.next.next;
            return data;
        }
        return -1;
    }

    // delete a node at the last
    public int delete() {
        if (size() == 1) {
            deleteFirst();
        } else {
            ListNode crr = head;
            while (crr.next.next != null) {
                crr = crr.next;
            }
            int data = crr.next.data;
            crr.next = null;
            return data;
        }
        return -1;
    }

    // size of the LinkedList
    public int size() {
        int size = 0;
        ListNode crr = head;
        while (crr != null) {
            size ++;
            crr = crr.next;
        }
        return size;
    }

    // find the Middle node of the Linked List
    public int middle() {
        ListNode fast = head, slow = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.data;
    }

    // Delete nth node from last
    public int deleteNthLast(int index) {
        return delete(size() - index - 1);
    }

    // rotate a linked List
    public ListNode rotateRight(ListNode head, int k) {
        ListNode last = null, crr = head, node;
        int size = 0;
        while (crr.next != null) {
            crr = crr.next;
            size ++;
        }
        last = crr;
        crr = head;
        k = size - k;
        while(k --> 0) {
            crr = crr.next;
        }
        node = crr;
        last.next = head;
        head = node;
        crr.next = null;
        return head;
    }

    // remove the duplicate nodes from sorted linked list
    public void removeDuplicates() {
        ListNode n = head;
        HashMap<Integer, Integer> h = new HashMap<>();
        while (n != null && n.next != null) {
            if (n.data == n.next.data)
                n.next = n.next.next;
            else {
                n = n.next;
            }
        }
    }

    public static void main(String[] args) throws Exception {
        SinglyLinkedList sll = new SinglyLinkedList();
//        sll.head = new ListNode(10);
//        ListNode second = new ListNode(1);
//        ListNode third = new ListNode(8);
//        ListNode fourth = new ListNode(11);
//        sll.head.next = second;
//        second.next = third;
//        third.next = fourth;
        sll.add(10);
        sll.add(1);
        sll.add(8);
        sll.add(11);
        sll.print();
        System.out.println("Length of the LinkedList : " + sll.size());
        sll.addFirst(0);
        sll.print();
        System.out.println("Length of the LinkedList : " + sll.size());
        System.out.println();

        sll.addFirst(15);
        sll.print();
        System.out.println("Length of the LinkedList : " + sll.size());
        System.out.println();

        sll.add(2, 20);
        sll.print();
        System.out.println("Length of the LinkedList : " + sll.size());
        System.out.println();

//        sll.add(20,2);
//        sll.print();
//        System.out.println("Length of the LinkedList : " + sll.size());

        System.out.println("Deleted Node => " + sll.deleteFirst());
        sll.print();
        System.out.println("Length of the LinkedList : " + sll.size());
        System.out.println();

        System.out.println("Deleted Node => " + sll.delete());
        sll.print();
        System.out.println("Length of the LinkedList : " + sll.size());
        System.out.println();

        System.out.println("Deleted Node => " + sll.delete(2));
        sll.print();
        System.out.println("Length of the LinkedList : " + sll.size());
        System.out.println();

        System.out.println("Deleted Node => " + sll.delete(1));
        sll.print();
        System.out.println("Length of the LinkedList : " + sll.size());
        System.out.println();

        System.out.println("Middle Of the Linked List => " + sll.middle() + "\n");

//        System.out.println(sll.rotateRight(sll.head, 2));
//        sll.print();

        System.out.println("Deleted from last => " + sll.deleteNthLast(2));
        sll.print();

        sll.add(8);
        sll.removeDuplicates();
        sll.print();
        System.out.println();

        sll.insertValue(7);
        sll.print();
    }
}
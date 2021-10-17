package PraticeQues;

import java.util.Comparator;

class Student {
    int studentId;
    String studentName;
    int studentAge;
    Student next;
    Student prev;

    public Student(int studentId, String studentName, int studentAge) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentAge = studentAge;
    }
}

class DoublyLinkedList {
    private Student head;
    private Student tail;
    private int size;

    public int getSize() {
        return size;
    }

    public void add(Student student) {
        if (head == null) {
            head = tail = student;
            size++;
        } else {
            Student n = head;
            while (n.next != null) {
                n = n.next;
            }
            n.next = student;
            student.prev = n;
            tail = student;
            size++;
        }
    }

    public void sort( Comparator<? super Student> comparator) {

        /*int temp;
        //Check whether list is empty
        if (head == null) {
            return;
        } else {
            //Current will point to head
            for (current = head; current.next != null; current = current.next) {
                //Index will point to node next to current
                for (index = current.next; index != null; index = index.next) {
                    //If current's data is greater than index's data, swap the data of current and index
                    if (current.getStudentAge() < index.getStudentAge()) {
                        temp = current.studentAge;
                        current.studentAge = index.studentAge;
                        index.studentAge = temp;
                    }
                }
            }
        }*/

    }

    void print() {
        Student s = head;
        for (int i = 0; i < size; i++) {
            System.out.println(s.studentId + " " + s.studentAge + " " + s.studentName);
            s = s.next;
        }
    }
}
class Main {
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        Student st = new Student(1, "Vipin", 20);
        dll.add(st);
        Student s = new Student(2, "Sachin", 41);
        dll.add(s);
        Student s1 = new Student(4, "Sanat", 42);
        dll.add(s1);
        dll.sort(Comparator.comparingInt(o -> o.studentId));
        dll.print();
//        Collections.sort(dll, new Comparator<Student>(){
//            @Override
//            public int compare(Student s1, Student s2) {
//                return s1.studentId = s2.studentId;
//            }
//        });
    }
}


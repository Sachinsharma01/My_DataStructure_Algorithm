package MyLinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> lt = new LinkedList<>();
        lt.add(10);
        lt.add(20);
        lt.add(30);
        lt.add(40);
        lt.add(50);
        lt.add(60);
        lt.show();
        System.out.println();
        System.out.println(lt.remove()+"\n");
        lt.show();
        System.out.println();
        System.out.println(lt.get(4));
        System.out.println();
        System.out.println(lt.remove(3));
        System.out.println();
        lt.show();
    }
}

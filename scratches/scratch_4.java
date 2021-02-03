/*
    1. Add an element (Node)
    2. search an element
    3. sorting
    4. deletion
 */

import javax.print.attribute.standard.PresentationDirection;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Random;

class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList <Integer> list = new LinkedList<>();
        for (int i = 0; i < 100; i++) {
            // Integer MIN MAX
            list.add(new Random().nextInt() % 100);
        }
//        System.out.println(list.size());
//        var num = List.of(1, 2, 3, 4, 5, 6);
//        list.addAll(num);
//        list.remove();
        list.removeIf(LinkedListDemo::checkIfNumberIsEven);
        System.out.println(list);
        System.out.println(list.contains(100));
        System.out.println(list.indexOf(1));
        list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                int response = 0;
//                if (o1 == o2)
//                    response = 0;
//                else if (o1 < o2)
//                    response = -1;
//                else if (o1 > o2)
//                    response = 1;
//                return o2 - o1;
                return Integer.compare(o1, o2);
            }
        });
        System.out.println(list);
    }



    private static boolean checkIfNumberIsEven(Integer element) {
        return element % 2 == 0;
    }
}
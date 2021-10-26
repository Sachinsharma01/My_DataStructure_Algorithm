import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;
// this is the main class.
public class MainClass {
    public static void main(String[] args) {
        LinkedList <Friend> friends = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            Friend friend = new Friend();
            System.out.print("Enter the name : ");
            friend.setName(sc.next());
            System.out.print("Enter the Udhaar : ");
            friend.setUdhaar(sc.nextFloat());
            friends.add(friend);
        }
        friends.sort((o1, o2) -> (int) o1.getUdhaar() - (int) o2.getUdhaar());
        System.out.println(friends);
    }
}

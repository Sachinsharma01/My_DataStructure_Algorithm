package Wipro;

record Test(String s, String s1){} // record class do not have setter

class MainTest {
    public static void main(String[] args) {
        Test t = new Test("a","a");
        System.out.println(t.s1());
    }
}
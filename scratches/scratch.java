interface Human {
    public final static int number = 4; // interface fields are already static and final also and public as well
    public final static int numberOfArms = 2;
    public final static int numberOfLegs = 2;
    public abstract void breathe();  // all methods are by default public in interface
}
abstract class Man implements Human {  // Man is a Human

    @Override
    public void breathe() {
        System.out.println("sssssssssssssssss");
    }
}
class Student extends Man {
    @Override
    public void breathe() {
        System.out.println("............");
    }
}


class Main {
    public static void main(String[] args) {
        System.out.println(Human.number);
//        Human.number = 5;
//        Man man = new Man();
        Student st = new Student();
        st.breathe();
    }
}
package deadlock;

/**
 * Created by Администратор on 23.01.2017.
 */
public class SomeClass {
    private int a;


    public SomeClass() {
        a = 1;
    }

    synchronized public void inDeadLock(SomeClass2 someClass) {
        System.out.println("A " + getA());
        System.out.println("B " + someClass.getB());
    }

    synchronized public int getA() {
        return a;
    }
}

package deadlock;

/**
 * Created by Администратор on 23.01.2017.
 */
public class SomeClass2 {
    private int b;

    public SomeClass2() {
        b = 2;
    }

    synchronized public void inDeadLock(SomeClass someClass) {
        System.out.println("B " + getB());
        System.out.println("A " + someClass.getA());
    }

    synchronized public int getB() {
        return b;
    }
}

package deadlock;

/**
 * Created by Администратор on 23.01.2017.
 */
public class Main {
    public static void main(String[] args) {
        SomeClass someClass = new SomeClass();
        SomeClass2 someClass2 = new SomeClass2();

        NewThread thread = new NewThread(someClass, someClass2);

        someClass.inDeadLock(someClass2);

        try {
            thread.t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Главный поток завершил работу");
    }
}

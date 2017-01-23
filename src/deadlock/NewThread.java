package deadlock;

/**
 * Created by Администратор on 23.01.2017.
 */
public class NewThread implements Runnable {
    private SomeClass someClass;
    private SomeClass2 someClass2;
    public Thread t;

    public NewThread(SomeClass a, SomeClass2 b) {
        someClass = a;
        someClass2 = b;
        t = new Thread(this, "Thread2");
        t.start();
    }

    @Override
    public void run() {
        // Раскоментить для решения дэдлока
        //synchronized (someClass) {
            someClass2.inDeadLock(someClass);
        //}
        System.out.println("Дочерний поток завершил работу");
    }
}

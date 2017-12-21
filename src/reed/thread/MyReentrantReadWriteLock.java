package reed.thread;

/*created by fanqunsong
    Date : 2017/12/18
    Time : 21:40
    */


import java.util.concurrent.locks.ReentrantReadWriteLock;

public class MyReentrantReadWriteLock {
    private ReentrantReadWriteLock rwl = new ReentrantReadWriteLock();

    public static void main(String[] args) {
        final MyReentrantReadWriteLock test = new MyReentrantReadWriteLock();
        new Thread(){
            @Override
            public void run() {
                test.get(Thread.currentThread());
                test.write(Thread.currentThread());
            }
        }.start();
        new Thread(){
            @Override
            public void run() {
                test.get(Thread.currentThread());
                test.write(Thread.currentThread());
            }
        }.start();

    }

    public void get(Thread thread){
        rwl.readLock().lock();
        try{
            long start = System.currentTimeMillis();
            while (System.currentTimeMillis() - start <=1){
                System.out.println(thread.getName()+"正在进行读操作");
            }
            System.out.println(thread.getName()+"读操作完毕");
        }finally {
            rwl.readLock().unlock();
        }
    }

    public void write(Thread thread){
        rwl.writeLock().lock();
        try{
            long start = System.currentTimeMillis();
            while(System.currentTimeMillis() - start<=1){
                System.out.println(thread.getName()+"正在进行写操作");
            }
            System.out.println(thread.getName()+"写操作完毕");

        }finally {
            rwl.writeLock().unlock();
        }
    }

}

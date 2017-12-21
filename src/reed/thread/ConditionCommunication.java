package reed.thread;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ConditionCommunication {
    public static void main(String[] args) {
        final Business business = new Business();
        //创建了一个线程，并启动
        new Thread(
                new Runnable() {
                    @Override
                    public void run() {
                        for (int i = 0; i <=50 ; i++) {
                            business.sub(i);
                        }
                    }
                }
        ).start();
        //因为mian方法本身就占用一个线程，所以主线程不需要再new Thread
        for (int i = 0; i <=50 ; i++) {
            business.main(i);
        }

    }

    static class Business{
        Lock lock = new ReentrantLock();
        Condition condition = lock.newCondition();
        private boolean bShouldSub = true;
        public void sub(int i){
            lock.lock();
            try{
                while (!bShouldSub){
                    try {
                        condition.await();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                for(int j=1;j <= 10;j++){
                    System.out.println("sub thread sequence of " + j + ",loop of " + i);
                }
                bShouldSub = false;
                condition.signal();
            }finally {
                lock.unlock();
            }
        }

        public void main(int i){
            lock.lock();
            try{
                while(bShouldSub){
                    try {
                        condition.await();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                for(int j=1;j<=100;j++){
                    System.out.println("main thread sequence of " + j + ",loop of " + i);
                }
                bShouldSub = true;
                condition.signal();
            }finally {
                lock.unlock();
            }
        }
    }
}

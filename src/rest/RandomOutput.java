package rest;

import java.util.Random;

public class RandomOutput {

    public static void main(String[] args) {
        new Thread(
                new Runnable() {
                        @Override
                        public void run() {
                            for (int i = 0; i <20 ; i++) {
                                Random random = new Random();
                                System.out.println(random.nextInt(100));

                                try{
                                    Thread.sleep(3000);
                                }catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                            }
                        }
                    }
        ).start();
    }
}

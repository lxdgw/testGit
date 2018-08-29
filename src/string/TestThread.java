package string;

import java.util.Random;

public class TestThread {

    public static void main(String[] agrs){
        for(int i = 0; i < 100; i++){
            Thread t = new Thread(new T());
            t.start();
//            t.run();
        }
    }

}

class T implements Runnable {

    @Override
    public void run() {
        Random rd = new Random();
        int r = rd.nextInt(101);
        System.out.println(r);
    }
}

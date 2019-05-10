package ThreadPool;

public class Firstway extends Thread{
    @Override
    public void run(){
        String currentTh = Thread.currentThread().getName();
        System.out.println("Second thread: " + currentTh);
    }//run

    public static void main(String[] args){
        String currentTh = Thread.currentThread().getName();
        System.out.println("Main thread: " + currentTh);
        (new Firstway()).start();
    }//main
}//firstway

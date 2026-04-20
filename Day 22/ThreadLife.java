import java.io.*;

class Task extends Thread{
  public void run(){
    System.out.println("Thread is yet to start");
    for(int i=0;i<5;i++){
      System.out.println("Thread is Working");
    }
    System.out.println("Thread finished");
  }
}

public class Main{
  public static void main(String[] args){
    System.out.println("Main Thread");
    Task t=new Task();
    System.out.println(t.getState());
    t.start();
    Thread.sleep(2000);
    System.out.println(t.getState());
    t.join();
    System.out.println("Main Thread");
    System.out.println("Main Thread");
    System.out.println("Main Thread");
    System.out.println("Main Thread");
    System.out.println("Main Thread");
  }
}
    

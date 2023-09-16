//import java.lang.*;
//only one thread will execute with different objeects
class Display{

    public synchronized void greet(String name){
    //1 lakh lines of code
  //  synchronized(this){
    for(int i=0;i<5;i++){
    System.out.println("Good morning:");
    try{
    Thread.sleep(1000);
    }catch(InterruptedException e){
    }
    System.out.println(name);
    }
    }
    //1 lakh lines of code
    }
    
    
    class MyThread extends Thread{

        Display d;
        String name;
        MyThread(Display d,String name){
        
        this.d = d;
        this.name=name;
        
        }
        public void run(){
             d.greet(name);
        }
        
        }
public  class SyncExample{
          public static void main(String[] arg){
            Display d = new Display();
            MyThread t1 = new MyThread (d,"Bunti");
            MyThread t2 = new MyThread (d,"Bubli");
            MyThread t3 = new MyThread (d,"Modi");
            t1.start();
            t2.start();
            t3.start();
            
            }
            
            }
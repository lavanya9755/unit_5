class MyThread implements Runnable{
    public void run(){
     for(int i =0;i<10;i++ ){
         System.out.println(i+" run: "+Thread.currentThread().getName());
 
     }
     
 } 
 
 }
 public class ThreadRunnable{
 
     public static void main(String[] args) {
        MyThread mt1 =new MyThread();
         MyThread mt2 =new MyThread();
        
    //need to take support of thread class
         Thread t1 =new Thread(mt1);
         Thread t2 =new Thread(mt2);
     
         t1.start();
         t2.start();
        // t1.start();
     }
 }
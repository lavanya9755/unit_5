class Test extends Thread{
    static Thread mt = null;
    public void run(){
        try{
            System.out.println("main joined");
            mt.join();
           

        }catch(Exception e){

        }
        for(int i =0;i<10;i++ ){
            System.out.println(i+" run: "+Thread.currentThread().getName());
        }    
    }
}
//instead of simultaneously it will seperate
public class Deadlock {
    public static void main(String[] args) throws InterruptedException {
        Test t= new Test();
        t.setName("Lavi");
        Thread mt = Thread.currentThread();
        t.start();
       // t.join();
      //  mt.join();//control not forward, main htread will wait for life ling 
        
        for(int i =0;i<10;i++ ){
            System.out.println(i+" main: "+Thread.currentThread().getName());
            //Thread.sleep(1000);
    
    } 


    }
}
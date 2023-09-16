class Test extends Thread{
    static Thread mt = null;
    public void run(){
        try{
            mt.join();

        }catch(Exception e){

        }
        for(int i =0;i<10;i++ ){
            System.out.println(i+" run: "+Thread.currentThread().getName());
        }    
    }
}
//instead of simultaneously it will seperate
public class JoinOnMain {
    public static void main(String[] args) throws InterruptedException {
        Test t= new Test();
        t.setName("Lavi");
        Thread.currentThread();
        t.start();
        
        for(int i =0;i<10;i++ ){
            System.out.println(i+" main: "+Thread.currentThread().getName());
            Thread.sleep(1000);
    
    }
}
}

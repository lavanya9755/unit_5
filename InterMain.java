class ThreadB extends Thread{
    int total;
    public void run(){
        synchronized(this){
            System.out.println("child starts");
            for(int i =0; i<=10;i++){
                total+=i;

            }System.out.println("cild notify");
            notify();
        }
    }
}

public class InterMain {
    public static void main(String[] args) throws Exception{
        ThreadB t1=new ThreadB();
        t1.start();

        synchronized(t1){
            System.out.println("main");
            t1.wait();
        }System.out.println("Total: "+t1.total);
    }
    
}

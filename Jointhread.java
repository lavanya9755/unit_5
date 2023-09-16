//ppt pg 32
class NewThread implements Runnable{
    public void run(){
        for(int i =0;i<4;i++){
            System.out.println(i);
        }System.out.println("done execution");
    }
}

public class Jointhread {
    public static void main(String[] args) {
       NewThread nt1 = new NewThread();
        Thread t1 =new Thread(nt1);

        NewThread nt2 = new NewThread();
        Thread t2 =new Thread(nt2);

        t1.start();
        try{
            System.out.println("joining start");
            t1.join();
            System.out.println("t2 exe");
           // t2.start();

        }catch(Exception e ){
            System.out.println("exception got caught");
        }
    }
}

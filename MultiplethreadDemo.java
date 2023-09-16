class MyThread extends Thread{
   public void run(){
    for(int i =0;i<10;i++ ){
        System.out.println(i+" run: "+Thread.currentThread().getName());

    }
} 

}
public class MultiplethreadDemo{

    public static void main(String[] args) {
        MyThread mt1 =new MyThread();
        mt1.setName("KIT");
        MyThread mt2 =new MyThread();
        mt2.setName("vIT");
    
        mt1.start();
        mt2.start();
    }
}
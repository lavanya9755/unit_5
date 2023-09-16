class MyThread extends Thread{
public void run(){

for(int i=0;i<10;i++){
        System.out.println("Child thread");

        }
    }
}

public class ThreadDemo{

public static void main(String arg[]){ 
MyThread t1 = new MyThread(); 
t1.start();
//t1.run();//one one thrad is made abd it runs as a normal method
/*main thread starts the child thread : Now, 2 threads main + MyThread in
action*/
for(int i=0;i<10;i++){
    System.out.println("Main thread");

            }

    }

}

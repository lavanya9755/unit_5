class NewThread extends Thread{
NewThread(){
    super("Demo");
    System.out.println("child thread "+ this);
    start();
}
public void run(){
    System.out.println(getName());
    System.out.println(getPriority());
    System.out.println(isAlive());
    try{
        sleep(10000);
        System.out.println("sleeeping");
    }catch(Exception e){
        System.out.println("got caught");
    }
}
}

public class MethodsofThread {
    public static void main(String[] args) {
        new NewThread();
    }
}

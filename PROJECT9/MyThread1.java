public class MyThread1 extends Thread{
    public void run(){
        System.out.println("Important job running in MyThread");
    }
    public void run(String s){
        System.out.println("String in run is "+s);
    }
    public static void main(String[] args){
        MyThread1 thread = new MyThread1();
        thread.start();
        thread.run("test");
    }
}

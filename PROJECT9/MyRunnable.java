public class MyRunnable implements Runnable{
    public void run(){
        System.out.println("Le thread a été lancé !");
    }

    public static void main(String[] args) {
        Thread newThread = new Thread(new MyRunnable());
        newThread.start();
    }
}

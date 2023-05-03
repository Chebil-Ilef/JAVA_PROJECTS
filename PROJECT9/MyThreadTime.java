public class MyThreadTime extends Thread{

    public int remainingTime;

    // Constructor
    public MyThreadTime(int remainingTime){
        this.remainingTime = remainingTime;
    }
    //run
    public void run(){
        while(remainingTime>0){
            System.out.println("Remaining time: "+remainingTime);
            remainingTime--;
            try{
                sleep(1000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println("Thread finished");

    }

    public static void main(String[] args) {
        if(args.length==0){
            System.out.println("java MyThreadTime <int> ! Au moins 1 argument!");
            return;
        }

        for(int i=0;i<args.length;i++){
            int time=Integer.parseInt(args[i]);
           Thread thread=new Thread(new MyThreadTime(time));
            thread.start();
        }
    }
}

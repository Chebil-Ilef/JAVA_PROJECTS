public class MyThreadTimeName implements Runnable{
    public int remainingTime;
    public String name;

    public MyThreadTimeName(int remainingTime, String name){
        this.remainingTime = remainingTime;
        this.name = name;
    }

    //run
    public void run(){
        while(remainingTime>0){
            System.out.println(name+ " -Remaining time: "+remainingTime);
            remainingTime--;
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println(name+" finished");
    }

    public static void main(String[] args) {
        if (args.length<2) {
            System.out.println("java MyThreadTimeName <int> <string>.Au moins 2 arguments!");
            return;
        }
        int j=0;
        for(int i=0;i<args.length/2;i++){
            int time=Integer.parseInt(args[j]);
            String name=args[j+1];
            j+=2;
            Thread thread=new Thread(new MyThreadTimeName(time,name));
            thread.start();
        }

    }
}

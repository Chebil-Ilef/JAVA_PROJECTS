Threads
MyThread1: thread def using extends Thread and run (redef .start() in main) (overriding run(..) in main)
MyRunnable: thread def using MyRunnable implements Runnable and Thread t=new Thread(new Runnable()) in main
**Note: Thread t = new Thread(new MyThread()); legal
 The constructors we care about are
 Thread()
 Thread(Runnable target)
 Thread(Runnable target, String name)
 Thread(String name)
MyThreadTime: run a thread or multiple for a certain amount of time showing remaining time + pause between exec :
               try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
              java MyThreadTime 10 20
MyThreadTimeName: run a thread or multiple for a certain amount of time showing remaining time + pause between exec
                    + shows which thread is executing
MyThreadTable1Row: run multiple threads in a table showing thread name and remaining time
                   each thread execution in one row
MyThreadTableRows:  run multiple threads in a table showing thread name and remaining time
                   each thread execution in many rows


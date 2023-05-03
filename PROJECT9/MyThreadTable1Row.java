import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.concurrent.TimeUnit;

public class MyThreadTable1Row extends Thread {
    public String threadName;
    public int duration;
    public DefaultTableModel tableModel;

    public MyThreadTable1Row(String threadName, int duration, DefaultTableModel tableModel) {
        this.threadName = threadName;
        this.duration = duration;
        this.tableModel = tableModel;
    }

    @Override
    public void run() {
        int rowIndex = tableModel.getRowCount();
        tableModel.addRow(new Object[]{threadName, duration });


        while (duration> 0) {
            tableModel.setValueAt(duration, rowIndex, 1);
            duration--;

            try {
                Thread.sleep(1000); // Pause for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        tableModel.setValueAt("Finished", rowIndex, 1);
    }

    public static void main(String[] args) {
        // Create the frame using JFrame
        JFrame frame = new JFrame("Thread Execution Table");
        JTable table = new JTable(new DefaultTableModel(new Object[]{"Thread Name", "Remaining Time (seconds)"}, 0));
        DefaultTableModel tableModel = (DefaultTableModel) table.getModel();

        if (args.length<2) {
            System.out.println("java MyThreadTable1Row <String> <int> ! Au moins 2 arguments!");
            return;
        }
        int j=0;
        for(int i=0;i<args.length/2;i++){
            String name=args[j];
            int time=Integer.parseInt(args[j+1]);
            j+=2;
            Thread thread=new MyThreadTable1Row(name,time,tableModel);
            thread.start();
        }

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.getContentPane().add(new JScrollPane(table));
        frame.setVisible(true);
    }
}

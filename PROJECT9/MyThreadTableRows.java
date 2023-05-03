import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class MyThreadTableRows extends Thread {
    private String threadName;
    private int duration;
    private DefaultTableModel tableModel;

    public MyThreadTableRows(String threadName, int duration, DefaultTableModel tableModel) {
        this.threadName = threadName;
        this.duration = duration;
        this.tableModel = tableModel;
    }

    @Override
    public void run() {
        synchronized (tableModel) {
            int remainingTime = duration;
            while (remainingTime >= 0) {
                final int time = remainingTime;
                SwingUtilities.invokeLater(() -> tableModel.addRow(new Object[]{threadName, time}));

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                remainingTime--;
                int rowCount = tableModel.getRowCount();
                if (rowCount > 0) {
                    SwingUtilities.invokeLater(() -> tableModel.setValueAt(time, rowCount - 1, 1));
                }
            }

            int rowCount = tableModel.getRowCount();
            if (rowCount > 0) {
                SwingUtilities.invokeLater(() -> tableModel.setValueAt("Finished", rowCount - 1, 1));
            }
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Thread Execution Table");
        JTable table = new JTable(new DefaultTableModel(new Object[]{"Thread Name", "Remaining Time (seconds)"}, 0));
        DefaultTableModel tableModel = (DefaultTableModel) table.getModel();

        if (args.length < 2 || args.length % 2 != 0) {
            System.out.println("Usage: java MyThreadTableRows <threadName1> <duration1> <threadName2> <duration2> ...");
            return;
        }

        for (int i = 0; i < args.length; i += 2) {
            String threadName = args[i];
            int duration = Integer.parseInt(args[i + 1]);
            Thread thread = new MyThreadTableRows(threadName, duration, tableModel);
            thread.start();
        }

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.getContentPane().add(new JScrollPane(table));
        frame.setVisible(true);
    }
}

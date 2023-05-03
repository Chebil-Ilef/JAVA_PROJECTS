import javax.swing.*;
import java.util.TimerTask;

public class UpdateTime extends TimerTask {
    private final JLabel l1;
    public UpdateTime(JLabel l1) {
        this.l1 = l1;
    }

    @Override
    public void run() {
        l1.setText(new java.util.Date().toString());
    }


}

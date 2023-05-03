import java.awt.event.*;
import java.awt.*;

public class MyActionListenerForNew implements ActionListener {
    private FileDialog fileDialog;
    private TextArea text;

    public MyActionListenerForNew(FileDialog fileDialog, TextArea text) {
        this.fileDialog = fileDialog;
        this.text = text;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        text.setText("");
        fileDialog.setDirectory(null);
        fileDialog.setFile(null);
    }
}

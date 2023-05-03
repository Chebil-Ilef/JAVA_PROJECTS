import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyActionListenerForOpen implements ActionListener {

    private FileDialog fileDialog ;

    private TextArea text ;


    public MyActionListenerForOpen(FileDialog fileDialog , TextArea text){
        this.fileDialog= fileDialog ;
        this.text = text ;
    }

    public void actionPerformed(ActionEvent e){
        fileDialog.setMode(FileDialog.LOAD);
        fileDialog.setVisible(true);

        if (fileDialog.getFile() == null){
            return ;
        }
        text.setText(MyFrameAWT.content(MyFrameAWT.getPath(fileDialog)));
    }
}
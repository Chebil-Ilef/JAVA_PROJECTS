import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MyActionListenerForSave implements ActionListener {

    private FileDialog fileDialog ;
    private  TextArea text ;

    public MyActionListenerForSave(FileDialog fileDialog, TextArea text) {
        this.fileDialog = fileDialog;
        this.text = text;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(fileDialog.getFile() == null){
            fileDialog.setMode(FileDialog.SAVE);
            fileDialog.setVisible(true);
        }
        if(fileDialog.getFile() == null){
            return;
        }
        File currentFile = new File(MyFrameAWT.getPath(fileDialog)) ;
        try{
            FileWriter fw = new FileWriter(currentFile.getPath()) ;
            BufferedWriter bw = new BufferedWriter(fw) ;

            String content = text.getText() ;
            bw.write(content); ;
            bw.close();
        }catch (IOException e1){
            System.out.println("Couldn't write to file :" + currentFile.getPath());
        }
    }
}
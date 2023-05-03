import java.awt.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MyFrameAWT extends Frame {
    public static String content(String filePath){
        String output ="" ;
        try{
            FileReader fr = new FileReader(filePath) ;
            BufferedReader br = new BufferedReader(fr) ;

            int i = br.read() ;
            while(i!= -1){
                output+=  (char) i ;
                i =br.read() ;
            }

            br.close();
        }catch (IOException e){
            output = "" ;
        }
        return  output ;
    }

    public static  String getPath(FileDialog fileDialog){
        return
                fileDialog.getDirectory()+fileDialog.getFile();
    }

    public MyFrameAWT(String title){
        super(title) ;
        setBounds(50,50,540,400);
        setVisible(true);
        setLayout(new GridLayout(2,1));
        addWindowListener(new MyWindowListener());
        FileDialog fileDialog = new FileDialog(this,"Choose a file", FileDialog.LOAD) ;

        Panel buttonPanel = new Panel() ;
        buttonPanel.setLayout(new FlowLayout());
        buttonPanel.setBackground(Color.GREEN);
        add(buttonPanel) ;

        Panel textPanel = new Panel() ;
        textPanel.setLayout(new FlowLayout());
        textPanel.setBackground(Color.YELLOW);
        add(textPanel) ;

        TextArea text = new TextArea(content(getPath(fileDialog)),9,60);
        textPanel.add(text) ;

        Button newFileButton = new Button("New") ;
        newFileButton.addActionListener(new MyActionListenerForNew(fileDialog,text));
        buttonPanel.add(newFileButton) ;

        Button openFileButton = new Button("Open") ;
        openFileButton.addActionListener(new MyActionListenerForOpen(fileDialog,text));
        buttonPanel.add(openFileButton) ;

        Button saveFileButton = new Button("Save") ;
        saveFileButton.addActionListener(new MyActionListenerForSave(fileDialog,text));
        buttonPanel.add(saveFileButton) ;

        Button exitButton = new Button("Exit") ;
        exitButton.addActionListener(new MyActionListenerForExit());
        buttonPanel.add(exitButton) ;

        MenuItem newFile = new MenuItem("New") ;
        newFile.addActionListener(new MyActionListenerForNew(fileDialog,text));

        MenuItem openFile = new MenuItem("Open") ;
        openFile.addActionListener(new MyActionListenerForOpen(fileDialog,text));

        MenuItem saveFile = new MenuItem("Save") ;
        saveFile.addActionListener(new MyActionListenerForSave(fileDialog,text));

        MenuItem exit = new MenuItem("Exit") ;
        exit.addActionListener(new MyActionListenerForExit());

        Menu fileMenu = new Menu("File") ;
        fileMenu.add(newFile) ;
        fileMenu.add(openFile) ;
        fileMenu.add(saveFile) ;
        fileMenu.add(exit) ;

        MenuBar mb = new MenuBar() ;
        mb.add(fileMenu) ;

        setMenuBar(mb); ;





    }
}
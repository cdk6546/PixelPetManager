import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.jar.JarEntry;

public class GUI extends JFrame {
    private static JLabel theimg;
    private JLabel theSpeech;

    public GUI(){

        JFrame k = new JFrame();
        JFrame b = new JFrame();

        JLabel theSpeech = new JLabel("Wowza");

        theimg = new JLabel(new ImageIcon("src/2.png"));


        k.setUndecorated(true);
        k.setBackground(new Color(0, 0, 0, 0));
        k.setLayout(null);


        k.add(theimg);
        theimg.setVisible(true);
        k.setExtendedState(JFrame.MAXIMIZED_BOTH);

        pack();

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        double width = screenSize.getWidth();
        double height = screenSize.getHeight();

        theimg.setBounds((int) width - 300, (int) height - 210, 200, 200);

        k.setAlwaysOnTop(true);
        k.setVisible(true);


    }

}

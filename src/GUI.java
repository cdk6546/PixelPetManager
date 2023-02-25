import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.jar.JarEntry;

public class GUI extends JFrame {
    private JButton button1;
    private JPanel panel1;

    private static ImageIcon img;

    private static JLabel theimg;

    public GUI(){
        JFrame k = new JFrame();
        theimg = new JLabel(new ImageIcon("src/2.png"));


        k.setUndecorated(true);
        k.setBackground(new Color(0, 0, 0, 0));
        k.setLayout(null);


        k.add(theimg);
        theimg.setVisible(true);

        pack();
        theimg.setBounds(1200, 690, 200, 200);

        k.setExtendedState(JFrame.MAXIMIZED_BOTH);
        k.setAlwaysOnTop(true);
        k.setVisible(true);


    }

    public static void main(String[] args){
        GUI h = new GUI();

    }
}

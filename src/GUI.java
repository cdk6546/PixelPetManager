import javax.swing.*;
import javax.swing.event.MouseInputListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.jar.JarEntry;

/**
 * This is the instance of billy, which also opens the task manager
 */

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

        sayStuff s = new sayStuff();
        s.createSayStuff();

        k.addMouseListener(new MouseInputListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                SpeechBubble b = new SpeechBubble();
                b.createSpeech();
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }

            @Override
            public void mouseDragged(MouseEvent e) {

            }

            @Override
            public void mouseMoved(MouseEvent e) {

            }
        });


    }

}

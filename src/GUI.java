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
    private static JButton wowaButton;

    public GUI(){ // add parameter jlabel text for different images / versions

        JFrame k = new JFrame();

        theimg = new JLabel(new ImageIcon("src/" + choosePet.animalChosen + ".png"));

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
            SpeechBubble sp = new SpeechBubble();

            @Override
            public void mouseClicked(MouseEvent e) {
                Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
                int height = screenSize.height;
                int width = screenSize.width;



                if (sp.l != null) {
                    sp.dispose();
                    sp.createSpeech();
                    sp.setLocation(width-(width/2)-sp.getWidth()/2,50);
                } else {
                    sp.newLabel();
                    sp.createSpeech();
                    sp.setLocation(width-(width/2)-sp.getWidth()/2,50);
                }
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

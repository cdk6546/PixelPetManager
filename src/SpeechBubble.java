import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseListener;

public class SpeechBubble extends JFrame {
    public JPanel panel1;
    public JLabel l;
    public SpeechBubble() {
        panel1 = new JPanel();
        l = null;
    }

    public void newLabel() {
        l = new JLabel(Main.VP.getSaying(taskWindow.TM), (int) CENTER_ALIGNMENT);

    }

    public void createSpeech(){
        setContentPane(panel1);
        setIconImage(Main.icon.getImage());
        l.setText(Main.VP.getSaying(taskWindow.TM));
        setTitle("Message from " + PetCreator.petName  + "!");
        panel1.add(l);
        pack();
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
}



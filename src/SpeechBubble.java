import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseListener;

public class SpeechBubble extends JFrame {
    public SpeechBubble() {

    }

    public void createSpeech(){
        JFrame b = new JFrame();
        JLabel l = new JLabel(Main.VP.getSaying(taskWindow.TM), (int) CENTER_ALIGNMENT);
        b.add(l);
        b.setVisible(true);
    }

}



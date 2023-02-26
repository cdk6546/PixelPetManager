import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseListener;

public class SpeechBubble extends JFrame {
    public SpeechBubble(VirtualPet VP) {
        JPanel b = new JPanel();
        JLabel thetext = new JLabel(VP.getSaying(taskWindow.TM), SwingConstants.CENTER);

        b.setBackground(new Color(255, 255, 255, 100));

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        double width = screenSize.getWidth();
        double height = screenSize.getHeight();

        b.setBounds((int) width - 400, (int) height - 190, 200, 200);

        b.setSize(150, 75);

        b.add(thetext);

        b.setVisible(true);
    }
}


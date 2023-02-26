import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Are you ready to add tasks? You click yes and it moves to next window
 */

public class sayStuff {
    private JPanel panel1;
    private JButton yesButton;

    public sayStuff() {
        yesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JComponent comp = (JComponent) e.getSource();
                Window win = SwingUtilities.getWindowAncestor(comp);
                ((Window) win).dispose();
                new iSaidYes().createIt();

            }
        });
    }

    public void createSayStuff() {
        JFrame frame = new JFrame(PetCreator.petName + "'s Task Manager");
        frame.setContentPane(new sayStuff().panel1);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int height = screenSize.height;
        int width = screenSize.width;

        frame.setLocation(width/2 - 175, height/2 - 150);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(350, 250);
        frame.setVisible(true);
    }
}
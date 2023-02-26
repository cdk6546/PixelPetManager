import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * This is what creates billy and his name
 */

public class PetCreator {
    private JPanel panel1;
    private JTextField textField1;

    public static String petName;

    public PetCreator() {
        textField1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                petName = textField1.getText();
                System.out.println(petName);

                JComponent comp = (JComponent) e.getSource();
                Window win = SwingUtilities.getWindowAncestor(comp);
                ((Window) win).dispose();

                new GUI();
            }
        });
    }

    public void creatorofPet() {
        JFrame frame = new JFrame("PetCreator");
        frame.setContentPane(new PetCreator().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}


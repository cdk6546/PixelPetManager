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
        textField1.setFont(new Font("Plain", Font.PLAIN, 17));
        textField1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                petName = textField1.getText();

                JComponent comp = (JComponent) e.getSource();
                Window win = SwingUtilities.getWindowAncestor(comp);
                ((Window) win).dispose();

                new GUI();
            }
        });
    }

    public void creatorofPet() {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int height = screenSize.height;
        int width = screenSize.width;

        JFrame frame = new JFrame("Task Manager");
        frame.setIconImage(Main.icon.getImage());
        frame.setLocation(width / 2 - 125, height / 2 - 100);
        frame.setSize(200, 125);
        frame.setContentPane(new PetCreator().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class choosePet {

    static String animalChosen;
    public choosePet() {
    }

    public static void createChoosePet(){
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int height = screenSize.height;
        int width = screenSize.width;

        JFrame frame = new JFrame("Task Manager");
        frame.setIconImage(Main.icon.getImage());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocation(width/2 - 100, height/2 - 100);
        frame.setSize(200, 125);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        frame.add(panel);

        JLabel lbl = new JLabel("Choose a pet, then click okay!");
        lbl.setAlignmentX(Component.CENTER_ALIGNMENT);

        panel.add(lbl);



        String[] pets = { "Fox", "Lemur", "Bear", "Deer", "Brick", "Goose","Mini Frog", "Tiger"};

        final JComboBox<String> cb = new JComboBox<String>(pets);

        cb.setMaximumSize(cb.getPreferredSize());
        cb.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(cb);

        JButton b = new JButton("OKAY!");
        b.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(b);

        frame.setVisible(true);

        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                animalChosen = cb.getSelectedItem().toString();
                JComponent comp = (JComponent) e.getSource();
                Window win = SwingUtilities.getWindowAncestor(comp);
                ((Window) win).dispose();
                PetCreator p = new PetCreator();
                p.creatorofPet();
            }
        });


    }
}

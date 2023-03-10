import javax.swing.*;
import javax.swing.border.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.ArrayList;


public class taskWindow extends JFrame {
    public static TaskManager TM = new TaskManager(iSaidYes.getTasks());
    private JPanel panel1 = new JPanel();
    private JCheckBox boxes[];

    public taskWindow() {
        setIconImage(Main.icon.getImage());
        panel1.setLayout(new GridLayout(iSaidYes.getTasks().size() + 1, 1));
        panel1.setBorder(new EmptyBorder(10, 10, 10, 10));
        setContentPane(panel1);
        JLabel text2 = new JLabel("<html>" + PetCreator.petName + "'s happiness increases as you complete each task!<br> Click on " +
                PetCreator.petName + " to get a response from them based on their happiness.<br> You never know what you'll get!<br><br> Tasks:</html>");
        panel1.add(text2);

        boxes = new JCheckBox[iSaidYes.getTasks().size()];

        for (int i = 0; i < iSaidYes.getTasks().size(); i++) {
            Task task = iSaidYes.getTasks().get(i);
            boxes[i] = createCheckBox(task);
            panel1.add(boxes[i]);
        }
        setTitle(PetCreator.petName + "'s " + "Task Manager");

        pack();
        setVisible(true);
        setResizable(true);

        addWindowListener(new WindowListener() {
            @Override
            public void windowOpened(WindowEvent e) {

            }

            @Override
            public void windowClosing(WindowEvent e) {
                theButton b = new theButton();
                b.createButton();

            }

            @Override
            public void windowClosed(WindowEvent e) {

            }

            @Override
            public void windowIconified(WindowEvent e) {

            }

            @Override
            public void windowDeiconified(WindowEvent e) {

            }

            @Override
            public void windowActivated(WindowEvent e) {

            }

            @Override
            public void windowDeactivated(WindowEvent e) {

            }
        });

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    }

    public JCheckBox createCheckBox(Task task) {
        JCheckBox checkBox = new JCheckBox(task.getName());
        checkBox.setBorder(new EmptyBorder(1, 0, 0, 0));
        checkBox.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                task.setComplete(checkBox.isSelected());
            }
        });
        return checkBox;
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame(PetCreator.petName + "'s Task Manager'");
        frame.setContentPane(new taskWindow().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

}

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class iSaidYes {
    private JPanel panel1;
    private JTextField textField1;
    private JButton allDoneButton;

    public static ArrayList<Task> tasks = new ArrayList<>();

    public iSaidYes() {


        textField1.setFont(new Font("Plain", Font.PLAIN, 17));
        textField1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String input = textField1.getText();
                tasks.add(new Task(input));
                textField1.setText("");
                System.out.println(tasks);

            }
        });
        allDoneButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JComponent comp = (JComponent) e.getSource();
                Window win = SwingUtilities.getWindowAncestor(comp);
                ((Window) win).dispose();

                new taskWindow();
            }
        });
    }

    public static ArrayList<Task> getTasks() {
        return tasks;
    }

    public void createIt(){
        JFrame frame = new JFrame(PetCreator.petName + "'s Task Manager");
        frame.setContentPane(new iSaidYes().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(300, 250);
        frame.setVisible(true);


    }

}



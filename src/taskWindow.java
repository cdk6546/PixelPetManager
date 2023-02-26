import javax.swing.*;
import javax.swing.border.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.util.ArrayList;


public class taskWindow extends JFrame{
    public static TaskManager TM = new TaskManager(iSaidYes.getTasks());
    private JPanel panel1 = new JPanel();
    private JCheckBox boxes[];
    public taskWindow() {
        panel1.setLayout(new GridLayout(iSaidYes.getTasks().size() + 1, 2));
        panel1.setBorder(new EmptyBorder(10, 10, 10, 10));
        setContentPane(panel1);
        JLabel text = new JLabel("Tasks:");
        panel1.add(text);

        boxes = new JCheckBox[iSaidYes.getTasks().size()];

        for(int i = 0; i < iSaidYes.getTasks().size(); i++){
            Task task = iSaidYes.getTasks().get(i);
            boxes[i] = createCheckBox(task);
            panel1.add(boxes[i]);
        }
        setTitle(PetCreator.petName + "'s " + "Task Manager");

        pack();
        setVisible(true);
        setResizable(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    }
    public JCheckBox createCheckBox(Task task){
        JCheckBox checkBox = new JCheckBox(task.getName());
        checkBox.setBorder(new EmptyBorder(2, 0, 0, 0));
       checkBox.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                task.setComplete(checkBox.isSelected());
                System.out.println(TM.getPercentage());
            }
        });
       return checkBox;
//        panel1.add(boxes[i]);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("taskWindow");
        frame.setContentPane(new taskWindow().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}

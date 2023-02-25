import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class iSaidYes {
    private JPanel panel1;
    private JTextField textField1;

    public ArrayList<String> tasks = new ArrayList<>();

    public iSaidYes() {


        textField1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String input = textField1.getText();
                tasks.add(input);
                textField1.setText("");
                System.out.println(tasks);

            }
        });
    }

    public void createIt(){
        JFrame frame = new JFrame("iSaidYes");
        frame.setContentPane(new iSaidYes().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(250, 250);
        frame.setVisible(true);


    }

}



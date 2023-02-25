import javax.swing.*;

public class iSaidYes extends JFrame{
    private JPanel panel1;
    private JTextField textField1;

    public iSaidYes() {
        JFrame frame = new JFrame("iSaidYes");
        frame.setContentPane(new iSaidYes().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(250, 250);
        frame.setVisible(true);
    }
}



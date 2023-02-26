import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class theButton {
    public theButton() {
    }
    public void createButton(){
        JFrame buttonHolder = new JFrame();
        JButton wowaButton = new JButton();

        wowaButton = new JButton("Open " + PetCreator.petName + "'s new Task Manager");

        buttonHolder.setSize(300,100);
        buttonHolder.add(wowaButton);
        buttonHolder.setVisible(true);

        wowaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new iSaidYes().createIt();
                JComponent comp = (JComponent) e.getSource();
                Window win = SwingUtilities.getWindowAncestor(comp);
                ((Window) win).dispose();
            }
        });

    }


}

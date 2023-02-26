import javax.swing.*;

/**
 * the main program
 */

public class Main {

    public static VirtualPet VP = new VirtualPet(PetCreator.petName ,taskWindow.TM);
    public static ImageIcon icon = new ImageIcon("src/Goose.png");
    public Main() {


    }

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(new customLook());
        } catch (Exception e) {
            e.printStackTrace();
        }
        choosePet.createChoosePet();

    }
}

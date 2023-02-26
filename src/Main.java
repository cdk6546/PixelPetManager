/**
 * the main program
 */

public class Main {

    public static VirtualPet VP = new VirtualPet(PetCreator.petName ,taskWindow.TM);
    public Main() {


    }

    public static void main(String[] args) {
        PetCreator p = new PetCreator();
        p.creatorofPet();

    }
}

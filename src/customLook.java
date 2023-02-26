import javax.swing.*;
import javax.swing.plaf.metal.MetalLookAndFeel;
import java.awt.*;

public class customLook extends MetalLookAndFeel {

    Color mint_green = new Color(180,207,188);
    Color slate_green = new Color(56, 86, 78);

    @Override
    public String getName() {
        return "Custom Look and Feel";
    }

    @Override
    public String getID() {
        return "customlook";
    }

    @Override
    public String getDescription() {
        return "A custom look and feel for Swing applications";
    }

    @Override
    protected void initClassDefaults(UIDefaults table) {
        // Override default values for Swing classes here
        super.initClassDefaults(table);
    }

    @Override
    protected void initComponentDefaults(UIDefaults table) {
        super.initComponentDefaults(table);

        table.put("Panel.background", mint_green);

        table.put("Label.foreground", Color.BLACK);

        // Set button background color to red and foreground color to white
        table.put("Button.background", slate_green);
        table.put("Button.foreground", Color.BLACK);
    }

    @Override
    public void provideErrorFeedback(Component component) {
        // Override behavior of error feedback here
        super.provideErrorFeedback(component);
    }
}

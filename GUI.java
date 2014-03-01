import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class GUI extends Frame
{
    Panel panel;
    Button buttonNewCar,buttonVan;
    public GUI()
    {

        // Set frame properties
        new TextArea1();
        setTitle("Vehicle Consumption"); // Set the title
        setSize(700,500); // Set size to the frame
        setLayout(new FlowLayout()); // Set the layout
        setVisible(true); // Make the frame visible
        setLocationRelativeTo(null);  // Center the frame
        setBackground(Color.gray);

        //Closing on clicking X
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent ev) {
                System.exit(0);
            }
        });



         // Create the panel
        panel=new Panel();
        panel.setSize(300,300);
        panel.setLayout(new GridBagLayout());
        // Set panel background
        panel.setBackground(Color.red);

        // Create buttons
        buttonNewCar=new Button(); // Create a button with default constructor
        buttonNewCar.setLabel("Sport Car");
        buttonNewCar.setVisible(true);
        buttonNewCar.setBackground(Color.LIGHT_GRAY);// Set the text for button
        buttonVan=new Button();
        buttonVan.setLabel("Van");// Create a button with sample text
        buttonVan.setBackground(Color.LIGHT_GRAY); // Set the background to the button
        // Add the buttons to the panel


        panel.add(buttonNewCar);
        panel.add(buttonVan);

        // Add the panel to the frame
        add(panel);

    }
}
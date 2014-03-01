import java.awt.*;
class TextArea1 extends Frame
{

    TextArea ta,ta1,ta2,ta3,ta4;

    public TextArea1()
    {

        setTitle("AWT TextArea Demo");
        setSize(400,400);
        setLayout(new FlowLayout());
        setVisible(true);
        // Create textarea using first constructor
        ta=new TextArea();

        // Create textarea using second constructor
        ta1=new TextArea("Java-Demos.blogspot.com");

        // Create textarea using third constructor
        ta2=new TextArea(10,25);

        // Create textarea using fourth constructor
        ta3=new TextArea("Java-Demos.blogspot.com",10,25);

        // Create textarea using fifth constructor
        ta4=new TextArea("Java-Demos.blogspot.com",10,25,TextArea.SCROLLBARS_HORIZONTAL_ONLY);

        // Using methods
        ta.setText("Java-Demos.blogspot.com");

        // Non synchronized method
        ta1.append("I am appended.");
        // Synchronized method
        ta2.appendText("I am appended.");

        // Synchronized method
        ta3.insertText("Java-Demos.blogspot.com",4);

        // Non Synchronized method
        ta4.insert("Java-Demos.blogspot.com",5);

        // Set no. of rows
        ta.setRows(10);
        // Get no.of rows
        System.out.println("No.of rows of ta "+ta.getRows());

        // Set no.of columns
        ta.setColumns(10);

        // Get no.of columns
        System.out.println("No. of cols for ta "+ta.getColumns());

        // Get Scrollbar Visibilty
        System.out.println("Scrollbar for ta4 "+ta4.getScrollbarVisibility());
        // Replace text (Synchronized)
        ta1.replaceText("Java-Demos.blogspot.com",23,37);

        // Replace text (Non Synchronized)
        ta1.replaceRange("Java-Demos.blogspot.com",23,37);

        // Add textareas
        add(ta);
        add(ta1);
        add(ta2);
        add(ta3);
        add(ta4);
    }
}
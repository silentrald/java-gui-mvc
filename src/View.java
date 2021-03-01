import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

/**
 * The View in the MVC Model will only do view things, which is
 * displaying the information needed for the user to see. It
 * should not manipulate any data(Controller) nor carry any data(Model).
 * It is just stupid in the matter that when you press a button(action),
 * the view does not do anything.
 */

public class View {

    private JFrame frame;

    private JLabel label;
    private JTextField text;
    private JButton button;

    public View() {

        // Initialize the Window
        // Refer to https://docs.oracle.com/javase/8/docs/api/javax/swing/JFrame.html
        frame = new JFrame("Titlebar Name");                    // The string will be in the title bar of the window
        frame.setSize(800, 600);                                // Window Size
        frame.setLayout(null);                                  // Just set it to null
        frame.setVisible(true);                                 // Set it to true (default set to false)
        // On default, the close [x] button will do nothing so
        // we have to set it to JFrame.EXIT_ON_CLOSE which will
        // close the window properly
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Simple Component
        // JLabel - Adds uneditable text to your window
        label = new JLabel("Hello");        // You can initialize a label with a text
        // or you could do a label.setText({String}); to change its value
        label.setBounds(100, 100, 100, 25);     // Sets the position and size of the component to the window
        frame.add(label);                   // add the component to the frame

        // JTextField - Adds a textfield to your window
        text = new JTextField();            // You can also do a JTextField({String}) to add place an initial string to your text field
        text.setBounds(100, 200, 100, 25);
        frame.add(text);                    // Same Process of adding to the frame

        // JButton - Adds a button that can do something when clicked
        button = new JButton("CLICK ME");
        button.setBounds(100, 300, 100, 25);
        frame.add(button);

        // To search on more components, just type in google and explore for other components

        // updates the window
        frame.revalidate();
        frame.repaint();
        // updates the window
        // Cause when you add a component to the JFrame, it does
        // not automatically show, so you have to call revalidate()
        // and update() to refresh the JFrame
    }

    /**
     * This will get the text from the text field
     * @return {String}
     */  
    public String getText() {
        return text.getText(); // You can call the getText() from the JTextField class
    }

    /**
     * This will set the text from the Label
     * @params {String} str
     */
    public void setLabelText(String str) {
        label.setText(str);
    } 

    /**
     * The listener will be the event when the button is pressed
     * @params {ActionListener} listener
     */
    public void addButtonActionListener(ActionListener listener) {
        button.addActionListener(listener);
        // Since the listener will be set only when it is
        // initialized in the controller, the button here
        // will do nothing when this method is not called
    }

}
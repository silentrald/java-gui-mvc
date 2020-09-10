import java.awt.event.*;

/**
 * This is the Controller in the MVC model. This will act
 * as the communication between the Model(data) and View.
 * This can manipulate, update the values of the Model when
 * an action is performed from the View. Also, this is where
 * you add your listeners to your view in order that it will
 * fire an event, which can update values in your model, or
 * update your view.
 */

public class Controller {

    private View view;
    private Model model;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;

        // Let's add the button click to the view here
        // You could use a lambda notation to add the button click
        view.addButtonActionListener((ActionEvent e) -> { 
            // This will change the JLabel to what the JTextField value is
            view.setLabelText(view.getText());
        });

        /* 
        Alternatively you can do this:
        
        view.addButtonActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                view.setLabelText(view.getText());
            }
        });

        and it yields the same result with the top implementation
        */
    }

}
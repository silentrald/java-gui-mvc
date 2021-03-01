

public class Driver {

    public static void main(String[] args) {
        // Just instantiate all the class that we made
        Model m = new Model();
        View v = new View();
        Controller c = new Controller(m, v); // the controller must have a copy of the model and view
    } 

}
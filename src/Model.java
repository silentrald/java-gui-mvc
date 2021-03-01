
/**
 * The Model in the MVC model is the simpliest to implement.
 * All the data should be stored in the Model and any changes
 * will be updated in the Model class. That's why if you need
 * an int or a String that needs to be stored, you just have
 * to declare it in the Model as private and use getters and
 * setters to fetch or update the data, just like what you
 * would do in a query in a database.
 */

public class Model {

    private String txt;
    private int number;

    public String getTxt() {
        return txt;
    }

    public void setText(String txt) {
        this.txt = txt;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    
}
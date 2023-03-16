package Task1;

public class Customer {

    private String firstName;
    private String lastName;
    private String userName;
    private int id;


    public Customer(String firstName, String lastName, String userName){

        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;

    }



    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {

        String s = "Name: " + getFirstName() + " " + getLastName() + "\n" + "Username: " + getUserName()
                + "\n" + "Id: " + getId() + "\n";

        return s;
    }
}

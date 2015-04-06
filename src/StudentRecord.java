/**
 * Created by Mike on 4/3/15.
 */
public class StudentRecord {
    private int id;
    private String lastName;
    private String firstName;
    private int gradYear;

    public StudentRecord(int id, String lastName, String firstName, int gradYear){
        this.setId(id);
        this.setLastName(lastName);
        this.setFirstName(firstName);
        this.setGradYear(gradYear);
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setGradYear(int gradYear) {
        this.gradYear = gradYear;
    }

    public int getId() {
        return id;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getGradYear() {
        return gradYear;
    }
}

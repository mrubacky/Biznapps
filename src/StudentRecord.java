/**
 * Created by Mike on 4/3/15.
 */
public class StudentRecord {
    private int id;
    private String lastName;
    private String firstName;
    private int height;
    private int weight;

    public StudentRecord(int id, String lastName, String firstName, int height, int weight){
        this.setId(id);
        this.setLastName(lastName);
        this.setFirstName(firstName);
        this.setHeight(height);
        this.setWeight(weight);
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

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWeight(int weight) {
        this.weight = weight;
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

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }
}

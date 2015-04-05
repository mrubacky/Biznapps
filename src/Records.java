import java.util.ArrayList;

/**
 * Created by Mike on 4/5/15.
 */
public class Records {
    public static void main(String[] args){
        ReadRecords app = new ReadRecords();
        app.openFile();
        ArrayList<StudentRecord> recordsToPrint = app.readFile();
        for (StudentRecord r : recordsToPrint){
            System.out.println(r.getId()+" "+r.getLastName()+" "+r.getFirstName()+" "+r.getHeight()+" "+r.getWeight());
        }
    }
}

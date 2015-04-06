import java.util.ArrayList;

/**
 * Created by Mike on 4/5/15.
 */
public class Records {
    public static void main(String[] args){
        ReadRecords app = new ReadRecords();
        app.openFile();
        ArrayList<StudentRecord> recordList = app.readFile();
        Queries.runQuery(recordList);
    }
}

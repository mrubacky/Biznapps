/**
 * Created by Mike on 4/3/15.
 */
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class ReadRecords {
    private Scanner input;
    public void openFile() {
        try {
            input = new Scanner(new File("healthrecords.txt"));
        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println("can't find tha file!");

        }
    }
    public ArrayList<StudentRecord> readFile(){
        ArrayList<StudentRecord> records = new ArrayList<StudentRecord>();
        input.nextLine();
        while (input.hasNext()){
            int id = input.nextInt();
            String ln = input.next();
            String fn = input.next();
            int height = input.nextInt();
            int weight = input.nextInt();
            StudentRecord newRecord = new StudentRecord(id,ln,fn,height,weight);
            records.add(newRecord);
        }
        return records;

    }


}

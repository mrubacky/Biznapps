import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Mike on 4/6/15.
 */
public class Queries {

    public static void runQuery(ArrayList<StudentRecord> srlist) {
        System.out.println("Please select what query to run");
        System.out.println("Enter 1 to display all records");
        System.out.println("Enter 2 to search by last name");
        System.out.println("Enter 3 to search by year");
        Scanner input = new Scanner(System.in);
        if (!input.hasNextInt()){
            System.out.println("please enter a number");
        }
        else {
            switch (input.nextInt()){
                case 1:{
                    for (StudentRecord sr:srlist){
                        System.out.println(sr.getId()+" "+sr.getLastName()+" "+sr.getFirstName()+" "+sr.getGradYear());
                    }
                    break;
                }
                case 2:{
                    System.out.println("please enter the beginning of the last name");
                    String ln = input.next().toLowerCase();
                    for (StudentRecord sr:srlist){
                        if(sr.getLastName().toLowerCase().startsWith(ln)) {
                            System.out.println(sr.getId() + " " + sr.getLastName() + " " + sr.getFirstName() + " " + sr.getGradYear());
                        }
                    }
                    break;

                }
                case 3:{
                    System.out.println("please enter the graduation year");
                    int g = input.nextInt();
                    for (StudentRecord sr:srlist){
                        if(sr.getGradYear()==g) {
                            System.out.println(sr.getId() + " " + sr.getLastName() + " " + sr.getFirstName() + " "+sr.getGradYear());
                        }
                    }
                    break;

                }
            }
        }
    }
}

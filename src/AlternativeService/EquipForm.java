package AlternativeService;
import StudentInfo.StudentData;
import java.util.Scanner;


public class EquipForm {

    public static StudentData fillUp() {
        System.out.println("Fill Up the below form:");

        Scanner scan = new Scanner(System.in);
        System.out.print("Id: ");
        int id = scan.nextInt();

        scan.nextLine();

        System.out.print("Name: ");
        String name = scan.nextLine();

        System.out.print("Department: ");
        String dept = scan.nextLine();

        System.out.print("Age: ");
        int age = scan.nextInt();

        System.out.print("Admission Year: ");
        int admissionYear = scan.nextInt();

        System.out.print("Contact: ");
        String contact = scan.next();

        System.out.print("Address: ");
        String address = scan.next();

        StudentData std = new StudentData(id, name, dept, age, admissionYear, contact);
        std.setAddress(address);

        return std;
    }
}
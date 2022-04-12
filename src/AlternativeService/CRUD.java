package AlternativeService;
import java.util.ArrayList;

import StudentInfo.StudentData;



public class CRUD {

    // create | post
    public static void create(StudentData st, ArrayList<StudentData> db)
    {
        for (StudentData student: db)
        {
            if (student.id == st.id)
            {
                System.out.println("Id already exist");
                return;
            }
        }
        db.add(st);
        System.out.println("Successfully added.");
    }

    // read | get
    public static void filterById(int id, ArrayList<StudentData> db)
    {
        for (StudentData st: db)
        {
            if (st.id == id)
            {
                System.out.println("Student Information:");
                System.out.println("Id              : " + st.id);
                System.out.println("Name            : " + st.name);
                System.out.println("Age             : " + st.age);
                System.out.println("Department      : " + st.department);
                System.out.println("Admission Year  : " + st.admissionYear);
                System.out.println("Address         : " + st.getAddress());
                return;
            }
        }
        System.out.println("Student Information Not Found in Database.");
    }

    // update
    public static void update(StudentData st, ArrayList<StudentData> db)
    {
        int update_index = 0;
        for (StudentData student: db)
        {
            if (student.id == st.id)
            {
                db.remove(update_index);
                db.add(st);
                return;
            }
            update_index ++;
        }
        System.out.println("Information Not Found in Database");
    }

    // delete
    public static void delete(int id, ArrayList<StudentData> db)
    {
        int item_index = 0;
        for (StudentData st: db)
        {
            if (st.id == id) {
                db.remove(item_index);
                return;
            }
            item_index ++;
        }
        System.out.println("Item Not Found in Database");
    }
}
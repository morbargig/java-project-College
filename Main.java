import java.util.Scanner;

class Main {
    static College myCollege;
    static Scanner myObj = new Scanner(System.in);

    public static void main(final String[] args) {
        System.out.println("Enter College name");
        myCollege = new College(myObj.nextLine());
        manue();
        myObj.close();
    }

    public static void manue (){
        while (true) {
            System.out.println("chose action:");
            System.out.println("1) addLecturer");
            System.out.println("2) addDepartment");
            System.out.println("3) addStudent");
            System.out.println("4) addLecturerToDepartment");
            System.out.println("5) bigestDepartmentNameAndStudentsDisplay");
            System.out.println("-1) to exit");
            
            int action = myObj.nextInt();
            System.out.printf("");
            myObj.nextLine();
            switch (action) {
                case 1:
                    addLecturer();
                    break;
                case 2:
                    addDepartment();
                    break;
                case 3:
                    addStudent();
                    break;
                case 4:
                    addLecturerToDepartment();
                    break;
                case 5:
                    bigestDepartmentNameAndStudentsDisplay();
                    break;
                case -1:
                    System.out.println("end function");
                    return;
                default:
                    System.out.println("end function");
                    return;
            }
        }   
    }

    public static void bigestDepartmentNameAndStudentsDisplay() {
        Department bigestDepart = myCollege.bigestDepartment();
        System.out.println(bigestDepart.getName());
        bigestDepart.displayStudents();
    }

    public static void addStudent() {
        System.out.println("Enter Student name");
        String StudentName = myObj.nextLine();
        System.out.println("Enter id");
        double StudentId = myObj.nextDouble();
        while (StudentId > 399999999 || StudentId < 200000000) {
            System.out.println("invalid id\nEnter id");
            StudentId = myObj.nextDouble();
        }
        System.out.printf("");
        myObj.nextLine();
        Student newStudent = new Student(StudentName, StudentId);

        Department myD = null;
        boolean fail = false;
        boolean find = false;
        while (!find) {
            if (fail) {
                System.out.println("can't found depatmenet\n0 to exit 1 to continue");
                boolean res = myObj.nextBoolean();
                if (!res) {
                    return;
                }
            }
            System.out.println("Enter Department name");
            String departmentName = myObj.nextLine();
            for (Department d : myCollege.getDepartments()) {
                if (d.getName().equals(departmentName)) {
                    find = true;
                    myD = d;
                    break;
                }
            }
        }
        myCollege.addStudent(myD, newStudent);
    }

    public static void addLecturer() {
        System.out.println("Enter Lecturer name");
        String LecturerName = myObj.nextLine();
        System.out.println("Enter pay for hour");
        Double LecturerCours = myObj.nextDouble();
        System.out.printf("");
        myObj.nextLine();
        Lecturer newLecturer = new Lecturer(LecturerName, LecturerCours);
        myCollege.addLecturer(newLecturer);
    }

    public static void addDepartment() {
        System.out.println("Enter Department name");
        String departmentName = myObj.nextLine();
        // System.out.println(departmentName);
        Department newDepartment = new Department(departmentName);
        myCollege.addDepartment(newDepartment);
    }

    public static void addLecturerToDepartment() {
        System.out.println("Enter Lecturer name");
        String lecturerName = myObj.nextLine();
        System.out.println("Enter Department name");
        String departmentName = myObj.nextLine();
        boolean find = false;
        Department myD = null;
        Lecturer myl = null;
        for (Department d : myCollege.getDepartments()) {
            // System.out.println("name :" + d.getName() +" " + departmentName );
            if (d.getName().equals(departmentName)) {
                // System.out.println("found 1");
                myD = d;
                find = true;
                break;
            }
        }
        if (!find) {
            System.out.println("can't found depatmenet");
            return;
        }
        find = false;
        for (Lecturer l : myCollege.getLecturers()) {
            // System.out.println("name :" + l.getName() +" " + lecturerName );
            if (l.getName().equals(lecturerName)) {
                // System.out.println("found 2");
                myl = l;
                find = true;
                break;
            }
        }
        if (!find) {
            System.out.println("can't found lecturer");
            return;
        }
        myD.addLecturer(myl);
    }

}

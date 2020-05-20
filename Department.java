import java.util.ArrayList;

class Department{
    private String name;
    private ArrayList <Lecturer> DepartmentLecturers;
    private ArrayList <Student> DepartmentStudent;
    Department(String name ){
        this.name = name;
        this.DepartmentLecturers = new ArrayList <Lecturer>();
        this.DepartmentStudent = new ArrayList <Student>();
    }
    public void addLecturer(Lecturer lecturer){
        if (!DepartmentLecturers.contains(lecturer) ){
            DepartmentLecturers.add(lecturer);
        }else{
            System.out.println("Lecturer already exist");
        }
    }
    public void addStudent(Student s){
        if (!DepartmentStudent.contains(s) ){
            DepartmentStudent.add(s);
        }else{
            System.out.println("Student already exist");
        }
    }

    public int numberOfStudents (){
        return this.DepartmentLecturers.size();
    }

    public String getName() {
        return this.name;
    }
    
    public void displayStudents(){
        for (Student s : DepartmentStudent){
            s.displayName();
        }
    }

    public void display(){
    System.out.println("this is" + this.name + "Department and it has" + String.valueOf(this.DepartmentLecturers.size()) + "Lecturers"   );
    }
}
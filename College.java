import java.util.ArrayList;

public class College {
    String name;
    private static ArrayList <Lecturer> CollegeLecturers;
    private  ArrayList <Student> CollegeStudents;
    private static ArrayList <Department> CollegeDepartment;
    College(String name){
        this.name = name;
        CollegeDepartment  = new ArrayList <Department>();
        CollegeLecturers = new ArrayList<Lecturer>();
        this.CollegeStudents = new ArrayList<Student>();
    }
    public void addLecturer(Lecturer l){
        if (!CollegeLecturers.contains(l)){
            CollegeLecturers.add(l)
;
        }else{
            System.out.println("Lecturer already exist");
        }
    }
    public void addDepartment(Department d){
        if (!CollegeDepartment.contains(d)){
            CollegeDepartment.add(d)
;
        }else{
            System.out.println("Lecturer already exist");
        }
    }
    public void addLecturerToDepartment(Department d, Lecturer l) {
        int index = CollegeDepartment.indexOf(d);
        CollegeDepartment.get(index).addLecturer(l);
        CollegeLecturers.add(l);
    }
    public void addStudent (Department d , Student s ){
        int index = CollegeDepartment.indexOf(d);
        CollegeDepartment.get(index).addStudent(s);
        CollegeStudents.add(s);   
    }
    public Department bigestDepartment(){
        int max = -1;
        Department bigestDepartment = null; 
        for (Department d : CollegeDepartment){
            int numberOfStudents = d.numberOfStudents();
            if ( numberOfStudents > max){
                max = numberOfStudents;
                bigestDepartment = d;
            }
        }
        return bigestDepartment;
    }
    public ArrayList <Department>  getDepartments(){
        // System.out.println(CollegeDepartment);
        return CollegeDepartment;
    }
    public ArrayList <Lecturer>  getLecturers(){
        return CollegeLecturers;
    }
}
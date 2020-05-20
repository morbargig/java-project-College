public class Student {
    String name;
    double id;

    Student(String name, double id) {
        setId(id);
        setName(name);
    }

    public void displayName(){
        System.out.println(name);
    }

    public double getId() {
		return id;
	}

	public void setId(double id) {
		this.id = id;
	}

    public void setName(String name){
        this.name = name;
    }

	public String getName() {
        return name;
    }
}
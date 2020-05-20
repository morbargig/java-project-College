public class Lecturer {
    private String name;
    private Double payPerHour;

    public Lecturer(String name, Double payPerHour) {
        this.setName(name);
        this.setPayPerHour(payPerHour);
    }

    public Double getPayPerHour() {
		return payPerHour;
	}

	public void setPayPerHour(Double payPerHour) {
		this.payPerHour = payPerHour;
	}

    public void setName(String name){
        this.name = name;
    }

	public String getName() {
        return name;
    }
}
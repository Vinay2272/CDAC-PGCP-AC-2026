package Inheritance;


	abstract class Employee extends Person {
	    protected String dept, desg, doj;

	    public Employee(String name, String mobile, String email,
	                    String dept, String desg, String doj) {
	        super(name, mobile, email);
	        this.dept = dept;
	        this.desg = desg;
	        this.doj = doj;
	    }

	    abstract double calculateSalary();

	    public String getDesg() { return desg; }
	    public String getDept() { return dept; }

	    public void display() {
	        super.display();
	        System.out.println(dept + " " + desg + " " + doj);
	    }
	}

package Inheritance;


	class SalariedEmp extends Employee {
	    private double basic;

	    public SalariedEmp(String name, String mobile, String email,
	                       String dept, String desg, String doj, double basic) {
	        super(name, mobile, email, dept, desg, doj);
	        this.basic = basic;
	    }

	    public double calculateSalary() {
	        double da = 0.10 * basic;
	        double hra = 0.15 * basic;
	        double pf = 0.12 * basic;
	        return basic + da + hra - pf;
	    }
	}


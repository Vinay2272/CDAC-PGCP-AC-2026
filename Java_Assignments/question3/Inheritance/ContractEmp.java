package Inheritance;

class ContractEmp extends Employee {
    private int hours;
    private double rate;

    public ContractEmp(String name, String mobile, String email,
                       String dept, String desg, String doj,
                       int hours, double rate) {
        super(name, mobile, email, dept, desg, doj);
        this.hours = hours;
        this.rate = rate;
    }

    public double calculateSalary() {
        return hours * rate;
    }
}

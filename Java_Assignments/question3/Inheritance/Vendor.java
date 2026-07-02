package Inheritance;

class Vendor extends Employee {
    private int noOfEmp;
    private double amount;

    public Vendor(String name, String mobile, String email,
                  String dept, String desg, String doj,
                  int noOfEmp, double amount) {
        super(name, mobile, email, dept, desg, doj);
        this.noOfEmp = noOfEmp;
        this.amount = amount;
    }

    public double calculateSalary() {
        return amount + (amount * 0.18);
    }
}
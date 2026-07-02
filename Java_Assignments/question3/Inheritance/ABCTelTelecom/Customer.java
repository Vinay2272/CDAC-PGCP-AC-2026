package ABCTelTelecom;

abstract class Customer extends Person {
    protected String creditClass;
    protected double discount;
    protected String plan;

    public Customer(String name, String email, String creditClass,
                    double discount, String plan) {
        super(name, email);
        this.creditClass = creditClass;
        this.discount = discount;
        this.plan = plan;
    }

    public void display() {
        super.display();
        System.out.println(creditClass + " " + discount + " " + plan);
    }
}
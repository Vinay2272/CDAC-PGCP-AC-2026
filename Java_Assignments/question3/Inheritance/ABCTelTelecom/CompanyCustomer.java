package ABCTelTelecom;

class CompanyCustomer extends Customer {
    private String relationshipManager;
    private double creditLine;
    private int extensions;
    private List<String> numbers;

    public CompanyCustomer(String name, String email, String creditClass,
                           double discount, String plan,
                           String rm, double creditLine,
                           int extensions, List<String> numbers) {
        super(name, email, creditClass, discount, plan);
        this.relationshipManager = rm;
        this.creditLine = creditLine;
        this.extensions = extensions;
        this.numbers = numbers;
    }

    public void display() {
        super.display();
        System.out.println("RM: " + relationshipManager);
        System.out.println("Credit Line: " + creditLine);
        System.out.println("Extensions: " + extensions);
        System.out.println("Numbers: " + numbers);
    }
}
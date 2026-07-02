package Inheritance;

class Member extends Person {
    private String membershipType;
    private double amountPaid;

    public Member(String name, String mobile, String email,
                  String membershipType, double amountPaid) {
        super(name, mobile, email);
        this.membershipType = membershipType;
        this.amountPaid = amountPaid;
    }

    public void display() {
        super.display();
        System.out.println(membershipType + " " + amountPaid);
    }
}
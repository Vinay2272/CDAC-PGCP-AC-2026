package ABCTelTelecom;

abstract class Person {
    protected int id;
    protected String name, email;
    static int counter = 1;

    public Person(String name, String email) {
        this.id = counter++;
        this.name = name;
        this.email = email;
    }

    public void display() {
        System.out.println(id + " " + name + " " + email);
    }
}
package Inheritance;

	abstract class Person {
	    protected int id;
	    protected String name, mobile, email;
	    static int counter = 1;

	    public Person(String name, String mobile, String email) {
	        this.id = counter++;
	        this.name = name;
	        this.mobile = mobile;
	        this.email = email;
	    }

	    public int getId() { return id; }
	    public String getName() { return name; }

	    public void display() {
	        System.out.println(id + " " + name + " " + mobile + " " + email);
	    }
	}


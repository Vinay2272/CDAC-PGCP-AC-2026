class Employee {
    constructor(firstName, lastName, email, designation, basicSalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.designation = designation;
        this.basicSalary = basicSalary;
    }

    getFirstName() { return this.firstName; }
    getLastName() { return this.lastName; }
    getEmail() { return this.email; }
    getDesignation() { return this.designation; }
    getBasicSalary() { return this.basicSalary; }

    setFirstName(v) { this.firstName = v; }
    setLastName(v) { this.lastName = v; }
    setEmail(v) { this.email = v; }
    setDesignation(v) { this.designation = v; }
    setBasicSalary(v) { this.basicSalary = v; }

    display() {
        console.log(this.firstName, this.lastName, this.email, this.designation, this.basicSalary);
    }
}

module.exports = Employee;
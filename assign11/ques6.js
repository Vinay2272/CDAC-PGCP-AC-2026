const fs = require('fs');
const Employee = require('./Employee');

let e = new Employee("A", "B", "a@gmail.com", "Manager", 60000);

let data = JSON.stringify(e) + "\n";

fs.appendFile('Employee.txt', data, (err) => {
    if (!err) console.log("Appended");
});
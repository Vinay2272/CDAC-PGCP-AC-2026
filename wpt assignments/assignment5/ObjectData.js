let Student = {
    prn: 1,
    fName: 'A',
    lName: 'B',

    display() {
        console.log("display")
    }
}
//Object   Key:value  map 
console.log(Student);
console.log(Student.fName);
console.log(Student["fName"]);
console.log(Student.display());

Student.fName = "NEW NAME";

console.log(Student.fName);

for (const key in Student) {
    //console.log(key + "  " + Student[key])
}


let s = new Object();
s.prn = 458;
s.fName = "Amit";

//console.log(s);

s.email = 'asa'

//console.log(s);

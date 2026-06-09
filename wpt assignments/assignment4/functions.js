function sayHello(name = 'Guest') {
    console.log("Hello " + name);
}
sayHello();
sayHello("Amit");

function square(n) {
   
    return (n * n);
}
let ans = square(3);  
console.log(ans);
console.log(square(4));

let a = square;  
 
console.log(a);
console.log(a(5));

let b = function () {
    console.log("in function");
}
    console.log(b());

let c = (n) => (n * n);
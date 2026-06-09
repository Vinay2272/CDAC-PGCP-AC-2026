let data = [12, 23, 34, 45, 56, 56, 67];
console.log(data);
for (var i = 0; i < data.length; i++) {
    if (data[i] % 2 == 0)
        console.log(data[i]);
}
console.log("normal for  ")
// var decl  ;  condition ;  inc dec
for (var i = 0; i < data.length; i++) {
    console.log(data[i]);
}
//
console.log("for of ")
for (const element of data) {
    console.log(element);
}
//
console.log("for each ")
data.forEach(element => {
    if (element % 2 == 0) {
        console.log(element)
    }
}
);







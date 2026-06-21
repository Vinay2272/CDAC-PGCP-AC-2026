const fs = require('fs');

let data1 = fs.readFileSync('sample.txt', 'utf-8');
console.log(data1);

fs.readFile('sample.txt', 'utf-8', (err, data2) => {
    if (!err) console.log(data2);
});
let args = process.argv.slice(2);

let sum = 0;

args.forEach(num => {
    let n = Number(num);
    if (n % 2 === 0) {
        sum += n;
    }
});

console.log(sum);
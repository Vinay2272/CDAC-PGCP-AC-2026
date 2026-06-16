function add(a, b) {
    return a + b;
}

function sub(a, b) {
    return a - b;
}

function mul(a, b) {
    return a * b;
}

function div(a, b) {
    return a / b;
}

function result(a1, a2, callback) {
    console.log(callback(a1, a2));
}

result(10, 5, add);
result(10, 5, sub);
result(10, 5, mul);
result(10, 5, div);
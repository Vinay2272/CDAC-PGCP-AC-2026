function mul(a, b, cb) {
    if (b === 0) {
        cb("Error: second parameter is zero", null);
    } else {
        cb(null, a * b);
    }
}

function div(a, b, cb) {
    if (b === 0) {
        cb("Error: second parameter is zero", null);
    } else {
        cb(null, a / b);
    }
}

function result(err, res) {
    if (err) {
        console.log(err);
    } else {
        console.log(res);
    }
}

mul(10, 0, result);
div(10, 2, result);
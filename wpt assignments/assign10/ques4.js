function divide(a, b) {
    return new Promise(function(resolve, reject) {
        if (b === 0) {
            reject("Error: division by zero");
        } else {
            resolve(a / b);
        }
    });
}

divide(10, 2)
    .then(function(res) {
        console.log(res);
    })
    .catch(function(err) {
        console.log(err);
    });
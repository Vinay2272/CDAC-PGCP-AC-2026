function step1(data, callback) {
    console.log("Step 1:", data);
    callback(data + 1);
}

function step2(data, callback) {
    console.log("Step 2:", data);
    callback(data + 1);
}

function step3(data) {
    console.log("Step 3:", data);
}

step1(1, function(res1) {
    step2(res1, function(res2) {
        step3(res2);
    });
});
function calculate(str) {
    let sum = 0;

    for (let ch of str) {
        if (!isNaN(ch) && ch !== ' ') {
            sum += Number(ch);
        }
    }

    return sum;
}

module.exports = calculate;
const express = require('express');

const app = express();

app.set('view engine', 'ejs');

app.get('/', (req, res) => {
    res.render('index', { result: null });
});

app.get('/check', (req, res) => {
    let n = parseInt(req.query.num);
    let sum = 0;

    for (let i = 1; i < n; i++) {
        if (n % i === 0) sum += i;
    }

    let result = (sum === n) ? "Perfect Number" : "Not Perfect";
    res.render('index', { result: result });
});

app.listen(3000);
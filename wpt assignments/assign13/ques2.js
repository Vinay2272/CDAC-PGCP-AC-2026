const express = require('express');
const fs = require('fs');

const app = express();
app.use(express.json());

let products = JSON.parse(fs.readFileSync('product.json'));

app.get('/', (req, res) => {
    res.json(products);
});

app.get('/:id', (req, res) => {
    let id = parseInt(req.params.id);
    let prod = products.find(p => p.prodid === id);
    res.json(prod || {});
});

app.post('/add', (req, res) => {
    let id = parseInt(req.query.prodid);
    let name = req.query.ProductName;
    let price = parseInt(req.query.price);

    let obj = { prodid: id, ProductName: name, price: price };
    products.push(obj);

    res.json(products);
});

app.post('/insert', (req, res) => {
    let obj = req.body;
    products.push(obj);
    res.json(products);
});

app.delete('/:id', (req, res) => {
    let id = parseInt(req.params.id);
    products = products.filter(p => p.prodid !== id);
    res.json(products);
});

app.listen(3000, () => console.log("Server running on 3000"));
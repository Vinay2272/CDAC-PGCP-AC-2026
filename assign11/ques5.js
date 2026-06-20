const fs = require('fs');

fs.writeFileSync('product.txt', 'Product Data Sync');

fs.writeFile('product.txt', 'Product Data Async', (err) => {
    if (!err) console.log("Written");
});
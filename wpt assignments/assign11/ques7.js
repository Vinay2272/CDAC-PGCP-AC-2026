const fs = require('fs');

fs.mkdir('testDir', (err) => {
    if (!err) console.log("Directory created");
});

fs.readdir('.', (err, files) => {
    if (!err) console.log(files);
});

fs.rmdir('testDir', (err) => {
    if (!err) console.log("Directory removed");
});
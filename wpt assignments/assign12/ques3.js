const http = require('http');

const server = http.createServer((req, res) => {

    if (req.method === 'GET' && req.url === '/') {
        res.write("Welcome API");
        res.end();
    }

    else if (req.method === 'GET' && req.url === '/index') {
        res.write("<h1>Index Page</h1>");
        res.end();
    }

    else if (req.method === 'GET' && req.url === '/home') {
        res.write("<h1>Home Page</h1>");
        res.end();
    }

    else if (req.method === 'POST' && req.url === '/aboutus') {
        res.write("About Us Page");
        res.end();
    }

    else {
        res.write("404 Not Found");
        res.end();
    }

});

server.listen(5050, () => {
    console.log("Server running on port 5050");
});
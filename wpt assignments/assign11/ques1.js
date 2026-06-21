function getData() {
    return new Promise((resolve) => {
        setTimeout(() => {
            resolve("Data received");
        }, 2000);
    });
}

async function show() {
    let res = await getData();
    console.log(res);
}

show();
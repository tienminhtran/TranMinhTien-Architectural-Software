const express = require('express');
const app = express();
const port = 3000;

app.get('/', (req, res) => { 
    res.send('<h1>Tien Minh Tran</h1>');
});

app.listen(port, () => {
    console.log(`App listening on port ${port}`);
});

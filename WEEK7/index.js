const express = require('express');
const mongoose = require('mongoose');

const app = express();
const port = 3000;

mongoose.connect(process.env.MONGO_URL, {
  useNewUrlParser: true,
  useUnifiedTopology: true
}).then(() => {
  console.log(" Connected to MongoDB");
}).catch(err => {
  console.error(" MongoDB connection error:", err);
});

app.get('/', (req, res) => {
  res.send('Hello, Docker + MongoDB!');
});

app.listen(port, () => {
  console.log(` App listening on port ${port}`);
});

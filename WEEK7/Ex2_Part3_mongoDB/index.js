const express = require("express");
const mongoose = require("mongoose");

const app = express();
const PORT = 3000;

mongoose
    .connect("mongodb://mongo:27017/mydb", {
        useNewUrlParser: true,
        useUnifiedTopology: true,
    })
    .then(() => {
        console.log("✅ Kết nối MongoDB thành công!");
    })
    .catch((err) => {
        console.error("❌ Lỗi kết nối MongoDB:", err);
    });

app.get("/", (req, res) => {
    res.send("✅ Hello from Node.js + MongoDB via Docker Compose!");
});

app.listen(PORT, () => {
    console.log(`🚀 Server đang chạy tại http://localhost:${PORT}`);
});

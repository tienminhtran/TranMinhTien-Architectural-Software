const mysql = require("mysql2");

const connection = mysql.createConnection({
    host: "mysql", // tên service trong docker-compose
    user: "root",
    password: "rootpass",
    database: "testdb",
});

connection.connect((err) => {
    if (err) {
        console.error("❌ Kết nối thất bại:", err);
        return;
    }
    console.log("✅ Kết nối MySQL thành công!");

    connection.query("SELECT NOW() AS now", (err, results) => {
        if (err) throw err;
        console.log("🕒 Giờ hệ thống:", results[0].now);
        connection.end();
    });
});

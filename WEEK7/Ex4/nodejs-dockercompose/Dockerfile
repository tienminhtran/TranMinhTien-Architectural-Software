FROM node:18

# Đặt thư mục làm việc là /app
WORKDIR /app

# Copy file package.json và package-lock.json vào container
COPY package*.json ./

# Cài đặt các dependencies
RUN npm install

# Copy toàn bộ code vào container
COPY . .

# Expose cổng 3000 để container có thể nhận request
EXPOSE 3000

# Lệnh chạy ứng dụng
CMD ["node", "index.js"]

Nguyễn Đình Tuấn Anh - BCS230010
Em đã làm xong chương 1 với số điểm là 6680

# Student Score Analyzer – Unit Test with JUnit

## 📌 Mô tả
Chương trình Java dùng để:
- Đếm số học sinh đạt loại **Giỏi** (điểm ≥ 8.0)
- Tính **điểm trung bình** của các điểm hợp lệ (từ 0 đến 10)

👉 Các điểm **không hợp lệ** (nhỏ hơn 0 hoặc lớn hơn 10) sẽ bị **bỏ qua**.

---

## 🎯 Mục tiêu học tập
- Viết kiểm thử đơn vị bằng **JUnit 5**
- Thực hành chạy kiểm thử trên **GitHub Codespaces**
- Áp dụng kiểm thử tự động cho các hàm xử lý dữ liệu

---

## 🛠 Công nghệ sử dụng
- Java (JDK 17 – có sẵn trên GitHub Codespaces)
- JUnit 5 (JUnit Platform Console Standalone)

---

## 📁 Cấu trúc thư mục
unit-test/
├── src/
│ └── StudentAnalyzer.java
├── test/
│ └── StudentAnalyzerTest.java
├── out/
│ └── (các file .class sau khi compile)
└── junit-platform-console-standalone-1.10.0.jar

---

## ▶️ Cách chạy kiểm thử trên GitHub Codespaces

### Bước 1: Vào thư mục dự án
```bash
cd unit-test
### Bước 2: Biên dịch mã nguồn và mã kiểm thử
javac -d out -cp junit-platform-console-standalone-1.10.0.jar \
src/StudentAnalyzer.java \
test/StudentAnalyzerTest.java
### Bước 3: Chạy kiểm thử đơn vị
java -jar junit-platform-console-standalone-1.10.0.jar \
--class-path out \
--scan-class-path



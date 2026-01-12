📘 Weekly Report – Software Testing (JUnit)

👤 Thông tin sinh viên

Họ và tên: Nguyễn Đình Tuấn Anh

MSSV: BCS230010

📅 Tuần 1

📌 Nội dung thực hiện

Hoàn thành Chương 1

Số điểm đạt được: 6680

📅 Tuần 2

🎓 Student Score Analyzer – Unit Test with JUnit

📌 Mô tả

Ứng dụng Java dùng để xử lý danh sách điểm học sinh với các chức năng:

Đếm số học sinh đạt loại Giỏi (điểm ≥ 8.0)

Tính điểm trung bình của các điểm hợp lệ (từ 0 đến 10)

👉 Các điểm không hợp lệ (nhỏ hơn 0 hoặc lớn hơn 10) sẽ không được tính.

🎯 Mục tiêu học tập

Viết kiểm thử đơn vị (Unit Test) bằng JUnit 5

Thực hành chạy kiểm thử trên GitHub Codespaces

Áp dụng kiểm thử tự động cho các hàm xử lý dữ liệu

🛠 Công nghệ sử dụng

Java JDK 17

JUnit 5 (JUnit Platform Console Standalone)

GitHub Codespaces

📁 Cấu trúc thư mục

unit-test/

├── src/

│   └── StudentAnalyzer.java

├── test/

│   └── StudentAnalyzerTest.java

├── out/

│   └── (các file .class sau khi compile)

└── junit-platform-console-standalone-1.10.0.jar

▶️ Cách chạy kiểm thử trên GitHub Codespaces

🔹 Bước 1: Di chuyển vào thư mục dự án

cd unit-test

🔹 Bước 2: Biên dịch mã nguồn và mã kiểm thử

javac -d out -cp junit-platform-console-standalone-1.10.0.jar \

src/StudentAnalyzer.java \

test/StudentAnalyzerTest.java

🔹 Bước 3: Chạy kiểm thử đơn vị

java -jar junit-platform-console-standalone-1.10.0.jar \

--class-path out \

--scan-class-path

✅ Kết quả mong đợi

Tất cả các test case chạy PASS

Chương trình xử lý đúng:

Danh sách rỗng

Điểm không hợp lệ

Trường hợp biên (0, 8.0, 10)

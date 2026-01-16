# Weekly Report – Software Testing

## Thông tin sinh viên
- **Họ và tên:** Nguyễn Đình Tuấn Anh
- **MSSV:** BCS230010

---

## Tuần 1
### Nội dung thực hiện
- [x] Hoàn thành Chương 1
- **Số điểm đạt được:** 6680

---

## Tuần 2
### Student Score Analyzer – Unit Test with JUnit

### Mô tả
Ứng dụng Java dùng để xử lý danh sách điểm học sinh với các chức năng:
1. **Đếm số học sinh đạt loại Giỏi** (điểm ≥ 8.0).
2. **Tính điểm trung bình** của các điểm hợp lệ (từ 0 đến 10).

> **Lưu ý:** Các điểm không hợp lệ (nhỏ hơn 0 hoặc lớn hơn 10) sẽ không được tính.

### Mục tiêu học tập
- Viết kiểm thử đơn vị (**Unit Test**) bằng **JUnit 5**.
- Thực hành chạy kiểm thử trên **GitHub Codespaces**.
- Áp dụng kiểm thử tự động cho các hàm xử lý dữ liệu.

### Công nghệ sử dụng
- **Java JDK 17**
- **JUnit 5** (JUnit Platform Console Standalone)
- **GitHub Codespaces**

### Cấu trúc thư mục
```plaintext
unit-test/
├── src/
│   └── StudentAnalyzer.java
├── test/
│   └── StudentAnalyzerTest.java
├── out/
│   └── (các file .class sau khi compile)
└── junit-platform-console-standalone-1.10.0.jar
```

### Cách chạy kiểm thử trên GitHub Codespaces

#### Bước 1: Di chuyển vào thư mục dự án
```sh
cd unit-test
```

#### Bước 2: Biên dịch mã nguồn và mã kiểm thử
```sh
javac -d out -cp junit-platform-console-standalone-1.10.0.jar \
src/StudentAnalyzer.java \
test/StudentAnalyzerTest.java
```

#### Bước 3: Chạy kiểm thử đơn vị
```sh
java -jar junit-platform-console-standalone-1.10.0.jar \
--class-path out \
--scan-class-path
```

## Tuần 3
### End-to-End Testing with Cypress

### Mô tả
Thực hành kiểm thử tự động End-to-End cho trang web [SauceDemo](https://www.saucedemo.com) bằng Cypress.

### Các kịch bản kiểm thử
1. **Đăng nhập:**
   - Đăng nhập thành công với tài khoản hợp lệ.
   - Đăng nhập thất bại với thông tin sai.
2. **Giỏ hàng:**
   - Thêm sản phẩm vào giỏ hàng.
   - Xóa sản phẩm khỏi giỏ hàng.
3. **Tìm kiếm/Sắp xếp:**
   - Sắp xếp sản phẩm theo giá (Thấp -> Cao).
4. **Thanh toán:**
   - Quy trình đặt hàng đầy đủ (Đăng nhập -> Thêm giỏ -> Checkout -> Nhập thông tin -> Xác nhận).

### Công nghệ sử dụng
- **Node.js**
- **Cypress**

### Cấu trúc thư mục
```plaintext
cypress-exercise/
├── cypress/
│   └── e2e/
│       ├── login_spec.cy.js  # Kịch bản đăng nhập
│       └── cart_spec.cy.js   # Kịch bản giỏ hàng & thanh toán
├── cypress.config.js
└── package.json
```

### Cách chạy kiểm thử

#### Bước 1: Cài đặt dependencies
```sh
cd cypress-exercise
npm install
```

#### Bước 2: Chạy kiểm thử (Giao diện)
```sh
npx cypress open
```
*(Chọn E2E Testing -> Start E2E Testing in Chrome)*

#### Bước 3: Chạy kiểm thử (Headless Mode - Chạy ngầm)
```sh
npx cypress run
```

---

## Tuần 4
### Performance Testing with JMeter

### Mô tả
Thực hành kiểm thử hiệu năng cho trang web **Wikipedia** sử dụng **Apache JMeter**.

### Các kịch bản kiểm thử (Thread Groups)
1. **Thread Group 1 (Basic Load)**
   - **Mục tiêu**: Kiểm tra phản hồi cơ bản của trang chủ.
   - **Cấu hình**: 10 users, 5 loops.
   - **Hành động**: GET Trang chủ (`/`).

2. **Thread Group 2 (Heavy Load)**
   - **Mục tiêu**: Mô phỏng tải cao hơn với hành vi truy cập ngẫu nhiên.
   - **Cấu hình**: 50 users, ramp-up 30s, loop 10.
   - **Hành động**: GET Trang chủ + GET Trang ngẫu nhiên (`/wiki/Special:Random`).

3. **Thread Group 3 (Custom Load - Search)**
   - **Mục tiêu**: Test hành vi tìm kiếm trong thời gian dài (Stress Test nhẹ).
   - **Cấu hình**: 20 users, chạy trong 60s.
   - **Hành động**: Tìm kiếm từ khóa "JMeter".

### Kết quả Kiểm thử (Analysis)
*Đã thực hiện chạy kiểm thử ngày 16/01/2025. Kết quả ghi nhận:*

**1. View Results Tree (Chi tiết request)**
![View Results Tree](jmeter/view_results_tree.png)

**2. Summary Report (Báo cáo tổng hợp)**
![Summary Report](jmeter/summary_report.png)

| Label | # Samples | Average (ms) | Min (ms) | Max (ms) | Error % | Throughput |
|-------|-----------|--------------|----------|----------|---------|------------|
| GET Home | 550 | 5157 | 677 | 18526 | 0.00% | 3.6/sec |
| GET Search.. | 218 | 5552 | 1756 | 14741 | 0.00% | 3.2/sec |
| GET Random.. | 500 | 5449 | 564 | 20565 | 3.80% | 3.3/sec |
| **TOTAL** | **1268** | **5340** | **564** | **20565** | **1.50%** | **8.2/sec** |

### Nhận xét
- **Tỷ lệ lỗi**: 1.50% -> Đã xuất hiện một số lỗi khi tải tăng cao (chủ yếu ở request lấy trang ngẫu nhiên do timeout hoặc rate limit).
- **Thời gian phản hồi**: Trung bình ~5.3s. Thời gian phản hồi khá cao khi chịu tải, đặc biệt là các request tìm kiếm và random page.
- **Lưu ý**: Đã thêm `User-Agent` Header để giả lập trình duyệt, giúp giảm thiểu việc bị chặn (Lỗi 403) so với ban đầu.

### Cấu trúc thư mục
```plaintext
jmeter/
└── wikipedia_performance_test.jmx  # File kịch bản kiểm thử (Đã cấu hình User-Agent)
```

### Cách chạy lại kiểm thử
1. Cài đặt [Apache JMeter](https://jmeter.apache.org/download_jmeter.cgi).
2. Mở file `jmeter/wikipedia_performance_test.jmx` bằng JMeter GUI.
3. Bấm **Start** và xem kết quả tại **Summary Report**.


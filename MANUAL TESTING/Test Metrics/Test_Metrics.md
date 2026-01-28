# CHỈ SỐ KIỂM THỬ (TEST METRICS)

Các chỉ số đo lường chất lượng phần mềm và hiệu quả kiểm thử.

---

## 1. Tỷ lệ thực thi Test (Test Execution Rate)
Đo lường tiến độ kiểm thử so với kế hoạch.

-   Tổng số TC: 45
-   Đã thực thi: 45
-   **Tỷ lệ:** `100%`

=> **Đánh giá:** Đã hoàn thành toàn bộ kịch bản test theo kế hoạch.

## 2. Mật độ lỗi theo Module (Defect Density per Module)
Đo lường vùng chức năng nào đang kém ổn định nhất.

| Module | Số lượng Bug | Tổng số TC | Mật độ (Bug/TC) |
| :--- | :--- | :--- | :--- |
| **Authentication** | 3 | 15 | 20% |
| **Product & Cart** | 5 | 20 | 25% |
| **Checkout** | 2 | 10 | 20% |

=> **Đánh giá:** Module **Sản phẩm & Giỏ hàng (Product & Cart)** đang có mật độ lỗi cao nhất (25%), cần tập trung review logic tính toán và hiển thị tại đây.

## 3. Phân bố mức độ nghiêm trọng (Severity Distribution)
Đo lường mức độ ảnh hưởng của các lỗi tìm được.

| Severity | Số lượng | Tỷ lệ % |
| :--- | :--- | :--- |
| **Critical** | 2 | 20% |
| **Major** | 4 | 40% |
| **Minor** | 4 | 40% |

=> **Đánh giá:** 60% số lỗi (Critical + Major) đều là lỗi quan trọng cần ưu tiên sửa chữa. Chất lượng code build này đang ở mức thấp.

## 4. Độ bao phủ yêu cầu (Requirement Coverage)
Đo lường mức độ test case bao phủ danh sách yêu cầu (Requirement).

-   Tổng số Requirement: 16
-   Requirement đã được map Test Case: 16
-   **Tỷ lệ bao phủ:** `100%`

=> **Đánh giá:** Đạt chỉ tiêu về độ bao phủ (Target > 90%). Không có yêu cầu nào bị bỏ sót.

# KẾ HOẠCH KIỂM THỬ (TEST PLAN)
**Dự án:** Website bán hàng online (E-commerce)  
**Phiên bản:** 1.0  
**Ngày:** 28/01/2026  
**Người lập cực:** QA Team  

---

## 1. Giới thiệu (Introduction)
Tài liệu này mô tả kế hoạch kiểm thử cho hệ thống Website bán hàng online (E-commerce). Mục tiêu là đảm bảo chất lượng phần mềm, xác minh các chức năng hoạt động đúng theo yêu cầu và phát hiện các lỗi tiềm ẩn trước khi phát hành.

## 2. Phạm vi kiểm thử (Scope)

### 2.1 Trong phạm vi (In-scope)
Kiểm thử chức năng (Functional Testing) và kiểm thử giao diện (UI Testing) cho các module sau:
1.  **Module 1 – Xác thực (Authentication):** Đăng ký, Đăng nhập, Quên mật khẩu, Đăng xuất.
2.  **Module 2 – Sản phẩm & Giỏ hàng (Product & Cart):** Tìm kiếm, Lọc, Xem chi tiết, Thêm vào giỏ, Cập nhật/Xóa giỏ hàng.
3.  **Module 3 – Thanh toán (Checkout):** Nhập địa chỉ, Chọn thanh toán, Đặt hàng, Lịch sử đơn hàng.

### 2.2 Ngoài phạm vi (Out-of-scope)
-   Kiểm thử hiệu năng (Performance Testing).
-   Kiểm thử tự động (Automation Testing).
-   Kiểm thử bảo mật chuyên sâu (Security Penetration Testing).
-   Kiểm thử tích hợp hệ thống thanh toán thực tế (Chỉ giả lập VISA/COD).

## 3. Phương pháp kiểm thử (Test Approach)
-   **Kiểm thử chức năng (Functional Testing):** Tập trung vào việc xác minh từng tính năng hoạt động đúng logic nghiệp vụ.
    -   *Kỹ thuật:* Phân vùng tương đương, Phân tích giá trị biên, Bảng quyết định.
-   **Kiểm thử giao diện (UI Testing):** Đảm bảo giao diện hiển thị đúng, bố cục rõ ràng, không bị vỡ trên trình duyệt Chrome.
-   **Kiểm thử hồi quy (Regression Testing):** Thực hiện khi có bản vá lỗi để đảm bảo các chức năng cũ không bị ảnh hưởng.

## 4. Môi trường kiểm thử (Test Environment)
-   **Hệ điều hành:** Windows 10/11.
-   **Trình duyệt:** Google Chrome (phiên bản mới nhất).
-   **Công cụ:** Excel/Google Sheets (quản lý TC), Bug Tracking Tool (giả lập file).
-   **Dữ liệu test:** 
    -   Tài khoản: User thường, User mới.
    -   Sản phẩm: Danh sách sản phẩm mẫu có sẵn trong DB.

## 5. Điều kiện Kiểm thử (Test Criteria)

### 5.1 Điều kiện bắt đầu (Entry Criteria)
-   Môi trường test đã sẵn sàng.
-   Tài liệu yêu cầu (Requirement) đã được duyệt.
-   Bộ Test Case đã được review và phê duyệt.
-   Bản build ứng dụng đã được deploy lên môi trường test.

### 5.2 Điều kiện kết thúc (Exit Criteria)
-   100% Test Case mức độ Critical/High đã được thực thi.
-   90% tổng số Test Case đã được thực thi.
-   Không còn lỗi nghiêm trọng (Severity: Critical/Major) đang mở.
-   Tỷ lệ Pass đạt >= 90%.

## 6. Rủi ro & Biện pháp giảm thiểu (Risks & Mitigation)

| Rủi ro | Mức độ | Biện pháp giảm thiểu |
| :--- | :--- | :--- |
| Thiếu hụt thời gian kiểm thử do dev giao build chậm | Cao | Ưu tiên test các luồng chính (Happy Path) và chức năng quan trọng trước. |
| Yêu cầu thay đổi phút chót | Trung bình | Cập nhật nhanh RTM và Test Case, thông báo cho PM về ảnh hưởng tiến độ. |
| Môi trường test không ổn định | Trung bình | Chuẩn bị môi trường backup hoặc test cục bộ (local). |
| Dữ liệu test không đủ bao quát | Thấp | Tạo bộ dữ liệu giả lập phong phú (Data generation). |

## 7. Vai trò & Trách nhiệm (Roles & Responsibilities)
-   **QA Manager:** Lập kế hoạch, theo dõi tiến độ, báo cáo kết quả cuối cùng.
-   **QA Tester:** Viết Test Case, Chuẩn bị dữ liệu, Thực thi test (Execute), Log bug, Kiểm tra lại bug (Retest).
-   **Developer:** Fix bug, hỗ trợ QA về môi trường.

## 8. Lịch trình kiểm thử (Test Schedule)

| Hoạt động | Ngày bắt đầu | Ngày kết thúc | Người phụ trách |
| :--- | :--- | :--- | :--- |
| Lập Test Plan | 28/01/2026 | 28/01/2026 | QA Manager |
| Viết Test Case | 29/01/2026 | 30/01/2026 | QA Team |
| Review Test Case | 30/01/2026 | 30/01/2026 | QA Manager + Dev |
| Thực thi Test (Vòng 1) | 31/01/2026 | 02/02/2026 | QA Team |
| Fix Bug | 03/02/2026 | 05/02/2026 | Dev Team |
| Thực thi Test (Vòng 2 - Regression) | 06/02/2026 | 07/02/2026 | QA Team |
| Báo cáo tổng hợp | 08/02/2026 | 08/02/2026 | QA Manager |

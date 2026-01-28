# BÁO CÁO KẾT QUẢ KIỂM THỬ (TEST REPORT)

**Dự án:** Website bán hàng online  
**Ngày báo cáo:** 28/01/2026  
**Người báo cáo:** QA Team  

---

## 1. Tóm tắt thực thi (Execution Summary)

| Hạng mục | Số lượng | Tỷ lệ (%) |
| :--- | :--- | :--- |
| Tổng số Test Case (Planned) | 45 | 100% |
| Số Test Case đã chạy (Executed) | 45 | 100% |
| **Pass** | **35** | **77.8%** |
| **Fail** | **10** | **22.2%** |
| **Blocked** | **0** | **0%** |

## 2. Thống kê lỗi (Defect Statistics)

| Mức độ nghiêm trọng | Số lượng | Ghi chú |
| :--- | :--- | :--- |
| **Critical** | **2** | Lỗi nghiêm trọng ảnh hưởng luồng chính |
| **Major** | **4** | Lỗi chức năng quan trọng |
| **Minor** | **4** | Lỗi giao diện / nhỏ |
| **Tổng cộng** | **10** | |

## 3. Top 5 lỗi nghiêm trọng nhất (Top Critical/Major Issues)
1.  **[BUG_CART_001]** (Critical) Tổng tiền giỏ hàng tính sai khi cập nhật số lượng -> Ảnh hưởng trực tiếp doanh thu.
2.  **[BUG_AUTH_002]** (Critical) Đăng nhập thành công dù sai password -> Lỗ hổng bảo mật nghiêm trọng.
3.  **[BUG_CHECKOUT_003]** (Major) Không đặt hàng được qua COD -> Chặn luồng thanh toán chính.
4.  **[BUG_PROD_004]** (Major) Bộ lọc giá hoạt động sai logic (Min > Max vẫn hiện SP) -> Trải nghiệm người dùng tệ.
5.  **[BUG_Auth_005]** (Major) Không nhận được email quên mật khẩu -> Người dùng mất tài khoản vĩnh viễn.

## 4. Nhận xét chất lượng hệ thống (Quality Assessment)
-   **Chức năng:** Các luồng chính (Happy Path) vẫn còn lỗi nghiêm trọng (Thanh toán, Tính tiền, Login). Hệ thống chưa ổn định.
-   **Giao diện:** Tương đối ổn, còn một số lỗi hiển thị trên màn hình nhỏ.
-   **Bảo mật:** Phát hiện lỗi sơ đẳng về xác thực (Login sai pass). Cần fix gấp.

## 5. Kết luận & Quyết định (Conclusion & Decision)
Dựa trên tiêu chí Exit Criteria (Không còn lỗi Critical/Major), đội QA đưa ra quyết định:

# ⛔ NO-RELEASE

**Lý do:** Tồn tại `2 Critical Bugs` và `4 Major Bugs` chưa được khắc phục. Hệ thống không đủ điều kiện để release ra production. Yêu cầu Dev team fix toàn bộ lỗi Critical và Major, sau đó QA sẽ thực hiện Regression Test.

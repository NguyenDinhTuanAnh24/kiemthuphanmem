# BÁO CÁO LỖI (BUG REPORTS)

Danh sách các lỗi giả lập phát hiện trong quá trình kiểm thử.

| Bug ID | Tóm tắt (Summary) | Các bước tái hiện (Steps to Reproduce) | Kết quả mong đợi (Expected) | Kết quả thực tế (Actual) | Mức độ (Severity) | Độ ưu tiên (Priority) | Môi trường (Env) |
| :--- | :--- | :--- | :--- | :--- | :--- | :--- | :--- |
| **BUG_CART_001** | Tổng tiền giỏ hàng tính sai khi cập nhật số lượng | 1. Add SP A (100k) vào giỏ<br>2. Update SL thành 2 | Tổng tiền = 200.000đ | Tổng tiền vẫn hiển thị 100.000đ | **Critical** | High | Chrome/Win |
| **BUG_AUTH_002** | Đăng nhập thành công dù nhập sai password | 1. Nhập Email đúng<br>2. Nhập Pass sai<br>3. Click Login | Báo lỗi đăng nhập thất bại | Đăng nhập thành công vào trang chủ | **Critical** | High | Chrome/Win |
| **BUG_CHECKOUT_003** | Không đặt được hàng khi chọn COD | 1. Điền đủ info<br>2. Chọn COD<br>3. Click Đặt hàng | Đặt hàng thành công | Nút Đặt hàng không phản hồi (Click không tác dụng) | **Major** | High | Chrome/Win |
| **BUG_PROD_004** | Bộ lọc giá hoạt động sai ngược (Min > Max) | 1. Chọn Min 500k, Max 100k<br>2. Lọc | Báo lỗi khoảng giá | Vẫn hiển thị sản phẩm giá 200k (Logic sai) | **Major** | Medium | Chrome/Win |
| **BUG_AUTH_005** | Email quên mật khẩu không gửi về hộp thư | 1. Nhập Email quên pass<br>2. Click Gửi | Nhận được email reset | Hệ thống báo thành công nhưng không có email gửi về | **Major** | Medium | Chrome/Win |
| **BUG_CART_006** | Nút xóa sản phẩm bị che khuất trên màn hình nhỏ | 1. Resize cửa sổ browser nhỏ<br>2. Vào giỏ hàng | Nút xóa hiển thị rõ | Nút xóa bị che mất 1 nửa, khó click | **Major** | Medium | Chrome/Win |
| **BUG_UI_007** | Sai chính tả tại trang Giới thiệu | 1. Vào trang About Us<br>2. Đọc đoạn 1 | Hiển thị đúng "Vietnam" | Hiển thị sai thành "Vienam" | **Minor** | Low | Chrome/Win |
| **BUG_PROD_008** | Ảnh sản phẩm load chậm hoặc lỗi broken image | 1. Vào chi tiết SP B<br>2. Quan sát ảnh | Ảnh hiển thị đẹp | Ảnh hiện icon broken (x) | **Minor** | Low | Chrome/Win |
| **BUG_CHECKOUT_009** | Màu nút "Hủy" không đúng thiết kế | 1. Vào Checkout<br>2. Xem nút Hủy | Màu Xám (Grey) | Màu Đỏ (Red) gây nhầm lẫn | **Minor** | Low | Chrome/Win |
| **BUG_AUTH_010** | Tab index không theo thứ tự tại form Đăng ký | 1. Vào trang Đăng ký<br>2. Nhấn Tab | Focus từ Email -> Pass | Focus từ Email nhảy xuống nút Submit luôn (bỏ qua Pass) | **Minor** | Low | Chrome/Win |

**Thống kê sơ bộ:**
- Critical: 2
- Major: 4
- Minor: 4
- Tổng: 10 Bug (Đạt yêu cầu)

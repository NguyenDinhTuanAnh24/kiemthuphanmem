# DANH SÁCH CA KIỂM THỬ (TEST CASES)

| TC_ID | Tiêu đề (Title) | Điều kiện trước (Precondition) | Các bước (Steps) | Kết quả mong đợi (Expected Result) | Độ ưu tiên (Priority) | Loại test (Type) |
| :--- | :--- | :--- | :--- | :--- | :--- | :--- |
| **MODULE 1: AUTHENTICATION** | | | | | | |
| TC_AUTH_001 | Đăng ký thành công | Chưa có tài khoản | 1. Vào trang đăng ký<br>2. Nhập Email hợp lệ, Pass hợp lệ<br>3. Click Đăng ký | Đăng ký thành công, chuyển hướng trang Login | High | Positive |
| TC_AUTH_002 | Đăng ký với Email sai định dạng | Chưa có tài khoản | 1. Vào trang đăng ký<br>2. Nhập Email "user..@mail"<br>3. Click Đăng ký | Báo lỗi định dạng Email không hợp lệ | Medium | Negative |
| TC_AUTH_003 | Đăng ký mật khẩu 7 ký tự | Chưa có tài khoản | 1. Nhập Pass 7 ký tự<br>2. Click Đăng ký | Báo lỗi mật khẩu tối thiểu 8 ký tự | High | Boundary |
| TC_AUTH_004 | Đăng ký mật khẩu 8 ký tự | Chưa có tài khoản | 1. Nhập Pass 8 ký tự<br>2. Click Đăng ký | Đăng ký thành công | High | Boundary |
| TC_AUTH_005 | Đăng ký Email đã tồn tại | Email đã tồn tại | 1. Nhập Email đã tồn tại<br>2. Click Đăng ký | Báo lỗi Email đã được sử dụng | High | Negative |
| TC_AUTH_006 | Đăng ký bỏ trống trường bắt buộc | Chưa có tài khoản | 1. Để trống Email/Pass<br>2. Click Đăng ký | Báo lỗi các trường bắt buộc | Medium | Negative |
| TC_AUTH_007 | Đăng ký mật khẩu xác nhận không khớp | Chưa có tài khoản | 1. Nhập Pass và Confirm Pass khác nhau<br>2. Click Đăng ký | Báo lỗi xác nhận mật khẩu không khớp | Medium | Negative |
| TC_AUTH_008 | Đăng nhập thành công | Tài khoản đã Active | 1. Vào Login<br>2. Nhập Email/Pass đúng<br>3. Click Login | Login thành công, vào trang chủ | High | Positive |
| TC_AUTH_009 | Đăng nhập sai mật khẩu | Tài khoản đã Active | 1. Nhập đúng Email, sai Pass<br>2. Click Login | Báo lỗi sai thông tin đăng nhập | High | Negative |
| TC_AUTH_010 | Đăng nhập sai Email | Chưa có tài khoản | 1. Nhập Email chưa đăng ký<br>2. Click Login | Báo lỗi sai thông tin hoặc tài khoản không tồn tại | High | Negative |
| TC_AUTH_011 | Đăng nhập SQL Injection | N/A | 1. Nhập User: `' OR 1=1 --`<br>2. Click Login | Hệ thống từ chối hoặc báo lỗi input, không login được | High | Security |
| TC_AUTH_012 | Đăng nhập bỏ trống | N/A | 1. Để trống Email/Pass<br>2. Click Login | Báo lỗi yêu cầu nhập liệu | Low | Negative |
| TC_AUTH_013 | Quên mật khẩu - Email đã tồn tại | Email đã tồn tại | 1. Vào trang Quên MK<br>2. Nhập Email đúng<br>3. Click Gửi | Thông báo gửi Email reset thành công | Medium | Positive |
| TC_AUTH_014 | Quên mật khẩu - Email không tồn tại | Email chưa có | 1. Nhập Email lạ<br>2. Click Gửi | Báo lỗi Email không tồn tại trong hệ thống | Low | Negative |
| TC_AUTH_015 | Đăng xuất hệ thống | Đã Login | 1. Click Avatar -> Đăng xuất | Đăng xuất thành công, quay về trang Login/Home | Medium | Positive |
| **MODULE 2: PRODUCT & CART** | | | | | | |
| TC_PROD_001 | Tìm kiếm sản phẩm tồn tại | SP "Iphone" có trong DB | 1. Nhập "Iphone" vào ô tìm kiếm<br>2. Enter | Hiển thị list sản phẩm chứa từ khóa "Iphone" | High | Positive |
| TC_PROD_002 | Tìm kiếm sản phẩm không tồn tại | SP "XYZABC" không có | 1. Nhập "XYZABC"<br>2. Enter | Hiển thị thông báo "Không tìm thấy sản phẩm" | Medium | Negative |
| TC_PROD_003 | Tìm kiếm ký tự đặc biệt | N/A | 1. Nhập `!@#$%^&*`<br>2. Enter | Xử lý an toàn, hiển thị không tìm thấy hoặc lọc bỏ ký tự | Low | Security |
| TC_PROD_004 | Tìm kiếm từ khóa quá dài | N/A | 1. Nhập chuỗi 255+ ký tự<br>2. Enter | Giới hạn ký tự nhập hoặc cắt chuỗi, không Crash | Low | Boundary |
| TC_PROD_005 | Lọc theo khoảng giá hợp lệ | Có SP giá 100-500k | 1. Chọn Min 100k, Max 500k<br>2. Click Lọc | Hiển thị SP trong tầm giá 100k-500k | Medium | Positive |
| TC_PROD_006 | Lọc theo giá Min > Max | N/A | 1. Chọn Min 500k, Max 100k<br>2. Click Lọc | Báo lỗi khoảng giá không hợp lệ hoặc tự đảo ngược | Low | Negative |
| TC_PROD_007 | Lọc giá âm | N/A | 1. Nhập giá -50k<br>2. Click Lọc | Không cho nhập số âm hoặc báo lỗi | Low | Boundary |
| TC_PROD_008 | Xem chi tiết sản phẩm | SP có sẵn | 1. Click vào hình ảnh SP | Chuyển trang chi tiết, hiển thị đúng tên, giá, mô tả | High | Positive |
| TC_PROD_009 | Kiểm tra UI trang chi tiết | SP có sẵn | 1. Quan sát bố cục | Ảnh không vỡ, Font chữ lỗi, Nút Mua hiển thị rõ | Medium | Positive |
| TC_PROD_010 | Back từ trang chi tiết | Đang ở trang chi tiết | 1. Click nút Back/Breadcrumb | Quay lại trang danh sách đúng vị trí | Low | Positive |
| TC_CART_001 | Thêm sản phẩm mới vào giỏ | Giỏ hàng rỗng | 1. Tại trang chi tiết, chọn SL 1<br>2. Ấn Thêm vào giỏ | Thông báo thành công, Icon giỏ hàng hiện số 1 | High | Positive |
| TC_CART_002 | Thêm sản phẩm đã có trong giỏ | Giỏ có SP A (SL 1) | 1. Thêm tiếp SP A (SL 2) | Thông báo thành công, Giỏ hàng có SP A với SL 3 | High | Positive |
| TC_CART_003 | Thêm sản phẩm hết hàng | SP hết stock | 1. Click Thêm vào giỏ | Báo lỗi sản phẩm đã hết hàng | High | Negative |
| TC_CART_004 | Thêm số lượng tối đa cho phép | Stock còn 10 | 1. Nhập SL 10<br>2. Thêm vào giỏ | Thành công | Medium | Boundary |
| TC_CART_005 | Thêm số lượng vượt quá Stock | Stock còn 5 | 1. Nhập SL 6<br>2. Thêm vào giỏ | Báo lỗi không đủ hàng | Medium | Negative |
| TC_CART_006 | Cập nhật số lượng trong giỏ | Giỏ có SP A | 1. Sửa ô số lượng thành 5<br>2. Update | Tổng tiền thay đổi tương ứng theo SL 5 | High | Positive |
| TC_CART_007 | Cập nhật số lượng bằng 0 | Giỏ có SP A | 1. Sửa SL thành 0 | Hiển thị popup xác nhận xóa hoặc tự xóa SP | Medium | Boundary |
| TC_CART_008 | Cập nhật số lượng âm | Giỏ có SP A | 1. Sửa SL thành -1 | Báo lỗi hoặc tự reset về 1 | Low | Negative |
| TC_CART_009 | Nhập chữ vào ô số lượng | Giỏ có SP A | 1. Nhập "abc"<br>2. Enter | Không cho nhập hoặc báo lỗi định dạng số | Low | Validation |
| TC_CART_010 | Xóa sản phẩm khỏi giỏ | Giỏ có SP A, B | 1. Click icon Xóa tại dòng SP A | SP A biến mất, cập nhật lại tổng tiền chỉ còn B | High | Positive |
| **MODULE 3: CHECKOUT** | | | | | | |
| TC_CHECKOUT_001 | Thanh toán đầy đủ thông tin | Giỏ có hàng | 1. Nhập Tên, Đ/C, SĐT<br>2. Chọn COD<br>3. Đặt hàng | Đặt hàng thành công, ra mã đơn hàng | High | Positive |
| TC_CHECKOUT_002 | Thanh toán thiếu địa chỉ | Giỏ có hàng | 1. Bỏ trống địa chỉ<br>2. Đặt hàng | Báo lỗi yêu cầu nhập địa chỉ | High | Negative |
| TC_CHECKOUT_003 | Địa chỉ giao hàng quá dài | Giỏ có hàng | 1. Nhập địa chỉ 500 ký tự | Giới hạn ký tự hoặc hiển thị đầy đủ không vỡ layout | Low | Boundary |
| TC_CHECKOUT_004 | Số điện thoại sai định dạng | Giỏ có hàng | 1. Nhập SĐT "090abc"<br>2. Đặt hàng | Báo lỗi SĐT không hợp lệ | Medium | Validation |
| TC_CHECKOUT_005 | Chọn phương thức COD | Giỏ có hàng | 1. Chọn Radio button COD | Option COD được active | Medium | Positive |
| TC_CHECKOUT_006 | Chọn phương thức Visa | Giỏ có hàng | 1. Chọn Radio button Visa | Form nhập thẻ hiển thị (giả lập) | Medium | Positive |
| TC_CHECKOUT_007 | Nhập thẻ Visa giả lập lỗi | Giỏ có hàng | 1. Nhập thẻ test fail<br>2. Đặt hàng | Báo lỗi thanh toán thất bại | High | Negative |
| TC_CHECKOUT_008 | Không chọn phương thức thanh toán | Giỏ có hàng | 1. Bỏ chọn payment (nếu được)<br>2. Đặt hàng | Báo lỗi yêu cầu chọn phương thức thanh toán | Medium | Negative |
| TC_CHECKOUT_009 | Kiểm tra lịch sử đơn hàng | Đã đặt hàng | 1. Vào My Order<br>2. Kiểm tra đơn mới nhất | Hiển thị đúng Mã đơn, ngày đặt, tổng tiền | Medium | Positive |
| TC_CHECKOUT_010 | Đặt hàng khi giỏ rỗng | Giỏ rỗng | 1. Cố truy cập trang Checkout | Chuyển hướng về trang chủ hoặc báo giỏ hàng rỗng | Low | Negative |

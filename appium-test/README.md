# Appium Assignment - Tuần 5

## Thông tin sinh viên
- **Mã số sinh viên (giả định)**: ...24
- **Danh mục ứng dụng**: 24 % 5 = 4 -> **Ứng dụng quản lý học tập/ghi chú**.
- **Ứng dụng đã chọn**: Notion
- **Lý do chọn**: Notion là ứng dụng ghi chú và quản lý học tập phổ biến, hỗ trợ đa nền tảng và có nhiều tính năng phong phú, phù hợp với tiêu chí danh mục 4.

## Danh sách Test Cases

### Test Case 1: Tạo trang ghi chú mới
- **Mô tả**: Kiểm tra chức năng tạo một page mới và nhập tiêu đề, nội dung.
- **Kết quả mong đợi**: Tiêu đề và nội dung được lưu chính xác.

### Test Case 2: Tìm kiếm trang ghi chú
- **Mô tả**: Sử dụng chức năng Search để tìm trang vừa tạo.
- **Kết quả mong đợi**: Kết quả tìm kiếm hiển thị đúng trang "Bài tập Appium Tuần 5".

### Test Case 3: Điều hướng giao diện (Settings)
- **Mô tả**: Mở menu bên và truy cập vào màn hình Cài đặt (Settings).
- **Kết quả mong đợi**: Màn hình Settings được hiển thị.

## Hướng dẫn chạy kịch bản kiểm thử

### 1. Cài đặt môi trường
- Cài đặt **Node.js** và **Appium Server**: `npm install -g appium`
- Cài đặt **Appium Inspector** để lấy ID phần tử.
- Cài đặt **Android Studio** và tạo máy ảo (Emulator) hoặc kết nối thiết bị thật.
- Cài ứng dụng **Notion** lên máy ảo/thiết bị và **Đăng nhập trước**.

### 2. Cấu hình Code
- Mở file `src/test/java/com/appium/assignment/NotionTest.java`.
- Sử dụng Appium Inspector để lấy `resource-id`, `xpath` của các phần tử trên ứng dụng Notion thực tế.
- Cập nhật các giá trị `AppiumBy.id(...)` hoặc `AppiumBy.xpath(...)` trong code tương ứng với ID thực tế.

### 3. Chạy Test
- Khởi động Appium Server:
  ```bash
  appium
  ```
- Chạy test bằng Maven:
  ```bash
  mvn test
  ```

## Kết quả kiểm thử
*(Sinh viên tự điền sau khi chạy thực tế)*
- **Test Case 1**: ...
- **Test Case 2**: ...
- **Test Case 3**: ...

## Khó khăn và khắc phục
- **Vấn đề**: Các ID của phần tử trên Notion có thể thay đổi hoặc là dynamic ID.
- **Giải pháp**: Sử dụng `xpath` tương đối hoặc `accessibility id` nếu có.

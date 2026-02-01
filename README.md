# Vert.x Backend Project

Backend service sử dụng **Vert.x**, build bằng **Gradle 9.3.1** và **Java 21**.  
Project được cấu hình để build **fat JAR** thông qua **ShadowJar**, có thể chạy độc lập bằng `java -jar`.

---

## 1. Yêu cầu môi trường

### ✅ Java
- **Java 21** (bắt buộc)
- **Gradle 9.3.1* (bắt buộc)

## 2. Lệnh build source
- **gradle clean shadowJar**
- **java -jar build/libs/starterVertx-1.0.0-*.jar**

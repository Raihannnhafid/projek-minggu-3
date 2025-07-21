# AuthenticationTest Document

## Test Case : loginTest(String username, String password)
### ✅ Deskripsi
Test ini bertujuan untuk menguji proses login menggunakan kombinasi username dan password yang diambil dari DataProvider eksternal (loginDataProvider) dan mengecek apakah login berhasil menuju halaman inventory.

### 🧪 Penjelasakan kode program
```java
@Test(dataProvider = "loginDataProvider", dataProviderClass = DataTestProvider.class)
```
- Anotasi TestNG
- Menandakan bahwa ini adalah method pengujian.
- Menggunakan @DataProvider bernama loginDataProvider dari class DataTestProvider.
- Test ini akan diulang sesuai banyaknya data di loginDataProvider.

```java
public void loginTest(String username, String password) throws InterruptedException {
```
- Method loginTest menerima parameter username dan password dari DataProvider.
throws InterruptedException karena memakai Thread.sleep() yang bisa melempar exception.

```java
WebDriver driver = new FirefoxDriver();
```
- Membuat instance WebDriver untuk browser Firefox.

```java
driver.get("https://www.saucedemo.com/v1/index.html");
```
- Membuka halaman login aplikasi web.

```java
WebElement inputUsername = driver.findElement(By.id("user-name"));
inputUsername.sendKeys(username);
```
- Cari kolom input dengan ID user-name dan isi dengan parameter username dari DataProvider.

```java
WebElement inputPassword = driver.findElement(By.id("password"));
inputPassword.sendKeys(password);
```
- Cari kolom input password dan isi dengan password.

```java
WebElement buttonLogin = driver.findElement(By.id("login-button"));
buttonLogin.click();
```
- Temukan tombol login dan klik.

```java
String actual = driver.getCurrentUrl();
String expected = "https://www.saucedemo.com/v1/inventory.html";
```
- Ambil URL saat ini dan simpan URL yang diharapkan.

```java
Assert.assertEquals(actual, expected);
```
- Verifikasi apakah URL saat ini sama dengan URL yang seharusnya (berarti login berhasil).

```java
driver.quit();
```
-  Menutup browser setelah test selesai.
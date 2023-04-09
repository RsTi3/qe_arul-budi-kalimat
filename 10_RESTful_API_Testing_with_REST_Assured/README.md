# (10) RESTful API Testing With REST Assured

---

### Poin Pertama

API adalah singkatan dari Application Programming Interface. API merupakan penghubung yang memungkinkan suatu aplikasi untuk berinteraksi dengan aplikasi lainnya yang berbagi data. Tujuan API adalah untuk mempercepat proses development dengan menyediakan function secara terpisah sehingga developer tidak perlu membuat fitur yang serupa.

API Berperan sebagai pembawa pesan yang menerima permintaan pengguna dan memberitahu sistem apa yang harus dilakukan , Lalu memberikan respon yang sesuai untuk permintaan tersebut.

Jika dianalogikan API Workflow ketika sedang berada di warteg / rumah makan.

- Client --> Melakukan Request Makanan
- API Sebagai Waiter --> Menyampaikan pesan ke Chef / dapur dan menyampaikan hasil pesanan ke pelanggan.
- Sistem / Server sebagai chef di dapur --> memproses request tadi dan memberikan ke waiter untuk diantarkan ke pelanggan.
- API --> Berperan sebagai pembawa pesan yang menerima permintaan pengguna dan memberitahu sistem apa yang harus dilakukan lalu memberikan respon yang sesuai untuk permintaan tersebut.

Fundamental Integrasi API adalah komponen perangkat lunak yang secara otomatis memperbarui data antara klien dan server. Biasanya yang terintegrasi itu ada Mobile APP, API Server, Ext Process & API Testing.

Lalu Fundamental dari API juga Salahsatunya Test Process. Ada beberapa tahapan yakni :

1. Rekam definisikan Informasi API
2. Parsing, Filter atau Merekam Data API dan Kemudian Ekstrak
3. API Call Rekonstruksi, dan mengirimkannya dari klien simulasi.
4. Test Validasi

### Poin Kedua

The Practical Test Pyramid : merupakan metafora yang memberi tahu kita untuk mengelompokkan pengujian perangkat lunak ke dalam keranjang dengan perincian yang berbeda.

Dimulai dari :

1. UI : (End To End) Uji interaksi antara keseluruhan melalui antarmuka pengguna.
2. Integration : menguji interaksi antara dua modul atau sub-sistem melalui kontrak api.
3. Component : Menguji modul atau sub sistem tertentu melalui api.
4. Unit : UJI bagian terkecil yang dapat diuji dari aplikasi melalui metode.

BDD With Cucumber :

1. Write Story : Menggunakan Syntaks Gherkins (Given, When, Than).
2. Map Steps to Java : Konfigurasi step skrip dan validasi.
3. Configure Stories : Kombinasi Story dan Steps.
4. Run Stories : Intelej IDEA Maven.
5. View Reports : Membuat Report menggunakan Serenity.


### Poin Ketiga

REST ASSURED and The Feature. Java Library untuk API TESTING.

1. Supports untuk HTTP Methods.
2. Supports Untuk BDD / Gherkin (Given, When, Then).
3. Penggunaan dari  Hamcrest matches untuk pengecekan (EqualTO)
4. User  gpath untuk memilih elemen dari respons json.

Hal yang harus dipersiapkan disini adalah JAVA , Maven, Intellij IDEA.

Menuliskan Test menggunakan Rest Assured :

1. Rest Assured : Teknologi opensource yang sangat banyak digunakan untuk pengujian Test Automation.
2. .given()...  : Test Setup terdiri dari - contentType() -.header()
3. .when()...   : Test Action -.get(url), .post() , .put() , .delete(), etc. -.log().all()
4. .then()...   : Test Verification -.statusCode() -.body("data.nama", equalTo("Kentir"))


---

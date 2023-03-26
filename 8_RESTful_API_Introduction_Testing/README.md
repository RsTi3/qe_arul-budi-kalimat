# (8) RESTful API Introduction & Testing

---

## Materi 1 : RESTful API Introduction

---
### Poin Pertama

API adalah singkatan dari Application Programming Interface. API merupakan penghubung yang memungkinkan suatu aplikasi untuk berinteraksi dengan aplikasi lainnya yang berbagi data. Tujuan API adalah untuk mempercepat proses development dengan menyediakan function secara terpisah sehingga developer tidak perlu membuat fitur yang serupa.

API Berperan sebagai pembawa pesan yang menerima permintaan pengguna dan memberitahu sistem apa yang harus dilakukan , Lalu memberikan respon yang sesuai untuk permintaan tersebut.

Jika dianalogikan API Workflow ketika sedang berada di warteg / rumah makan.

- Client --> Melakukan Request Makanan
- API Sebagai Waiter --> Menyampaikan pesan ke Chef / dapur dan menyampaikan hasil pesanan ke pelanggan.
- Sistem / Server sebagai chef di dapur --> memproses request tadi dan memberikan ke waiter untuk diantarkan ke pelanggan.
- API --> Berperan sebagai pembawa pesan yang menerima permintaan pengguna dan memberitahu sistem apa yang harus dilakukan lalu memberikan respon yang sesuai untuk permintaan tersebut.

### Poin Kedua

Setelah kita mengetahui apa arti API, lalu kita akan mengetahui REST API. REST adalah salahsatu implementasi dari web service sebagai sebuah standar yang digunakan untuk pertukaran data antar aplikasi atau sistem.

> REST (REpresentational State Transfer) merupakan standar arsitektur komunikasi berbasis web yang sering diterapkan dalam pengembangan layanan berbasis web. Contohnya menggunakan HTTP (Hypertext Transfer Protocol) sebagai protocol untuk komunikasi data.

Ada 2 hal yang perlu diperhatikan dalam REST API yakni XML dan JSON. XML Merupakan Extensible Markup Language sedangkan JSON adalah JavaScript Object Nation.

Ada 4 Method untuk HTTP ketika melakukan API TESTING :

Resource : URL

1. GET = Membaca Data
2. PUT = Membuat atau Mengganti Data
3. POST = Membuat Data Baru
4. DELETE = Menghapus Data Yang Ada

### Poin Ketiga

Dalam komponen REST API ada 4 hal yang paling penting yakni :

- Method
- URL
- Header
- Body

Apa itu JSON ? Json merupakan syntax untuk pertukaran data dari berbagai software yang beda, lalu lebih simple dan human-readable. JSON Mengunakan ekstensi **.json** saat ia berdiri sendiri. Saat didefinisikan didalam format file lain (Seperti contohnya **.html**) ia dapat tampil didalam tandca petik sebagi JSON String, atau ia dapat dimasukkan kedalam sebuah variabel. Format ini sangat mudah untuk ditransfer antar web dengan klien atau browser.

Setiap melakukan API Testing atau melakukan HTTP Method pasti akan mendapatkan beberapa response dibawah ini yang dapat diartikan :

- 200 OK : Code terindikasi bahwa request yang diinginkan berhasil.
- 201 Created : Code terindikasi bahwa request yang diinginkan berhasil dan sebuah resource berhasil dibuat. biasanya ditampilkan ketika menggunakan PUT atau POST Request.
- 400 Bad Request : Ini terjadi khususnya ketika request POST dan PUT data nya tidak sesuai atau tidak lolos dalam validasi.
- 401 Unauthorized : Error yang mengindikasikan bahwa kamu perlu melakukan authentikasi sebelum mengakses  halaman ini.
- 405 Method Not Allowed : HTTP Method yang digunakan tidak support untuk resource ini.
- 500 Internal Server Error : Terjadi sebuah error didalam server.

Lalu untuk membahas Tools, sebenarnya banyak namun untuk saat ini kita menggunakan Postman.

---

## Materi 2 : RESTful API Testing

---

### Poin Pertama

API Testing sangatlah berbeda dengan aplikasi yang menggunakan GUI, lalu mengirim request dan langsung mendapatkan response nya, dan Memverifikasi response yang benar error handling.

Dalam API Testing ada 4 hal yang di testing yakni :

- Functionality : Test seperti biasanya apakah suatu fitur sudah berfungsi atau belum.
- Negative : Error handling pada fitur tersebut.
- Load Test : Mengetest kekuatan sistem, mampu mengolah berapa banyak TRX.
- Security : Mengetest keamanan sistem.

API Testing Tools yang dikenal ada 4 yakni : Postman, Jmeter, Fribys.js, RESTassured.

### Poin Kedua

Perbedaan antara API Testing dan Unit Test :

UNIT TEST

- Dilakukan oleh Developer
- Fungsi-fungsi terpisah
- Developer bisa mengakses source code
- Hanya dasart functionality yang di test
- Scope nya terbatas
- Biasanya dilakukan sebelum build.

API TEST

- Dilakukan oleh tim Tester (QE)
- End To End
- Tidak bisa mengakses source code
- Hanya fungsi API saja
- Semua functional Issue
- Scope Lebih luas
- Dilakukan setelah Build

Ketika melakukan API Testing, ada 5 proses yang umum biasa dilakukan :

1. API Specification Review : Me'review Spesifikasi dari API dan USE CASE doc dalam persvektif test.
2. Test Specification Development : Dokumen ini merinci kondisi pengujian dan hasil yang diharapkan untuk setiap kasus pengujian.
3. Test Framework Development : Menggunakan aplikasi standar yang open source seperti Postman.
4. Test Case Development : Melakukan Coding Test Scenario.
5. Test Executions & Reporting :  Mengeksekusi dan melakukan pelaporan.

Dalam TEST Case For API TESTING  ada beberapa hal yang benar dan salah :

1. Mendapatkan  Feedback yang sesuai dengan inputan ? Mengembalikan nilai berdasarkan kondisi input: relatif mudah untuk diuji, karena input dapat ditentukan dan hasilnya dapat diautentikasi.
2. Apakah memberikan Feedback atau Tidak ? Tidak mengembalikan apapun: Bila tidak ada nilai kembalian, perilaku API pada sistem akan diperiksa.
3. APakah Mengganggu fitur yang lain atau tidak ?  Memicu beberapa API/peristiwa/interupsi lainnya: Jika keluaran API memicu beberapa peristiwa atau interupsi, maka peristiwa dan pendengar interupsi tersebut harus dilacak.
4. Update Struktur Data ? Perbarui struktur data: Memperbarui struktur data akan memiliki beberapa hasil atau efek pada sistem, dan itu harus diautentikasi.
5. Memodifikasi Data Yang ada ? Ubah sumber daya tertentu: Jika panggilan API mengubah beberapa sumber daya, maka itu harus divalidasi dengan mengakses sumber daya masing-masing.

Hal yang baik untuk melakukan Latihan API TESTING :

1. Kelompokan test case kedalam beberapa kategori.
2. Beri judul yang sesuai pada setiap test.
3. harus berhati-hati ketika melakukan test yang berhubungan dengan menghapus sesuatu.
4. Ketika membuat Test Case harus dipikirkan juga segala kombinasi input pada API.

Biasanya ada beberapa tipe data dalam hasil pengetesan API Yakni yang umum JSON / XML. Feedback (Response) apakah passed atau fail dan bisa memanggil fungsi API lain.

### Poin Ketiga

Ada beberapa hal yang biasa di testing dalam API testing :

1. Memverifikasi apakah kita mendapatkan respon dari API
2. Memverifikasi apakah hasil input/request sudah sesuai atau belum
3. Memverifikasi apakah data yang kita input / update sudah benar-benar berubah atau bertambah
4. Memverifikasi waktu response yang diberikan

Ada beberapa tipe Bug yang biasa terdeteksi oleh API TESTING :

1. Gagal melakukan error handling pada keadaan tertentu.
2. Kesulitan untuk tersambung dan mendapat respon API.
3. Isu Keamanan
4. Isu Performa
5. Error atau Warning yang tidak tepat.
6. Struktur dari data respon tidak benar (dari JSON & XML)

lalu mengingat tentang API TESTING kita sudah menjelaskan apa itu, cara melakukan dll. ini ada beberapa kelebihan dari API TESTING :

1. Efisiensi waktu
2. Bahasa yang independen
3. Mengurangi biaya testing
4. Mengurangi resiko

namun dibalik kelebihan API TESTING ada beberapa tantangan yang harus diperhatikan :

1. Kombinasi parameter, pemilihan parameter.
2. Tidak ada GUI (Graphical User Interface).
3. Kita harus mengetahui terlebih dahulu parameter.
4. Perlu juga mengetest error handling dari setiap API.

---

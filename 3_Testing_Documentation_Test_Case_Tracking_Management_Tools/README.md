# (3) Testing Documentation Test Case Tracking Management Tools

---

## Materi 1 : Testing Documentation (Test Scenario – Test Case – dll)

---
### Poin Pertama

Testing Documentation adalah sebuah dokumentasi yang dibuat selama atau sebelum pengujian aplikasi  perangkat lunak (software). Dokumentasi mencerminkan betapa pentingnya proses bagi pelanggan, individu, dan organisasi. Proyek yang berisi semua dokumen memiliki tingkat kematangan yang tinggi. Dokumentasi yang cermat dapat menghemat waktu, tenaga, dan kekayaan organisasi

Mengambil Referensi Dari Sini [JAVATPOINT : TESTING DOCUMENTATION](https://www.javatpoint.com/testing-documentation)

### Poin Kedua

Test Scenario merupakan informasi yang berisikan hasil rangkuman scenario dari fitur-fitur yang akan dilakukan testing atau pengujian. Pada Test scenario dituliskan secara umum dan tidak spesifik. Test Scenario juga memberikan informasi atau gagasan apa saja yang harus dilakukan testing, Lalu Test Scenario adalah level tertinggi dari sebuah test case.

Referensi Diambil Dari  [Buildwithangga : Perbedaan Test Scenarion dengan Test Case](https://buildwithangga.com/tips/perbedaan-test-scenario-dengan-test-cases-101-sqa#:~:text=Test%20Scenario%20merupakan%20informasi%20yang,secara%20umum%20dan%20tidak%20spesifik.)

Contoh dari Test Scenario :

1. Memeriksa *Fungsi Login*
2. Memeriksa *Fungsi Lupa Email*
3. Memeriksa *Fungsi Lupa Password*
4. Memeriksa *Fungsi Membuat Akun Baru*

### Poin Ketiga

Test Case merupakan informasi yang terperinci , berisikan langkah-langkah dalam melakukan testing atau pengujian beserta dengan **Hasil Ekspetasi** dan **Hasil Realita** dari testing tersebut. Test case ditulis secara detail, spesifik, dan terstruktur dengan baik serta rapi dan mudah dibaca.

Referensi Diambil Dari  [Buildwithangga : Perbedaan Test Scenarion dengan Test Case](https://buildwithangga.com/tips/perbedaan-test-scenario-dengan-test-cases-101-sqa#:~:text=Test%20Scenario%20merupakan%20informasi%20yang,secara%20umum%20dan%20tidak%20spesifik.)

> dengan adanya test case diharapkan bahwa suatu sistem dapat dijalankan dengan baik sesuai kebutuhan awal dan mampu memberikan respon ketika terdapat suatu masukan yang tidak valid.

Contoh dari Test Case :

1. Memasukan *Email yang benar* dan *Password yang benar*
2. Memasukan *Email yang benar* dan *Password yang salah*
3. Memasukan *Email yang salah* dan *Password yang benar*
4. Memasukan *Email yang salah* dan *Password yang salah*


> KESIMPULANNYA : *Test Scenario* Menjawab apa yang harus di testing , lalu *Test Case* bagaimana cara testing nya.

---

## Materi 2 : Test Case Management Tools

---

### Poin Pertama

Apa itu Test Case Management Tools ? adalah sebuah alat untuk mengkontorol atau mengkoordinasi dari sekian banyak nya dokumen Test Case. Lalu mengapa kita membutuhkan Test Case Management Tools ?

1. Merencanakan dan Memperikarkan.

Sebuah Test Plan bisa didefinisikan menjadi sebuah dokumen yang menjelaskan sebuah fitur yang akan di test, fitur yang tidak di test, pendekatan, sumber daya, dan jadwal sebuah kegiatan testing yang dimaksud.

Memperkirakan Usaha (upaya) untuk testing adalah salah satu tugas utama yang penting dalam Test Management

2. Memantau dan Mengkontrol.

Memantau adalah sebuah proses dari mengumpulkan, rekaman, dan pelaporan informasi dari sebuah aktifitas projek yang dimana Projek Manager dan Stakeholder harus mengetahui hal tersebut.

Mengkontrol proses menggunakan data dari aktivitas Pemantauan untuk membawa Performa aktual, ke kinerja yang direncanakan.

3. Melaporkan dan mengintegrasikan dengan tools yang lain.

Test Case Management Tools bisa menggenerate otomatis sebuah laporan. Beberapa Test Case Management Tools bisa mengintegrasikan dengan tools yang lain seperti Jira, Pivotal, Redmine, Jenkins, Treavis CL.

> Ada banyak aplikasi Test Case Management Tools seperti Test Link, Zephyr, qTest, PractiTest, TcLab. Dan yang akan kita bahas kali ini adalah TestRail

### Poin Kedua

TestRail adalah software Test Case Management Tools berbasis web untuk secara efisien, mengelola, melacak dalam upaya pengujian perangkat lunak. TestRail ini merupakan salah satu software yang sering digunakan oleh QE dalam menulis TestCase yang digunakan untuk keperluan testing. Referensi ini diambil dari [Nikarahman.medium : Test Case Management Software For Quality Assurance (QA) with TestRail](https://nikarahman.medium.com/test-case-management-software-for-quality-assurance-qa-with-testrail-4ac2cb53c566#:~:text=TestRail%20adalah%20software%20uji%20kasus,yang%20digunakan%20untuk%20keperluan%20testing.)

Disini kita akan menjelaskan cara menggunakan TestRail :

1. Bukalah TestRail di browser dan daftar jika belum punya akun, kalau sudah punya akun login di link [Berikut Ini](https://www.gurock.com/testrail/)
2. Buatlah sebuah Test Project dengan nama **"Nama Projek Kamu"** > Test Project > Lalu klik **"Add Project"** di samping side menu.
3. Isi semua Mandatory Field atau kamu bisa memilih opsi lain yakni Custom.
4. Buatlah Milestones, Milestones adalah **Sprint Planning Nomor Pengulangan**
5. Setelah membuat Milestones, kita akan membuat Test Run. Test Run merupakan step dimana kita akan mengeksekusi test case yang sudah kita pilih untuk Milestone yang sudah kita tentukan sebelumnya. Isi beberapa form yang ada disana untuk membuat Test Run.
6. Setelah Membuat Test Run, kita akan membuat Test Plan adalah sebuah Blueprint dalam melakukan proses pengujian, Dokumen yang berisi rencana untuk semua kegiatan pengujian yang harus dilakukan untuk menghasilkan produk yang berkualitas. Membuat Test Plan hampir sama seperti Test Run kita hanya mengisi beberapa field yang ada.
7. Lalu Kita akan membuat Test Case, Test Case adalah dokumen untuk memastikan apakah suatu sistem dapat dijalankan dengan baik. Test case ini apakah fitur dari ssitem berjalan dengan normal atau tidak.
8. Dari TestCase yang kita buat diatas akan masuk ke Test Report. Test Report berisikan semua progres dari Test Case yang kita buat sebelumnya, untuk memunculkan progres dari Test Report kita harus menjalankan Test Case itu, apakah hasilnya Passed, Blocked, Retest, atau Failed.

### Poin Ketiga


Jadi Kesimpulan dari sebuah Test Case Management Tools menggunakan TestRail ini ada beberapa Tahapan :
1. Membuat Test Project
2. Membuat Milestones
3. Membuat Test Plan
4. Membuat Test Run
5. Membuat Test Case dan menambahkan ke Test Run
6. Mengeksekusi Test Case
7. Menggenerate Hasil dari Test Case ke Test Report

> Test Management adalah suatu hal yang sangat penting dari aspek Software Testing, tanpa skill Test Management yang memadai, proses Software Testing akan gagal.

___

## Materi 3 : Tracking Management Tools

---

### Poin Pertama

Apa itu Tracking Management Tools adalah Software yang digunakan untuk melaca dan mengelola tugas. Digunakan untuk manajemen proyek perangkat lunak melacak bug, fitur, dan pekerjaan lainnya.

Jira merupakan Salah satu Aplikasi Tracking Management Tools , Dikembangkan oleh Atlassian. Jira ini OpenSource yakni gratis, namun jika kalian ingin mendapatkan banyak fitur menarik didalamnya ada juga Subscription yang disediakan oleh pihak developer.

Jira bisa melakukan berbagai hal antara lain :

1. Bug Tracking : Merupakan sistem program atau aplikasi yang memudahkan proses melacak kesalahan pada sistem.
2. Issue Tracking : Untuk mengelola dan memelihara daftar masalah dalam pengembangan sistem.
3. Project Management : Suatu fitur dalam hal perencanaan, pengorganisasian, pengelolaan (Menjalankan dan mengendalikan), untuk bisa mencapai tujuan-tujuan projek.

### Poin Kedua

Setelah kita mengetahui apa itu Jira dan kegunaanya kita bisa mengaplikasikannya dalam Projek kita. Disini saya aklan menjelaskan cara penggunaan Jira :

**MEMBUAT PROJEK BARU DI JIRA**

1. Klik button drop down menu di sebelah kiri atas dan klik **"Create Project"**
2. Pilih **"SCRUM"** sebagai metode pengembangan, kemudian masukan **"Nama Project Kalian"** dan klik button **Create**
3. Setelah membuat projek baru, kalian bisa membuat beberapa Panel Custom (disesuaikan dengan kebutuhan masing-masing). Namun ada Tips untuk pembuatan panel yang propper yang akan dijelaskan dibawah ini :

- To DO : Panel yang berisikan Story **Yang Akan Dikerjakan** dan **Di Prioritaskan** saat planning. Jika ditempatkan dipaling atas maka prioritas nya semakin tinggi.
- In Progress : Panel yang berisikan story, yang sedang dikerjakan oleh **Software Engineer**.
- Finish : Panel berisikan story, yang **Telah selesai dikerjakan** oleh para software engineer, namun **Belum siap masuk tahapan testing**.
- Deliver : Panel berisikan story , yang siap memasuki **TAHAP TESTING** oleh para **Quality Engineer**
- Need Fix : Panel yang berisi **Hasil Proses Testing** yang **Tidak Lolos Kriteria** oleh tim development.
- Done : Panel yang berisikan fitur-fitur yang **Sudah Lolos** dari **Kriteria Testing** oleh development Tim.

**MEMBUAT ISSUE BARU DI JIRA**

> Issue pada jira akan melacak masalah yang mendasari proyek ataupun bug.

Lalu ada 7 point yang harus diperhatikan ketika membuat Isse :

1. Project : Dipilih sesuai dengan issue yang akan dibuat, dan akan ditempatkan dimanakah project tersebut.
2. Issue Type : Bisa membedakan berbagai jenis pekerjaan dengan cara yang unik, dan membantu untung mengidentifikasi, mengkategorikan, atau reporting pekerjaan tim. Untuk Issue Type ada 4 Yakni :

- Story : biasa digunakan untuk membuat fitur baru.
- Task : biasa digunakan untuk melakukan perincian tugas-tugas yang akan dikerjakan.
- Bug : biasa digunakan jika terjadi penemuan bug saat proses testing oleh Quality Engineer
- Epic : melakukan pengelompokan Task

3. Reporter : Menentukan **Reporter** berdasarkan yang membuat tugas tersebut.
4. Description : Menuliskan **Deskripsi** dengan jelas menggunakan format yang sama dengan dituliskan pada Pivotal Tracker. Ada 2 Kondisi Description yang sering dikenal yakni :

- **Acceptance Criteria**, Jika fitur yang dibuat sudah sesuai dengan accpetance criteria yang ditentukan oleh development team.
- **Test Implementation**, membuat dokumentasi setelah melakukan proses testing (Test Scenario)
5. Priority : Menentuka **Priority / Prioritas** berdasarkan dari tingkat kesulitan task atau issue tersebut.
6. Assignee : Menentukan **assignee** berdasarkan dari orang yang akan bertanggung jawab mengerjakan tugas tersebut.
7. Sprint : Menentukan **Sprint** berdasarkan dari ruang waktu pengerjaan sebuah task atau issue (Biasanya diberi waktu 1 atau 2 minggu)

### Poin Ketiga

Fase Pada Jira ini mungkin sudah dijelaskan pada Poin ke 2 Sub Bab Pembuatan Project Baru di Jira (no 3). Namun secara kasar proses nya menjadi seperti ini :

> To Do > In Progress > Finish > Deliver > Need Fix (Jika ada yang perlu di betulkan maka kembali lagi ke Poin In Progress sampai tidak ada masalah) > Done

Lalu, apa saja yang harus diperhatikan oleh **Quality Engineer** di jira ? :

1. Membuat Issue bertipe BUGS saat ditemukan, karena ada yang tidak sesuai dengan kriteria testing.
2. Memindahkan fitur yang berkaitan dengan bugs ke kolom "In Progress"

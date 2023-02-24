# (1) Software Testing as a Career Path & Intro to Testing

---
**Software Testing** adalah sebuah proses sebuah aplikasi (*software*) untuk mendeteksi perbedaan antara kondisi aktual dan kondisi yang diharapkan serta melakukan evaluasi fitur pada *software* yang dilakukan testing.

---
## Materi 1 : Software Testing Fundamental

---
### Poin Pertama
Seberapa penting kah *Software Testing* itu ?, ada sebuah perusahaan bank yang telah melakukan upgrade versi *software* hal ini menyebabkan banyak keluhan dari pelanggan dan berdampak banyak kerugian dari pihak bank.

Karena itu *Software Testing* sangatlah penting karena, perusahaan dapat menghemat uang, kualitas produk (software) nya menjadi bagus, kemanan terjamin, dan memberikan kepuasan terhadap pelanggan. 

>dan ada kutipan dari internet juga yang tertulis : *"Software Bug bisa saja mahal atau bahkan berbahaya, Software Bug bisa berpotensi menyebabkan kerugian finansial dan manusia "*

### Poin Kedua
Dalam *Software Testing* ada beberapa platform yang bisa kita testing yakni :
1. API
2. WEB
3. Mobile
4. Desktop

dalam *Software Testing* pula ada beberapa tipe yakni :
1. Functional Testing

**Functional Testing** adalah jenis pengujian yang dilakukan untuk memverifikasi bahwa setiap fitur aplikasi berfungsi sesuai dengan persyaratan yang diberikan oleh client. (saya mengambil referensi penjelasan Functional Testing di situs [Linkedin : Functional and Non Functional Testing](https://id.linkedin.com/pulse/functional-non-functional-testing-fadia-efendi-baharudin#:~:text=Non%2DFunctional%20Testing.-,Apa%20itu%20Functional%20Testing%3F,persyaratan%20yang%20diberikan%20oleh%20klien.))

ada 2 metode dalam functional testing ini :
1. Manual

Testing Manual seperti namanya manual, maka Testing aplikasi ini akan dilakukan secara manual oleh manusia itu sendiri tanpa bantuan alat atau software apapun

- Dalam proses ini, penguji perangkat lunak menjalankan kasus uji dan menghasilkan laporan pengujian.
- Ini adalah metode klasik dari semua jenis pengujian dan membantu menemukan bug dalam sistem perangkat lunak.
2. Automate

Testing Automate kebalikan dari testing manual, testing ini dilakukan otomatis menggunakan bantuan dari tools atau software dan script.

- Tester menulis kode/tes untuk mengeksekusi otomatis tes
- Tester menggunakan *Software* otomatis yang sesuai untuk mengembangkan *script* dan memvalidasi *software*
- Tujuannya adalah menyelesaikan Eksekusi testing dalam waktu yang lebih singkat

>Jadi pemilihan Tools Otomatis yang tepat, proses testing, dan tim adalah pemain kunci dari Automate untuk mencapai sebuah kesuksesan. Manual dan Automate adalah metode berjalan untuk seiring pengujian software menjadi sukses.

2. Non-Functional Testing

**Non Functional Testing** dilakukan sesuai dengan persyaratan non-fungsional produk yakni : Akurasi dari aplikasi, Keamanan, Stabilitas, Daya Tahan, Kebenaran dll. Pengujian Non Fungsional dilakukan sesuai dengan persyaratan yang ditentukan oleh klien (saya mengambil referensi penjelasan Non Functional Testing di situs [Linkedin : Functional and Non Functional Testing](https://id.linkedin.com/pulse/functional-non-functional-testing-fadia-efendi-baharudin#:~:text=Non%2DFunctional%20Testing.-,Apa%20itu%20Functional%20Testing%3F,persyaratan%20yang%20diberikan%20oleh%20klien.))

Ada salah satu metode *Non-Functional Testing* yakni Performance Testing . *Performance Testing* dapat diartikan sebagai sebuah tipe *Testing Software* untuk meninjau performa aplikasi apakah berjalan baik dibawah tekanan kerja yang diharapkan.

Ada 3 patokan dalam *Performance Testing* ini

- Kecepatan

Kecepatan dalam mendapatkan respon dari aplikasi tersebut apakah aplikasi yang diuji cepat atau lambat
- Skalabilitas

Skalabilitas menentukan apakah aplikasi akan bisa menahan beban ketika banyaknya user yang memakai aplikasi tersebut
- Stabilitas

Stabilitas menentukan apakah aplikasi tersebut stabil dibawah beban yang bervariasi.
3. Maintenance

Maintenance dapat diartikan pemeliharaan, maka dari itu Maintenance Testing adalah pengetesan ketika suatu aplikasi , mengidentifikasi masalah software, mendiagnosis, atau ketika perbaikan bug telah berhasil.

Ada juga Regression Testing adalah suatu tipe metode *Software Testing* untuk mengkonfirmasi bahwa fitur baru ataupun perubahan kode itu tidak mempengaruhi perfroma atau fitur yang ada

### Poin Ketiga

Dalam Software Testing juga ada beberapa level ditahapi :

1. Unit Testing

Unit testing adalah tahapan dimaana Software Tester dimana melakukan testing secara individu

di analogikan 2 orang yang bernama A dan B. Saya ingin A mengatakan rasa permen manis, (B) memberikan sebuah permen kepada (A) tanyakan apa rasanya? kalau bisa merasakan berarti fungsi indra pengecapnya sistem (A) berjalan sukses.

2. Integration Testing

Integration Testing tahapan dimana Software Testing melakukan testing individual dan grup menjadi satu

di analogikan 2 orang yang bernama A dan B, lalu 1 orang lagi C sebagai Tester. A bertanya "siapakah Namamu ?" lalu B menjawab "Namaku LoremIpsum". dengan adanya interaksi (Request dan Response sesuai dengan ekspetasi) dan saling paham, berarti integrasi ini berjalan sukses

3. System Testing

System Testing adalah tahapan dimana Software Tester melakukan testing terhadap Software yang lengkap dan sudah dilakukan diuji dengan terintegrasi. Alasan tahapan testing ini untuk mengevaluasi kesesuaian sistem dengan persyaratan yang telah ditentukan.

Dianalogikan dengan 3 Orang yang bernama A, B, dan C. 

- A mengambil Permen dan memberikannya ke B
- Lalu B menerima permen dan membuka permen itu dan memberikannya ke C dan bertanya apa rasa dari permen itu.
- C menerima dan memakan permen pemberian dari B
- C memproses (merasakan) permen itu, lalu memberitahukan kepada B bahwa rasa permen itu manis
- B menginformasikan kepada A bahwa permen itu Manis

4. Acceptance Testing

Acceptance Testing adalah tahapan Software Tester menguji software untuk penerimaan (Apakah software sudah bisa diterima dengan baik atau tidak). Tujuannya adalah untuk mengevaluasikan kesesuaian sistem dengan persyaratan yang sudah diberikan, lalu ditilai apakah sudah layak diterima untuk diberikan ke client atau user.

Dianalogikan dengan 4 Orang yang bernama A, B, C, dan D.

- A mengambil Permen dan memberikannya ke B
- Lalu B menerima permen dan membuka permen itu dan memberikannya ke C dan bertanya apa rasa dari permen itu.
- C menerima dan memakan permen pemberian dari B
- C memproses (merasakan) permen itu, lalu memberitahukan kepada B bahwa rasa permen itu manis
- B menginformasikan kepada A bahwa permen itu Manis
- A memberikan informasi ke D
- D membuat report bahwa rasa permen itu manis

---
## Materi 2 : Software Testing as a Career Path

---

### Poin Pertama

Apa *Software Testing* itu ? Software Testing melakukan proses verifikasi sistem/software untuk memutuskan apakah software memenuhi persyaratan yang ditentukan dan menghasilkan hasil yang diinginkan. Tahapan diatas akan menghasilkan identifikasi bug dalam sebuah produk atau proyek software.

Lalu apa saja yang biasa dilakukan Software Tester ?

- Memahami Kebutuhan Dokumen
- Membuat Tes Case
- Mengeksekusi Testing Case
- Melaporkan dan me-test ulang adanya bug
- Menghadiri meeting dengan team yang lain untuk merancang aktifitas

### Poin Kedua

Ada beberapa skills yang dibutuhkan untuk menjadi seorang *Software Tester* yakni Non-Technical Skills dan Technical Skills.

1. Non-Technical Skills

*Non Technical Skills* adalah keterampilan yang berkaitan dengan kemampuan bersosialisasi (bisa dibilang termasuk soft skills). Ada beberapa hal dalam Non-Technical Skills ini yakni :

- Analytical Skill : Seorang *Software Tester* yang baik harus memiliki skill analisis yang bagus, Keahlian analisis ini akan membantu dalam memecahkan sistem Software yang rumit menjadikan unit-unit yang lebih kecil dan untuk mendapatkan pehamahaman yang lebih baik lagi.
- Communication Skill : Seorang *Software Tester* yang baik harus memiliki skill komunikasi yang bagus baik dari lisan ataupun tulisan, Karena hal ini yang akan membuat *Software Tester* ketika membuat laporan akan mudah dibaca oleh rekan tim lain.
- Time Management & Organization Skill : Seorang *Software Tester* harus mengelola beban kerja yang tinggi maka dari itu harus bisa mengelola secara efisien, memiliki produktifitas yang sangat tinggi, menunjukan manajemen waktu yang optimal, dan keterampilan organisasi.
- Great Attitude : Seorang *Software Tester* harus memiliki sikap yang sangat baik, sikap untuk kemauan untuk belajar dan melakukan perbaikan.
- Passion : Seorang *Software Tester* harus memiliki hasrat dibidangnya, cobalah secara sederhana melakukan pengujian software namun jika tidak memenuhi hasrat beralih ke hal yang menarik untuk minat kalian.

2. Technical Skills

*Technical Skills* adalah keterampilan yang berkaitan dengan hal teknis dan keterampilan yang berkaitan dengan bidang yang ditekuni, Contohnya bisa mengoperasikan suatu aplikasi. Ada beberapa hal dalam Technical Skills untuk menjadi *Software Tester* ini :

- Pengetahuan Dasar Unix / Linux Commands
- Pengetahuan dan Pengalaman dalam Aplikasi Tes Management Tool : Test Management hanya memanage list test kamu dalam suatu software. Contoh aplikasi untuk memanage kinerja adalah TestLink, PractiTest, TestRail.
- Pengetahuan dan Pengalaman dalam Aplikasi Tracking Management Tool : Tracking Management Tool berfungsi untuk memanage sebuah projek bisnis (contohnya perancang bangun software), seperti membuat aktifitas perancanaan, mengeksekusi, mengkontrol, dan menyelesaikan projek. Contoh aplikasi Tracking Management Tool Pivotal Tracker, Jira Software.
- Pengetahuan dan Pengalaman dalam Aplikasi Automating Testing Tool : Automating Testing Tool untuk melakukan pengetesan aplikasi secara otomatis dengan bantuan aplikasi atau skrip. Pemilihan aplikasi automation tool yang benar, proses testing, dan tim sangatlah penting untuk melakukan pengetesan otomatis menjadi sukses. Contoh aplikasi Automation Testing Tool Rest Assured, CodeCeption, Karate DSL, Katalon Studio

### Poin Ketiga

Ada beberapa jenjang karir bagi seorang *Software Tester* yakni :
- Junior Quality Engineer (Fresh)
- Quality Engineer (1-2 Tahun Pengalaman)
- Senior Quality Engineer (>3 Tahun Pengalaman)
- Quality Engineer Lead (5-6 Tahun Pengalaman)
- Quality Engineer Manager (8-11 Tahun Pengalaman)

Dan jika kalian tidak memiliki passion atau ingin mencari alternatif jenjang karir yang awalnya *Software Tester* menjadi :

- Performance Tester
- Penetration Tester
- System Analyst
- Scrum Master

Ketika ingin menjadi software tester kalian bisa menjadi freelance atau melamar pekerjaan dengan syarat harus bisa :
- Melakukan dan Memiliki Pengalaman Dalam Software Testing
- Melakukan dan Memiliki Pengalaman Dalam Test Case Management Tools
- Melakukan dan Memiliki Pengalaman Dalam Automation Testing

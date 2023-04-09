# (9) From Manual to Automation Testing & Behaviour Driven Development

---

## Materi 1 : From Manual to Automation Testing

---
### Poin Pertama

Apa itu Manual Testing ? Manual testing merupakan Test Case yang dieksekusi oleh manusia dan bantuan software. Testing untuk Lalu mengapa harus Manual Testing ? Karena manual testing itu Eksplorasi, Kecepatan, Kegunaannya.

Lalu apa kelebihan dari Manual Testing ?

- Dapatkan umpan balik visual yang cepat dan akurat. 
- Ini lebih murah karena Anda tidak perlu menghabiskan anggaran Anda untuk alat dan proses otomasi. 
- saat menguji perubahan kecil, pengujian otomasi akan membutuhkan pengkodean yang bisa memakan waktu. Meskipun Anda dapat menguji secara manual dengan cepat

Setelah kelebihan pasti ada kekurangan, Kekurangan dari Manual Testing  Adalah :

- itu selalu rawan kesalahan & kesalahan 
- tidak dapat direkam, sehingga tidak mungkin untuk menggunakan kembali tes manual

### Poin Kedua

Apa itu Automation Testing ? Testing Otomatis yang dapat diartikan testing yang  menggunakan Alat Otomatis dalam mengeksekusi Test Case. Lalu mengapa Harus Automation Testing ? Karena Fleksibel, Cepat, Tercover Berkas, dan Menghindari Error.

Lalu Test Case apa yang bisa dijalankan Automation Testing ?

- Test Cases dapat  dijalankan berulang kali. 
- Test Cases yang sangat membosankan atau sulit yang dilakukan secara manual.
- Test Cases yang memakan waktu untuk dilakukan secara manual.

Lalu Test Case manakah yang tidak bisa di Automation Testing ?

- Test Cases yang baru dirancang dan tidak dijalankan secara manual setidaknya sekali.
- Test Cases yang persyaratannya sering berubah.

### Poin Ketiga

Alur dari Automate Testing Process ini ada 5 Tahapan : Test Tool Selection, Define scope of automation, Planning design and development, Test Execution, Maintenance.

1. Test Tool Selection

Kita harus memilih aplikasi Testing Tool Automation yang cocok dengan apa yang akan kita test. 3 hal yang utama yakni : Usability, Simplicity, & Cost.

2. Define Scope of Automation

Scope of Automation adalah Lingkup otomatisasi adalah area aplikasi Anda yang sedang diuji yang akan diotomatisasi

3. Planning, Design and Development

Dalam fase ini kalian bisa membuat Strategi & Plan Automation kemudian kembangkan skrip otomasi.

4. Test Execution

Mengeksekusi Automation Script pada fase ini.

5. Maintenance

Automation Script perlu di tambahkan, di review, dan maintenance pada setiap tahapan.

Hal yang Terbaik untuk diperhatikan dalam automation testing !

- Otomasi Lingkup perlu ditentukan secara rinci, ini menetapkan ekspektasi dari otomatisasi dengan benar 
- Pilih alat otomatisasi yang tepat 
- standar skrip standar harus diikuti saat menulis skrip untuk otomatisasi 
- ukuran metrik keberhasilan otomasi tidak dapat ditentukan dengan membandingkan upaya manual dengan upaya otomasi

> "Improve Quality, Improve Productivity" - W. Edwards Deming -

---

## Materi 2 : Behaviour Driven Development

---

### Poin Pertama

Sebelum memasuki materi tentang BDD, alangkah baiknya kita memperhatikan fakta-fakta dibawah ini.

> 17% dari projek software menjadi buruk, mereka mengancam keberadaan perusahaan.
> Dalam rata-rata, Project IT 45% kemungkinann besar berjalan dengan melebihi budget yang di tentukan. Lalu 7% yang melebihi waktu deadline, Ketika dikirimkan ke client 56% dibawah value yang diharapkan.

Pada Tahapan Requeirements konsumen mengharapkan mereka (System Analyst & Software Engineer) memahami kebutuhan mereka, System Analyst berharap Software Engineer mengikuti arahan spesifikasi yang dibuat oleh System Analyst, Lalu Software engineer berharap bahwa ini adalah yang konsumen inginkan.

Namun kenyataannya ketika dalam masa Requirements juga banyak masalah, tidak sesuai harapan si konsumen. Dan nyatanya ketika perilisan software tidak sesuai spesifikasi yang diinginkan.

Sudah membaca fakta diatas ada cara yang bisa menghindari hal tersebut yakni dengan BDD.

Ada BDD dan TDD

- TDD (Test Driven Development) yaitu sebuah metodologi pengembangan dimana kita mengutamakan komponen-komponen yang akan di test untuk membuat suatu sistem yang baik untuk Stakeholder.
- BDD (Behaviour Driven Development) kebalikan dari TDD, ia berfokus kepada "Behaviour" sebuah sistem, metodologi ini berfokus kepada Behaviour dalam konteks hal-hal stakeholder harapkan dapat dilakukan oleh suatu sistem.

> Referensi BDD Diatas diambil dari [sis.binus.ac.id : BDD (Behavior Driven Development)](https://sis.binus.ac.id/2018/03/16/bdd-behavior-driven-development/)

BDD tidak hanya membantu mendevelop software secara benar, namun itu membantu develop software yang tepat.

### Poin Kedua

Dalam BDD ada 4 tahapan (foramt) yakni :

1. User Story : Menjelaskan kebutuhan pengguna dan fungsionalitas sistem yang diharapkan. User story memiliki format standar : "As a **<role>** , I want to **<need/goal>** , so that **<why>** "
2. Asa A [X], I want [Y], So that [Z] : format untuk penulisan user story contoh yang lengkapnya : “As an **existing user** , I want to **log into my account** , so that **I can see my home page**.”
3. Scenario : Menuliskan skenarion (dalam feature files, menggunakan Gherkin) berdasarkan user stories. Sebuah feature file terdiri dari satu atau lebih skenario yang menjelaskan apa yang seharusnya dilakukan oleh sistem dalam situasi tertentu.
4. Given When Then : Terdapat 3 keyword sebagai elemen utama dalam skenario BDD (Kita juga dapat menggunakan keyword lainnya seperti And, But, Background, Scenario Outline, dan Examples):
- Given — menjelaskan konteks dari skenario .
- When — menjelaskan tindakan yang dilakukan oleh user .
- Then — menjelaskan outcome dari tindakan yang dilakukan oleh user.

> Referensi BDD Diatas diambil dari [Mona Natasha : Introduction to Behavior-Driven Development: BDD Series Part 1 - Medium.com](https://medium.com/ecomindo-dev/introduction-to-behavior-driven-development-bdd-series-part-1-e8b34ead0d88)

### Poin Ketiga

Dalam poin 2 kita notice Gherkin BDD Language : Skenario-skenario itu ditulis dalam sebuah tata bahasa yang disebut Gherkin. Jadi Gherkin adalah aturan tata bahasa yang membuat teks dengan struktur tertentu dapat dipahami oleh Cucumber. Contoh skenario menggunakan Gherkin:

Scenario: User want to access PPDB online registration form

Given User access the PPDB online website

When The PPDB online website is displayed

Then User fill all registration form

Then User submit the registration data

Dokumen skenario yang ditulis menggunakan tata bahasa Gherkin tersebut di atas disimpan dengan file berekstensi .feature.

> Referensi diatas diambil dari [PojokQA : BERKENALAN DENGAN BDD, CUCUMBER DAN GHERKIN](https://pojokqa.wordpress.com/2020/12/20/berkenalan-dengan-bdd-cucumber-dan-gherkin/)

Untuk melakukan serangkaian behaviour test, ada sebuah tool yang disebut Cucumber. Cucumber adalah sebuah tool yang mendukung BDD. Cucumber membaca semacam ketentuan yang dapat dieksekusi, dimana ditulis menggunakan teks biasa dan ketentuan tersebut memvalidasi bahwa sistem atau aplikasi melakukan apa yang dituliskan dalam ketentuan tersebut. Ketentuan tersebut terdiri dari beberapa skenario.

Contoh Membuat Story yang tepat ada di atas (Point penjelasan Gherkin).

> Persiapan ketika ingin menjalankan BDD ini sudah menginstal " Java1.8, Maven 3.5.2 , InteliJ IDEA "

---
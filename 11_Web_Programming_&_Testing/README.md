# (10) Web Programming & Testing

---

## Materi 1 : Web Programming

### Poin Pertama

Dalam dunia programming ada istilah yang sering kita dengar yakni Front End & Back end. Namun saat ini kita akan membahas Front End.

Lalu apa itu Front End : Front End adalah sebuah bagian dari website yang membuat tampilan yang menarik kepada user. Dalam pembuatan sebuah tampilan di FE, kita membutuhkan 3 Hal yakni HTML, CSS, dan JS. 

HTML merupakan pondasi berdirinya suatu halaman website , HTML atau kepanjangan dari (Hypertext Markup Language) adalah sebuah standar yang digunakan secara luas untuk menampilkan halaman web.

Banyak sekali yang dapat dilakukan oleh HTML dengan memahami struktur kode dan tag didalamnya, kita bisa dengan mudah membuat Halaman website yang baik.

Kegunaan HTML :

1. Membuat struktur dari halaman website.
2. Mengatur tampilan dan isi dari halaman web.
3. Membuat tabel dengan tag HTML table.
4. Membuat Form HTML.
5. Membuat gambar dengan canvas.
6. Mempublikasikan halaman website secara online.

HTML Editor sangatlah banyak salahsatunya itu ada NotePad, Visual Studio Code, Sublime, Notepad++, dan atom.

DOKUMENTAASI HTML ada dibawah ini :

| Syntax                                                      |                          Fungsi                           | 
|-------------------------------------------------------------|:---------------------------------------------------------:|
| <! DOCTYPE html>                                            |          mendefinisikan dokumen ini sebagai HTML          |
| < html > < /html >                                          |               elemen root dari halaman HTML               |
| < head > < /head >                                          |           berisi informasi meta tentang dokumen           |
| < title > < /title >                                        |              menentukan judul untuk dokumen               |
| < body > < /body >                                          |           berisi informasi meta tentang dokumen           |
| < title > < /title >                                        |     berisi informasi tentang judul dari page html nya     |
| < h1 > < /h1 >                                              |                         Heading 1                         |
| < h2 > < /h2 >                                              |                         Heading 2                         |
| < h3 > < /h3 >                                              |                         Heading 3                         |
| < h4 > < /h4 >                                              |                         Heading 4                         |
| < h5 > < /h5 >                                              |                         Heading 5                         |
| < h6 > < /h6 >                                              |                         Heading 6                         |
| < strong > < /strong >                                      |                 membuat teks lebih tebal                  |
| < em > < /em >                                              |          Penekanan pada teks yang menjadi italic          |
| < s > < /s >                                                |            membuat teks dengan garis tercoret             |
| < br/ >                                                     |            line break untuk membuat garis baru            |
| < a href="linkTaruhDisini"> TeksLink < /a >                 |                     Tag Link di HTML                      |
| < a href="linkTaruhDisini" target="_blank"> TeksLink < /a > |            Tag Link di HTML dengan membuka tab            |
| < img src="namafile.png" / >                                |                     Tag Image di HTML                     |
| < ol > < /ol >                                              |                     list yang terurut                     |
| < ul > < /ul >                                              |                  List yang tidak terurut                  |
| < ol type="a / A / i / I" > <li>HTML</li> < /ol >           |  Ordered List type a A i I di deklarasikan dengan < li >  |
| < ul type="square / disc / circle " > <li>HTML</li> < /ul > | Unrodered List type a A i I di deklarasikan dengan < li > |
| < table > < /table >                                        |                  Membuat table pada html                  |
| < utr > < /tr >                                             |             setiap baris table dideklarasikan             |
| < td > < /td >                                              |            Setiap kolom table di deklarasikan             |
| < th > < /th >                                              |       Untuk kolom pada tabel header di deklarasikan       |

### Poin Kedua

Lalu ada Cascading Style Sheets atau CSS. Dapat menghias halaman website terdiri dari (warna, ukuran, font, background, tinggi lebar dll). Dapat mengatur posisi pada halaman web (Floar, align, display, position).

Semisal suatu website (atau file HTML) tidak menggunakan css akan nampak hambar dan tidak menarik, beda lagi jika ditambahkan css maka akan terlihat bagus.

Untuk menambhakan file css ke projekan, ada 3 cara menambahkan file css kedalam HTML :

1. External CSS

contoh syntax External CSS : < link rel="stylesheet" href="main.css" > syntax ini biasanya disisipkan kedalam tag <head> pada HTML. Ekstensi file nya adalah .css

2. Internal CSS

Syntax ini dapat digunakan pada satu file html. didefinisikan didalam elemen < style > < head > < body >.

3. Inline CSS

< h1 style="color : #ffffff;" > Hello World < /h1 > : syntax ini dapat digunakan untuk elemen tunggal pada HTML. Diprioritaskan untuk menerapkan style yang unik.

contoh Syntax css yang sederhana h1 { color : pink; font-size: 15px; } pertama selector, kedua property ke 3 value.

CSS Selector pola yang digunakan untuk memilih element, yang ingin di styling. Penanda HTML ke dalam CSS, dapat menggunakan selector ID dan Class.

1. ID -> ( # ) : 

- Setia
- P elemen hanya dapat memiliki satu tag id
- Dalam satu halaman tidak boleh ada dua penamaan id yang berbeda

2. Class -> ( . ) :

- Tag class dengan nama yang sama dapat dipakai berulang-ulang pada satu halaman.
- Satu elemen boleh memiliki lebih dari satu class yang berbeda-beda.

3. Groupping -> ( selector ) :

Beberpaa selector dapat dikelompokkan kedalam satu deklarasi style.

4. CSS FONT

Dibawah ini adalah beberapa style font di css :


| Nama                 |                       Fungsi                        | 
|----------------------|:---------------------------------------------------:|
| Font                 | Menetapkan semua properti font dalam satu deklarasi |
| Font-Family          |            Menentukan kelompok font teks            |
| Font-Size            |             Menentukan ukuran Font Teks             |
| Font-Weight          |        Menentukan ketebalan untuk font teks         |
| Font-Style           |         Menentukan font teks menjadi miring         |

5. CSS MArgin & Padding

Membuat ruang disekitar Element

6. CSS Background

Dibawah ini beberapa style background di CSS :

| Nama                |                     Fungsi                     | 
|---------------------|:----------------------------------------------:|
| Background-color    | Menetapkan warna background pada suatu elemen  |
| Background-image    | Menentukan gambar background pada suatu elemen |
| Background-repeat   |  Menentukan gambar background untuk di ulang   |
| Background-size     |   Menentukan ukuran gambar untuk background    |
| Background-position |     Mengatur posisi awal gambar background     |

7. CSS Link Event


| Nama       |                             Fungsi                             | 
|------------|:--------------------------------------------------------------:|
| :hover     |        Kondisi style ketika mouse berada diatas elemen         |
| :active    |              style ketika link "ini Link" ditekan              |
| :visited   | Style dimana elemen link "ini link" telah dikunjungi / di klik |

8. CSS Transisi

Transisi CSS dapat mengubah value properti menjadi lebih halus dalam durasi yang ditentukan.

> Contoh Syntax : "transition: all 0.5s ease;"

9. CSS Display

Menentukan tampilan pada suatu elemen :


| Nama         |                                   Fungsi                                   | 
|--------------|:--------------------------------------------------------------------------:|
| Block        | Elemen block selalu dimulai pada baris baru. (dimulai dari kiri ke kanan). |
| Inline-block |       Elemen inline-block membutuhkan lebar sesuai yang diperlukan.        |
| None         |               Menyembunyikan elemen untuk tidak ditampilkan.               |

10. CSS Table

Membuat style elemen table pada HTML

| Nama             |                  Fungsi                  | 
|------------------|:----------------------------------------:|
| Border           | Menambahkan border pada table, th dan td |
| Border-collapse  |  membuat border menjadi single border.   |
| :nth-child(even) |        Membuat background stripe.        |


### Poin Ketiga

Untuk website zaman ini sangatlah menarik di sisi tampilan karena adanya HTML + CSS. Namun kita bisa membuatnya lebih simple dengan sebuah Framework.

Framework yang kita bahas ini ada di FrontEnd Framework : adalah sekumpulan aturan kode yang bisa kita gunakan untuk mempermudah dalam membuat suatu tampilan website, salahsatunya yakni BOOSTRAP.

Kenapa harus boostrap ?

- Gratis
- Cepat
- Mudah Dipelajari
- Mendukung Responsif

Ada beberapa CLASS pada boostrap ini

| Nama      |                Fungsi                 | 
|-----------|:-------------------------------------:|
| Container |      Container, Container-fluid.      |
| Row       |                  Row                  |
| Column    |     col-md12, col-lg-12, col-sm-6     |
| Button    | btn-primary, btn-success, btn-danger. |

---

## Materi 2 : Review Web UI Testing with Serenity

### Poin Pertama

**Arsitektur Serenity BDD** :

- Serenity adalah sebuah framework untuk BDD yang opensource untuk membantu menulis struktur dan mengurus otomasi testing.
- Arsitektur serenitu mencakup Requirements, Test, Steps, Pages dan Report

**Mendefinisikan Requirements** :

- Ketika menggunakan serenity, mulai dengan requirements yang diperlukan untuk pengimplementasian.
- Sering dinyatakan sebagai User "STORIES" dengan kriteria penerimaan yang membantu memperjelas persyaratan.
- User Stores inilah yang dijalankan otomatis oleh serenity.3

Contohnya seperti ini : **Search By Keyword**  in order for buyers to find what they are looking for more efficiently. as a seller, i want buyers to be able to search for articles by keywords.

**Automate Acceptance Criteria** :

- Selanjutnya mendeskripsikan kriteria penerimaan di kelas atas dari sebuah tim bisnis.
- Mencatat kriteria penerimaan ini menggunakan alat BDD seperti Cucucmber dengan Form Feature sehingga, Serenity dapat menjalankannya.

Contohnya seperti ini : **Search By Keyword**  in order for buyers to find what they are looking for more efficiently. as a seller, i want buyers to be able to search for articles by keywords.

**Scenario** search for articles by keyword, **Given** i want to buy a wool scraf , **When** i search for "Wool", **Then** i should see only articles related to "Wool"

**Implement The Test** :

- Implement adalah sebuah kriteria penerimaan menuju sebuah code, jadi mereka bisa menjalankan dengan aplikasi sesungguhnya.
- Dibawah itu, testing dipecah menjadi beberapa steps yang baik bisa dibacar dan mudah di maintenance.

**Report On Test Result** :

Serenity menyediakan detail laporan untuk hasil pengujian dan test yang dieksekusi termasuk :

- Sebuah penjelasan narative dari setiap test.
- Screenshot dari setiap langkah yang di test.
- Hasil test termasuk waktu dari pengeksekusian dan menampilkan error ketika test itu gagal.

BDD dengan Cucumber memiliki beberapa steps yang bisa dijelaskan dibawah ini :

1. Menuliskan Story dengan sytaks Gherkin (Given, When, Then)
2. Konfigurasi story dengan step by step
3. Browser Interaction melakukan mapping tahapan ke browser untuk di manipulasi.
4. Run Stories di intellij idea + maven.
5. View Report untuk melihat report menggunakan Serenity

**Writing The Test**

1. Menggunakan Serenity Cucumber
2. Mengdefinisikan Test Scenario
3. Automate Scenario
4. Mengdefinisikan Scenario Steps
5. Interaksi menjalanakan Dengan browser

### Poin Kedua

Practice Scenario (Contoh Login Berhasil Di Facebook)

**Menulis Test Story** : 

- Membuat file story di direktori test resource.
- Fitur dibagi menjadi 3 part: Feature, Scenario dan Gherkin Syntax (Given, When, Then)
- Feature Syntax harus seperti contoh dibawah ini :

**Feature** : as a user i want to perform login on facebook so that i can see my news feed. **Scenario** : **Given** i open facebook login page, **When** i input email and password, **When** i click button login, **Then** i can see my news feed.
 
**Membuat Test Class** :

- Membuat test class di package test/java.
- Setiap Given,When dan Then di file story harus di representasikan hanya dengan 1 function.
- Function di anotasikan dengan Gherkin Syntax yang sesuai.

**Membuat Test Steps** :

- Membuat Steps Class terekstend ke class ScenarioSteps.
- Nama Class harus diakhiri oleh "Steps" agar memudahkan ketika pemeliharaan.
- Di class ini, Steps harus dilakukan fungsi pemanggilan di lokasi Class PageObject.

**Membuat Page Object** :

- Membuat class yang extend ke PageObject.
- Class ini hanya berisikan fungsi yang berlokasi dan operasi di elemen website.
- Disana tidak ada larangan untuk mencari lokasi element seperti Id, xpath, class.

**Jalankan Testing**

- Jalankan testing dengan perintah "mvn clean verify"
- Seharusnya akan menampilkan log di console dan jika ada error akan ditampilkan juga.
- Setelah test run, report akan di generate dan bisa dilihat secara default di direktori

### Poin Ketiga

Digging Deeper (Menggali/Eksplor lebih dalam)

**Serenity Properties**

- Serenity support berbagai properties (pengaturan) untuk di kustomisasi berbagai cara test yang di jalankan.
- Webdriver.driver memilih browser mana yang akan digunakan untuk testing.
- Ignore.Failures.In.Stories set serenity untuk melanjutkan testing skenario selanjutnya walaupun scenario nya gagal.

**Parameter Injection** 

- Text di Story bisa digunakan sebagai variable, using bracket { } in annotation string in test class.
- Contohnya "samtingwong420@gmail.com" is used as variable named email_user.

**Meta Filtering**

- Untuk membantu mengelola skenario cerita, kita dapat menggunakan "tag" untuk fitur atau skenario yang sesuai.
- Untuk menjalankan dengan Tag secara spesifik, seperti dibawah ini {Mvn verify -Dtags="@User"}

**Parameter Scenario**

- Dalam Story Scenario bisa di parameter dengan di configurasikan dengan nilai.
- Parameter Scenario yang sama dengan banyaknya scenario dengan value yang berbeda.

---

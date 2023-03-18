# (6) Introduction Basic Programming & Object Oriented Programming (OOP)

---

## Materi 1 : Introduction Basic Programming

---
### Poin Pertama

**Java** merupakan salah satu bahasda pemrograman populer saat ini. Java diciptakan oleh **James Gosling** pada tahun 1995 yang pada saat itu masih bekerja di perusahaan Sun Microsystem. Sesuai penuturan penciptanya, Java adalah bahasa yang general purposed, class-based, object-oriented, dan concurrent.


### Poin Kedua

Ada 2 tools yang harus diperhatikan di Java yakni  ada :

- JDK : Java Development Kit, JDK merupakan salahsatu tools pendukung yang digunakan oleh para developer untuk proses *developing, debugging, dan monitoring*. Lalu didalam JDK tersebut ada terdapat JRE (Java Runtime Environment) untuk mendukung aplikasi java agar bisa dijalanakan. Untuk versi JDK yang terbaru yaitu ada JDK 11.
- IDE : Integrated Development Environment atau biasa disebut IDE merupakan sebuah tools yang membantu developer untuk membuat aplikasi. Di Dalam IDE terdapat source code editor, Build Automation Tools, dan Debugger. Berbgaai macam IDE yang dapat digunakan developer untuk memulai membuat aplikasi menggunakan Java seperti : NetBeans, OpenJDK, Ecplicse, BlueJm dan IntelliJ.

### Poin Ketiga

Dalam basic programming dibagi menjadi beberapa bagian seperti yang dijelaskan dibawah ini :

1. Type Data

Tipe Data adalah klasifikasi value suatu variabel yang membantu operasi komputer untuk mengenali nilai data tanpa menghasilkan output error. Dalam tipe data ada 6 yang dikenal ada :

- Integer : Adalah tipe data integer 32 bit yang digunakan untuk menyimpan data *angka* dalam range yang cukup besar.
- Float : Adalah kumpulan sebuah tipe data yang bisa digunakan untuk menampung angka desimal 7 digit.
- Double : Merupakan sebuah tipe data yang mirip seperti float, namun memiliki kapasitas yang lebih besar yakni 15 digit.
- Boolean : Merupakan sebuah tipe data yang memiliki 2 macam nilai yakni **true** **false**
- Char : Merupakan sebuah tipe data yang bisa digunakan untuk menampung karakter
- String : Adalah kumpulan beberapa kareakter (char)

2. Array 

Array adalah kumpulan beberapa data yang disimpan dalam satu variabel. Jadi diibaratkan sebuah kotak yang bisa menyimpan beberapa benda (atau data dari sebuah variabel) yang banyak.

3.  Operator

Operator adalah suatu simbol yang memberikan sebuah compiler atau interpreter untuk bisa melakukan operasi tertentu (operasi matematika) untuk bisa menghasilkan nilai akhir yang diinginkan. Ada beberapa Tipe Operator seperti :

- Assigment : = 
- Arithmetic : Penjumlahan matematika (+, -, *, /,%)
- Unary : Increment Decrement logika (+, -, ++, --, !)
- Equality dan Relational : Logika (==, !=, >, >=, <, <=)
- Conditional : Kondisional (&&, ||)

4. Input Output

Sesuai dengan namanya Input = nilai yang dimasukan, Proses = Serangkaian langkah dilakukan untuk mengelola input yang diberikan , Output = Menampilkan hasil olah data.

5. Branching

Percabangan (Branching) adalaah salah satu bentuk kontrol program, Percabangan berguna untuk mengatur alur jalan pemrograman sesuai dengan suatu kondisi yang terpenuhi. Dibawah ini jenis contoh Branching :

- If Then
- If Then Else
- Switch

6. Looping

Perulangan atau biasa dikenal Looping merupakan sebuah pernyataan atau instruksi yang diberikan kepada komputer agar ia mau melakukan proses data, menampilkan data, atau hal lainnya secara berulang kali. Ada 3 tipe looping :

- For
- While
- Do-While

---

## Materi 2 : Object Oriented Programming (OOP)

---

### Poin Pertama

Object Oriented Programming atau biasa yang dikenal OOP adalah suatu metode programming yang berorientasi pada objek. Program-program tersebut merupakan gabungan dari beberapa komponen kecil yang telah ada sebelumnya, sehingga dapat mempermudah pekerjaan seorang programmer dalam melakukan pengembangan.

### Poin Kedua

OOP banyak jenis dan tipe nya, antara lain :

- Object
- Inheritance
- Encapsulation
- Abstraction
- Polymorphism
- Attribute
- Method
- Class

Namun pada kesempatan kali ini kita akan hanya membahas Object, Inheritance, Attribute, Method, Class.

### Poin Ketiga

1. Class

Class adalah blueprint, prototype atau cetakan untuk membuat objek, Class berisikan deklarasi semua properties dan functions yang dimiliki oleh object.

> Setiap Object dibuat dari Class & Sebuah CLass bisa membuat object sebanyak banyaknya.

Diibaratkan seperti Class Motor : yang memiliki objek Mesin, Roda, Lampu, Jok.

2. Object

Object adalah data yang berisi filed / properties / attributes dan method / function / behavior.

Object dibagi menjadi 3 :

- Declaration : Mendeklarasikan nama sebuah objek
- Instantiation : memerlukan sebuah perintah new untuk menciptakan objek
- Initialization : Inisialisasi dari sebuah objek setelah perintah new

Motor objectMotor = new Motor ();

(Motor disini adalah inisialisasi nama objek)

(objectMotor adalah deklarasi nama objek)

(= new Motor adalah instantiation objek)

3. Method

Fungsi dan prosedur di dalam pemrograman java disebut sebagai method. Method didalam class adalah block statement yang memiliki naam dan bisa di eksekusi dengan memanggilnya.

Di dalam method ada Access Modifier :

- Public : Bisa kita sebut sebagai modifier global.
- Default : Berarti penulisan kodenya tanpa atribut modifier, Modifier default bisa diakses selama masih dalam satu package.
- Private : Akan membatasi akses hanya di dalam class.
- Protected : Bisa diakses selama masih dalam satu package, perbedaan dengan default, Protected bisa diakses selama masih dalam satu packade dengan syarat kelas yang hendak mengakses merupakan class turunannya.

4. Inheritance

Inheritance atau pewarisan adalah kemampuan untuk menurunkan sebuah class ke class lain. Maksudnya kita bisa membuat class inti dan class anak. Class anak atau Class Child hanya bisa punya satu class parent, Namun class parent bisa memiliki banyak class child. Saat sebuah class diturunkan, maka semua filed dan method di class parent akan bisa dimiliki oleh class child

> Untuk melakukan Inheritance di class childm kita harus menggunakan kata kunci extends lalu diikuti dengan nama class parent nya.

5. Attribute

Atribut dalam OOP adalah data anggota (Variabel kelas dan variabel contoh) dan metode, diakses melauli notasi titik. Sebuah variabel yang dibagi oleh semua.

---

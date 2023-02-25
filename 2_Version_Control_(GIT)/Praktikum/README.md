# Tugas Praktikum 2 - Version Control (GIT)

## Nama : Arul Budi Kalimat
## Kelas : QE-D Basic

### Soal Prioritas 1

1. buatlah sebuah repository github yang sesuai dengan namaKelas_namaKalian.

JAWABAN :  Saya sudah membuat repository di github link dapat diakses disini [GitHub : RsTi3/qe_arul-budi-kalimat](https://github.com/RsTi3/qe_arul-budi-kalimat). dan untuk bukti screenshot ada di folder screenshot atau screenshot gambar dibawah ini

![Repository Arul](D:\Kuliah\MSIB\ALTERA\TUGAS\qe_arul-budi-kalimat\2_Version_Control_(GIT)\Screenshot\SP1_S1.jpg)

2. buatlah folder yang berurutan dan diberi nama sesuai dengan nama soal yang kalian kerjakan seterusnya sesuai dengan nama soal yang kalian kerjakan. buat folder tersebut sampai soal rest API.

JAWABAN : sudah membuat folder hingga section 8 rest API

![Folder Repository Arul](D:\Kuliah\MSIB\ALTERA\TUGAS\qe_arul-budi-kalimat\2_Version_Control_(GIT)\Screenshot\SP1_S2.jpg)

3. pada setiap folder akan berisikan sub folder lagi seperti berikut

JAWABAN : Sudah membuat sub folder di setiap folder yang ada

![Sub Folder Repository Arul](D:\Kuliah\MSIB\ALTERA\TUGAS\qe_arul-budi-kalimat\2_Version_Control_(GIT)\Screenshot\SP1_S3.png)

4. Melakukan Commit

JAWABAN : Tahapan Commit And Push ini saya lakukan menggunakan Intellij Idea. sebelum itu lakukan terlebih dahulu control git

"git remote add origin https://github.com/RsTi3/qe_arul-budi-kalimat.git".

Lalu memilih beberapa file yang ingin di commit, lalu berikan Commit Message, lalu commit and push.

![Commit Arul](D:\Kuliah\MSIB\ALTERA\TUGAS\qe_arul-budi-kalimat\2_Version_Control_(GIT)\Screenshot\SP1_S4.jpg)

### Soal Prioritas 2

1. Buatlah branch baru pada github yang kalian buat

JAWABAN : saya membuat branch yang bernama develop

![branch Arul](D:\Kuliah\MSIB\ALTERA\TUGAS\qe_arul-budi-kalimat\2_Version_Control_(GIT)\Screenshot\SP2_S1.jpg)

2. Lakukan Pull Request pada branch tersebut sehingga akan menambah hal baru pada branch main/master . terdapat foto terkait Pull Request

JAWABAN : untuk melakukan pull request pada branch tersebut, harus membuat sebuah perbedaan dari branch develop dan master. maka dari itu saya akan memberikan contoh yang sederhana.

- 1- Buatlah file berformat markdown bebas namanya apa. saya membuat contoh seperti di gambar dibawah ini. lalu klik saja commit new file.

![Commit Arul](D:\Kuliah\MSIB\ALTERA\TUGAS\qe_arul-budi-kalimat\2_Version_Control_(GIT)\Screenshot\SP2_S2-1.jpg)

- 2- sesudah membuat file markdown di tahapan 1, masuk ke menu pull request > lalu new pull request seperti gambar dibawah

![new pull Arul](D:\Kuliah\MSIB\ALTERA\TUGAS\qe_arul-budi-kalimat\2_Version_Control_(GIT)\Screenshot\SP2_S2-2.jpg)

- 3- pastikan compare nya branch yang baru dibuat yaitu develop , untuk base nya itu main. Nanti akan terlihat hasil file markdown yang kita telah buat . lalu create pull saja

![new pull Arul](D:\Kuliah\MSIB\ALTERA\TUGAS\qe_arul-budi-kalimat\2_Version_Control_(GIT)\Screenshot\SP2_S2-3.jpg)

- 4- lalu disini akan membuat commit message lalu klik saja pull request

![newpull Arul](D:\Kuliah\MSIB\ALTERA\TUGAS\qe_arul-budi-kalimat\2_Version_Control_(GIT)\Screenshot\SP2_S2-4.jpg)

- 5- lalu akan masuk ke menu baru, disini sebelum mengklik merge pull request, sistem akan medeteksi terlebih dahulu apakah ada conflict dari branch develop ke main? jika tidak ada maka akan bisa klik merge pull request.

![Commit Arul](D:\Kuliah\MSIB\ALTERA\TUGAS\qe_arul-budi-kalimat\2_Version_Control_(GIT)\Screenshot\SP2_S2-5.jpg)

- 6- ketika sudah mengklik pull request di tahapan ke 5, branch sudah di pull merged. kalian diberi opsi untuk menghapus branch develop ini (namun saya tidak menghapusnya untuk sebagai bukti saja)

![Commit Arul](D:\Kuliah\MSIB\ALTERA\TUGAS\qe_arul-budi-kalimat\2_Version_Control_(GIT)\Screenshot\SP2_S2-6.jpg)

- 7- lalu kita lihat hasilnya di branch main. file yang kita buat di branch develop masuk ke folder yang ditentukan kita.

dengan project terserah kalian, praktikkan salah satu workflow serderhana dan buktikan dengan Screenshoot. github flow/gitflow/trunkbase

### Soal Eksplorasi

1. dengan project terserah kalian, praktikkan salah satu workflow serderhana dan buktikan dengan Screenshoot. github flow/gitflow/trunkbase

JAWABAN : karena untuk menampilkan gitflow trunkbase (atau network) harus membuat repo baru yang public, kalau tugas utama repo github itu private tidak bisa melihat gitflow (bisa dengan membuat akun kita menjadi pro). maka saya akan membuat repository baru saja.

![Commit Arul](2_Version_Control_(GIT)/Screenshot/SE_-S1.jpg)

Lalu gambar dibawah ini menjelaskan flow pengerjaan flow saya. dari berbagai branch push pull.

![Commit Arul](D:\Kuliah\MSIB\ALTERA\TUGAS\qe_arul-budi-kalimat\2_Version_Control_(GIT)\Screenshot\SE_S1.jpg)

2. lakukan management konflik pada github

JAWABAN : saya membuat 2 file markdown dengan nama file yang sama namun isi yang berbeda.

Ini yang ada di branch develop
![Commit Arul](D:\Kuliah\MSIB\ALTERA\TUGAS\qe_arul-budi-kalimat\2_Version_Control_(GIT)\Screenshot\SE_S2-1.jpg)

ini yang ada di main
![Commit Arul](D:\Kuliah\MSIB\ALTERA\TUGAS\qe_arul-budi-kalimat\2_Version_Control_(GIT)\Screenshot\SE_S2.jpg)


lalu saya ingin nge pull dari branch develop ke branch main

![Commit Arul](D:\Kuliah\MSIB\ALTERA\TUGAS\qe_arul-budi-kalimat\2_Version_Control_(GIT)\Screenshot\SE_S2-2.jpg)

selanjutnya akan muncul conflict... bahwa file ada kesalahan. kita  lakukan resolve conflict

![Commit Arul](D:\Kuliah\MSIB\ALTERA\TUGAS\qe_arul-budi-kalimat\2_Version_Control_(GIT)\Screenshot\SE_S2-3.jpg)

lalu disini akan muncul code yang membuat conflict. kita bisa memilih mau code yang dari branch main atau branch develop

![Commit Arul](D:\Kuliah\MSIB\ALTERA\TUGAS\qe_arul-budi-kalimat\2_Version_Control_(GIT)\Screenshot\SE_S2-4.jpg)

saya lebih memilih memasukan kedua code, lalu mark complete

![Commit Arul](D:\Kuliah\MSIB\ALTERA\TUGAS\qe_arul-budi-kalimat\2_Version_Control_(GIT)\Screenshot\SE_S2-5.jpg)

lalu commit

![Commit Arul](D:\Kuliah\MSIB\ALTERA\TUGAS\qe_arul-budi-kalimat\2_Version_Control_(GIT)\Screenshot\SE_S2-6.jpg)

lalu kita pull saja

![Commit Arul](D:\Kuliah\MSIB\ALTERA\TUGAS\qe_arul-budi-kalimat\2_Version_Control_(GIT)\Screenshot\SE_S2-7.jpg)

kita bisa lihat di branch main nama file readmeconflict.md bisa di akses

![Commit Arul](D:\Kuliah\MSIB\ALTERA\TUGAS\qe_arul-budi-kalimat\2_Version_Control_(GIT)\Screenshot\SE_S2-8.jpg)

3. Lakukan code review pada github yang kalian kumpulkan.

JAWABAN : saya melakukan code review  pada tugas resume section 1.

disini kita bisa melihat line 1 ada teks "# (1) Software Testing as a Career Path & Intro to Testing" 
![Commit Arul](D:\Kuliah\MSIB\ALTERA\TUGAS\qe_arul-budi-kalimat\2_Version_Control_(GIT)\Screenshot\SE_S3.jpg)

ketika saya lihat pada hasilnya itu adalah sebuah markdown
![Commit Arul](D:\Kuliah\MSIB\ALTERA\TUGAS\qe_arul-budi-kalimat\2_Version_Control_(GIT)\Screenshot\SE_S3-1.jpg)

atau contoh lain dari code review ini, ketika saya melihat conflict pada  branch develop dan branch main di soal eksplorasi nomor 2
![Commit Arul](D:\Kuliah\MSIB\ALTERA\TUGAS\qe_arul-budi-kalimat\2_Version_Control_(GIT)\Screenshot\SE_S2-4.jpg)

disini kita bisa me'review codingan kita, dimanakah letak errornya dsb.

# (2) Version Control Git

---

### Poin Pertama

Versioning adalah suatu cara mengetur versi dari sebuah source code program, masalah yang sering kita hadapi dalam keseharian yakni Contohnya pembuatan laporan. Kita sering membuat berbagai versi revisi dari sebuah laporan REVISI.DOC > REVISIFIX.DOC > REVISIFIXFINAL.DOC > REVISIFIXFINALLAST.DOC . Maka dengan adanya Versioning kita memudahkan maan file yang terbaru dan terlama

>Revisi memang harus dilakukan, jangan berekspektasi sebuah kode itu sempurna

Ada beberapa TOOLS yang dipakai yakni 

- Version Control System (VCS)
- Source Code Manager (SCM)
- Revision Control System (RCS)

Namun saat ini kita hanya membahas VCS saja. VCS dibagi menjadi 3 tipe adalah dibawah ini :

1. Single User

- SCCS - 1972 Unix Only
- RCS - 1982 Cross Platform, Text Only
2. Centralized

- CVS - 1986 File Focus
- Perforce - 1995
- Subversion - 2000 - track directory structure
- Microsoft Team Foundation Server - 2005
3. Distributed

- **Git - 2005**
- Mercurial - 2005
- Bazaar - 2005

Untuk tipe VCS ini kita akan membahas aplikasi GIT. GIT merupakan satu dari berbagai Version Control System yang populer, digunakan para developer untuk mengembangkan software secara bersama-sama.

> GIT diciptakan oleh *Linus Torvalds (2005)*

Lalu kenapa semua orang harus tersinkronasi terhadap remote server ?, agar kita bisa mengakses file repositori (Folder Project) secara bersama-sama di server. 

Git bisa melacak setiap perubahan files, ketika kamu merubah, Direktur merubah file, rekan kerja merubah files. SEMUANYA akan terdeteksi. GIT bisa melakukan undo sebuah point yang dipanggil commit, Commit adalah histori semua perubahan.

Memang sedikit rumit ketika kita meng'setup git server, karena kita membutuhkan layanan di server.

Inilah langkah untuk instalisasi GIT

DI WINDOWS
![alt text](D:\Kuliah\MSIB\ALTERA\TUGAS\qe_arul-budi-kalimat\2_Version_Control_(GIT)\Screenshot\resume_2.jpg)

DI LINUX
![alt text](D:\Kuliah\MSIB\ALTERA\TUGAS\qe_arul-budi-kalimat\2_Version_Control_(GIT)\Screenshot\resume_3.jpg)

DI MAC
![alt text](D:\Kuliah\MSIB\ALTERA\TUGAS\qe_arul-budi-kalimat\2_Version_Control_(GIT)\Screenshot\resume_1.jpg)

Source gambar diatas diambil dari [Materi – Versioning Control with Git ](https://alta.id/courses/be-the-best-top-search-quality-engineer/33213/)

---

### Poin Kedua

Sesudah menginstal GIT, kalian harus melakukan beberapa tahapan untuk menggunakan GIT dan beberapa sintaks yang disediakan

- SETTING UP : GET INIT, CLONE, CONFIG

GET CONFIG : Untuk memperoleh informasi dan menetapkan variable konfigurasi yang mengontrol segala aspek bagaimana git beroperasi

#git config

$ git config --global user.name " John Done "

$ git config --global user.email "johndoe@email.com"

$ git config --list

GIT INIT : digunakan untuk membuat repositori di file lokal.

#start with init

$ git init

$ git remote add <remote_name> <remote_repo_url>

$ git push -u <remote_name> <local_branch_name>

GIT CLONE : perintah dasar untuk membuat salinan repositori lokal.

#start with existing project, start working on the project

$ git clone ssh://jphn@example.com/path/to/my-project.git

$ cd my-project

- SAVING CHANGES : GIT STATUS, ADD, COMMIT

GIT STATUS : Digunakan untuk mengetahui sebuah status dari sebuah repositori lokal.

$ git status

GIT ADD : perintah yang digunakan untuk menambahkan file baru di repositori yang dipilih.

$ git add <directory_folder>

$ git add hello.py

$ git add.

GIT COMMIT : digunakan untuk menyimpan perubahan yang sudah dilakukan, namun tidak ada perubahan yang terjadi pada remote repository.

$ git commit -m "add config file"

SEMANTIC COMMIT MESSAGE

Lihat betapa kecilnya perubahan pada commit message style kamu, bisa membuat menjadi seorang programmer yang baik 

- feat: (new feature for the user, not a new feature for build script)
- fix: (bug fix for the user, not a fix to a build script)
- docs: (changes to the documentation)
- style: (formatting, missing semi colons, etc; no production code change)
- refactor: (refactoring production code, eg. renaming a variable)
- test: (adding missing tests, refactoring tests; no production code change)
- chore: (updating grunt tasks etc; no production code change)

REFERENSI [Semantic Commit Messages](https://gist.github.com/joshbuchea/6f47e86d2510bce28f8e7f42ae84c716)

- GIT DIFF AND STASH

GIT DIFF :  perintah Git yang memungkinkan Anda untuk membandingkan perbedaan antara konten file dan mengedit file antar revisi menggunakan alat diff umum.

#git diff , change file, add staging area

$ git diff --staged

GIT STASH : suatu tempat dimana kamu ingin menyimpan semua kode kamu yang belum selsai di kerjakan untuk di commit.

#stashing your work

$ git stash

#re-applying your stashed changes

$ git stash apply

- FILE .gitignore

Git Ignore adalah suatu file di dalam github yang disimpan dengan nama .gitignore dimana fungsinya untuk mengatur pada saat kita push maka path file yang terdaftar di dalamnya tidak akan ikut di commit.

- INSPECTING REPOSITORY : GIT LOG, CHECKOUT

GIT LOG : git log berfungsi untuk melihat riwayat atau history perubahan pada project.

#melihat histori revisi terdahulu
$ git log --oneline

#A melanjutkan membuat hal yang gila
#B mencoba hal gila
#C mencobamerubah hal yang penting pada file hello.txt

$ git checkout C

- GIT RESET

GIT RESET : merupakan perintah yang dapat digunakan untuk membatalkan perubahan yang dilakukan.

Perintah GIT RESET ada 3 argumen atau opsi yakni soft, mixed, hard :

1. Soft : akan mengembalukan dengan kondisi file dalam keadaan staged. biasanya diketik --soft
2. Mixed akan mengembalikan dengan kondisi file dalam keadaan modified. biasanya diketik --mixed
3. Hard : akan mengemlikan dengan kondisi file dalam keadaan commited. biasanya diketik --hard

Referensi yang saya ambil bisa dilihat link yang saya tautkan dibawah [petanikode.com : Tutorial Git #8: Perbedaan Git checkout, Git Reset, dan Git Revert](https://www.petanikode.com/git-checkout-reset-revert/)

#melihat histori revisi terdahulu
$ git log --oneline

#A melanjutkan membuat hal yang gila
#B mencoba hal gila
#C mencobamerubah hal yang penting pada file hello.txt

$ git reset C --soft

- GIT PUSH, FETCH & PULL, REMOTE

GIT REMOTE : adalah petunjuk ke versi repositori yang biasanya disimpan di server lain.

#git remote

$ git remote -v

$ git remote add origin https://dev.example.com/john.git

GIT FETCH & PULL : Git Pull menyalin konten dari remote repositori dan juga langsung menggabungkan komit baru ke dalam working directory. Git Fetch adalah perintah yang hanya menyalin atau mengunduh konten dari remote repositori ke repositori lokal. Akan tetapi tidak langsung menggabungkan ke komit baru.

#Fetch & Pull

$ git fetch

$ git pull origin master

GIT PUSH : Perintah yang digunakan untuk mentransfer perubahan file ke repository jarak jauh setelah melakukan perubahan.

#push

$ git push origin master

$ git push origin feature/login-user

- GIT BRANCHING

Secara sederhana GIT Branch adalah membuat repository kalian menjadi beberapa versi, jadi untuk membuat alur bagi evolusi dari repositori.

#show all branch

$ git branch --list

#create a new branch called <branch>

$ git branch <branch>

#force delete the specified <branch>

$ git branch -D <branch>

#list remote branch

$ git branch -a

- GIT MERGE

fitur yang terdapat dalam sistem version control Git yang berfungsi untuk menggabungkan perubahan yang terdapat dalam dua atau lebih branch atau cabang repository.

#start a new feature

$ git checkout -b new-feature master

#edit some files

$ git add <file>

$ git commit -m "start a Feature"

#Edit some file

$ git add <file>

$ fit commit -m "Finish a Feature"

#Merge in the new-feature branch

$ git checkout master

$ git merge new-feaature

$ git branch -d new-feature

- PULL REQUEST

Pull request yang dilakukannya saat ingin berkontribusi dalam suatu project atau repository di Github. Kontribusi tersebut dengan menambahkan fiturnya atau memperbaiki bug dalam suatu project. Perintah Git pull akan menentukan commit terbarunya secara otomatis.

---

### Poin Ketiga

WorkFlow Collaboration dapat diartikan alur kerja kolaboratid adalah konvergensi perangkat linak sosial dengan perangkat lunak manajemen layanan. Sesuai dengan definisinya, alur kerja kolaboratif berasal dari perangkat linak alur kerja dan perangkat lunak sosial seperti obrolan, pesan instan, dan kolaborasi dokumen

Referensi saya ambil di [Wikipedia : Collaborative Workflow](https://en.wikipedia.org/wiki/Collaborative_workflow)

Lalu bagaimana cara kita bisa mengoptimalisasikan kolaborasi dalam development ? karena dalam kolaborasi dalam tim kita tidak bisa bekerja dalam 1 branch saja (bergantung terhadap branch master). Perlu dibuat beberapa branch agar pekerjaan kolaborasi dapat berjalan dengan optimal

1. BUAT BRANCH DEVELOP DARI BRANCH MASTER

Ketika kita ingin membuat branch baru pastikan kita membuat dari branch utama (master)

$ (master) git branch development

$ (master) git checkout development

2. Hindari Direct Edit ke Branch DEVELOP

Ketika kita ingin merubah file jangan direct edit (mengedit langsung) ke branch development, maka lakukanlah branching lagi contoh branch feature

$ (development) git branch feature 1

$ (development) git  feature 1 checkout

3. MERGE BRANCH FEATURE HANYA KE BRANCH DEVELOPMENT

Jika pengembangan feature sudah selesai dan jika ingin di merge maka merge ke branch feature.

$ (feature) git checkout development

$ (development) git merge feature1

4. MERGE BRANCH DEVELOPMENT KE BRANCH MASTER JIKA SELESAI DEVELOPMENT

Jika tahapan development selesai, maka merge branch development ke branch master.

$ (master) git merger development

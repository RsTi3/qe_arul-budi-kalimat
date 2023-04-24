# Materi 1 : Fundamental Performance Test

---

## Materi 1 : Web Programming

### Poin Pertama

Performance Test adalah Teknik non functional Testing untuk menentukan parameter sistem dalam hal responsif dan stabilitas dibawah berbagai beban (load) kerja.

Performance tetsing juga mengukut kualitas atribut dari sistem seperti Stabilitas, Ketahanan (Reability) dan penggunaan Sumber Daya.

Dalam Performance Test ada beberapa hal yang akan diukur yakni :

- Performa suatu aplikasi sampai suatu batas tertentu.
- Bukan merupakan functional Test.
- Bisa dalam berbagai macam bentuk memahami reliability, stability, availability pada enviroment nya. CONTOHNYA : 1. Mengamati response time ketika menjalankan request dalam jumlah yang sangat banyak, 2. Melihat suatu sistem berinteraksi dengan jumlah data yang cukup besar.


### Poin Kedua

Pada umumnya performance testing cukup mahal untuk diaplikasikan dan dijalankan, Namun dapat dijadikan tolak ukur apakah sistem tersebut dapat mengakomodasi traffic yang ada. Hal ini disebabkan karena pengetesannya memerlukan persiapan yang dimana dalam beberapa kasus itu harus membuat environment terpisah dari production agar tidak tercampurnya data test dengan data production. Environment ini ada juga yang membuatnya di server cloud yang biayanya bisa lebih besar dari environment production. Jadi itu mengapa performance test jarang dilakukan.

Ada beberapa yang harus diperhatikan dari Performance Test, biasanya yang menjadi perhatian adalah Throughput dan ResponseData nya

Untuk sebuah contoh kasus dari performance test ada sebuah sistem yang akan launch ke production, namun sebelum masuk ke production perlu dilakukan performance test untuk mengetahui throughput dan response time dari sistem tersebut.

Contoh EndPoint yang akan di test :
1. Login
2. Beli-Pulsa
3. Cek-Out

lalu ini adalah contoh kasus performance test yang harus dilakukan :
1. Membuat Test Plan
2. Membuat Script Test
3. Melakukan Performance Test
4. Menganalisa Hasil Performance Test

Membuat Test Plan :

Kenali apa saja yang dibutuhkan :

- End Point Yang akan di test : 1. Login, 2. Beli Pulsa, 3. Cek Out.
- Kebutuhan Masing-Masing EndPoint : 1. Username dan password untuk endpoint / login, 2. Produk, denom dan nomor untuk pengetesan untuk endpoint beli pulsa, 3. Metode pembayaran yang dipilih untuk endpoint cek out.

Menentukan Metode Test :

- Pilih berdasarkan kondisi sistem apakah belum pernah di test atau sudah.
- Selalu awali dengan load test untuk tahu kondisi awal sistem.
- Pilih berdasarkan situasi yang akan dihadapi.

### Poin Ketiga

Jenis-Jenis Performance Testing :

- Smoke Testing : Dilakukan untuk verify cript yang sudah dibuat, apakah sistem tersebut dapat menghandle minimal load, tanpa masalah sama sekali. Biasanya Hanya 1-2 VUs.
- Load Testing : Adalah pengujian yang paling sederhana yang dimana dilakukan untuk memahami perilaku sistem dalam keadaan beban tertentu. Hasil dari load test digunakan untuk mengukur kepentingan bisnis saat transaksi yang kritis dengan memonitor dampak terhadap database, Application server atau pendukung lainnya. Sederhananya load testing menentukan kelakuan sistem pada saat kondisi normal dan puncak. Idealnya kita mengetahui jumlah traffic yang ada pada periode itu sebagai nilai test.

| Tier   | Fungsi                        | Threads                | Notes                             |
|--------|-------------------------------|------------------------|-----------------------------------|
| Tier 1 | Response Time < 220 MS        | 95% - 100% From Target | (10% only, Very Good)             |
| Tier 2 | Response Time 220 MS - 324 MS | 85% - 94% From Target  | (20% only, Good)                  |
| Tier 3 | Response Time 324 MS - 912 MS | 65% - 84% From Target  | (Average, Mostly 615 ms)          |
| Tier 4 | Response Time 912 MS - 1500MS | 50% - 64% From Target  | (bad, mostly 1,1 sec)             |
| Tier 5 | Response Time > 1500 MS       | Under 50% From Target  | (worst, mostly more than 1,5 sec) |

- Stress Testing : Metode ini untuk dilakukan untuk mengamati kemampuan dan kestabilan sistem pada saat kondisi ekstrem. Dilakukan bertahap menuju load normal, puncak, dan melebihinya, lalu turun untuk melihat proses recovery.
- Spike Testing : Seperti Stress Test, namun kenaikan langsung melebihi puncak yang dilakukan dalam waktu yang sangat singkat. Jika stress test memberikan waktu untuk scale out, namun pada spike testing tidak. Salah satu contoh adalah pada saat flash sale di suatu e-commerce, yang dimana banyaknya kunjungan pengguna yang langsung memuncak saat mengakses halaman flash sale.
- Soak Testing : Untuk mengetahui realibility ketika dalam tekanan dibawah puncak dalam jangka panjang (>=1 Jam). Dapat mengetahui apakah terdapat bug pada race condition, memory leaks, db connection dsb. TIPS : Metode ini bisa dilakukan paada jam-jam sepi tidak ada transaksi pada sistem jika test dilakukan di production.
-  Endurance Testing : Testing yang menganalisis behaviour atau performa sistem dengan load yang normal namun dalam jangka waktu yang panjang. Pengujian ini dilakukan untuk menghindari terjadinya kebocoran memori (Memory Leak).

Dibawah ini ada beberapa istilah penting dalam performance test: 

| System Under Test (SUT) |                              Sebutan untuk sistem yang sedang dilakukan test                              | 
|-------------------------|:---------------------------------------------------------------------------------------------------------:|
| Load Generator          |                         Sebutan untuk server yang digunakan untuk membuat request                         |
| Throughput              |      Satuan kerja dalam satuan waktu. Misalnya Request Per Second (RPS) dan Request Per Minute (RPM)      |
| Performance Treshold    |      Target maksimal nilai yang diperbolehkan, misalnya response time 2 detik, max CPU Usage 70% dsb      |
| Saturation              |   Kondisi dimana SUT atau Load Generator sudah dalam kondisi maksimum dalam merespon atau mengenerate.    |
| Virtual Users           | Simulasi dari users yang melakukan pengujian, dapat melakukan satu atau lebih requests dalam satu iterasi |
| Response Time           |                          Lama waktu pengiriman request hingga menerima response.                          |


---

## Materi 2 : Performance Testing With JMeter (Tidak dikerjakan karena optional)

### Poin Pertama



### Poin Kedua



### Poin Ketiga


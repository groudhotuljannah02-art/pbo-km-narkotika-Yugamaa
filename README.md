pbo-km-narkotika-Yugamaa
Knowledge Management System Putusan Pengadilan Narkotika berbasis Java OOP dan MVC
KNOWLEDGE MANAGEMENT SYSTEM (KMS) – PUTUSAN PENGADILAN NARKOTIKA

Tugas Besar Pemrograman Berorientasi Objek (PBO
Kelas: B

1. Deskripsi Proyek

Aplikasi ini merupakan Knowledge Management System (KMS) berbasis command-line yang dikembangkan menggunakan Java JDK 11 atau versi yang lebih baru dengan menerapkan pola arsitektur Model-View-Controller (MVC). Sistem ini dirancang untuk mengelola data putusan pengadilan pada kasus narkotika.

Beberapa fitur yang tersedia dalam aplikasi ini meliputi:

* Menambahkan data putusan baru dengan proses validasi terhadap format input maupun aturan bisnis, misalnya memastikan berat barang bukti bernilai lebih dari 0 gram.
* Menampilkan seluruh data putusan yang telah tersimpan dalam sistem.
* Melakukan pencarian data berdasarkan Nomor Perkara atau Nama Terdakwa.
* Menyaring data berdasarkan Jenis Narkotika maupun Pengadilan.
* Menangani kesalahan input menggunakan mekanisme *exception handling* (try-catch) sehingga program tetap berjalan meskipun pengguna memasukkan data yang tidak sesuai. Pengguna akan diminta mengulang pengisian data yang salah.

Data putusan yang dikelola memiliki atribut sebagai berikut:

* nomorPerkara
* pengadilan
* tanggalPutusan
* namaTerdakwa
* umurTerdakwa
* jenisNarkotika
* beratBarangBukti
* pasalDilanggar
* peranTerdakwa
* vonisHukuman
* vonisDenda
* namaHakim

Pada saat aplikasi dijalankan pertama kali, sistem akan langsung memuat 55 data putusan yang telah disiapkan di dalam program sebagai data awal untuk keperluan pengujian maupun demonstrasi.

Pembagian tugas dalam pengembangan aplikasi mengikuti konsep MVC, yaitu:

  bertugas merepresentasikan struktur data putusan melalui kelas Putusan beserta atribut-atributnya.
  bertanggung jawab terhadap tampilan menu dan interaksi pengguna melalui terminal.
  Controller berfungsi menghubungkan Model dan View, sekaligus menangani proses validasi, pencarian, serta penyaringan data.



2. Cara Kompilasi

Kompilasi merupakan proses mengubah file sumber (`.java`) menjadi file bytecode (`.class`) agar dapat dijalankan oleh **Java Virtual Machine (JVM)**.

Opsi A – Melalui Terminal

Jalankan perintah berikut dari folder utama (*root project*):

bash
javac -d bin src/model/*.java src/view/*.java src/controller/*.java src/Main.java

Apabila struktur folder pada project berbeda, sesuaikan lokasi file dengan struktur yang digunakan.

Opsi B – Menggunakan IDE

1. Buka project melalui menu **File > Open**, kemudian pilih folder project.
2. Pastikan project menggunakan **JDK versi 11 atau lebih baru** melalui **File > Project Structure > SDK**.
3. Pilih menu **Build > Build Project** untuk melakukan proses kompilasi.


3. Cara Menjalankan Program

Melalui Terminal

Setelah proses kompilasi selesai, jalankan perintah berikut:

bash
java -cp bin Main

Melalui IDE

Klik kanan pada file Main.java, kemudian pilih Run 'Main.main()', atau tekan tombol Run yang tersedia pada IDE.

Saat aplikasi berhasil dijalankan, akan muncul informasi bahwa 55 data putusan berhasil dimuat, kemudian sistem menampilkan menu utama seperti berikut:

1. Tambah Data Putusan
2. Tampilkan Semua Data
3. Cari Data (Nomor Perkara / Nama Terdakwa)
4. Filter Data (Jenis Narkotika / Pengadilan)
5. Keluar
Pilih menu:


4. Video Demonstrasi

Video demonstrasi aplikasi yang memperlihatkan seluruh alur penggunaan sesuai ketentuan tugas dapat diakses melalui tautan berikut:

**[ISI LINK VIDEO DI SINI]**

5. Daftar Anggota Kelompok
                              
1  Ghina Roudhotul Jannah 202510370110029 Model – branch           
2  Muhammad Rizki Adji Yudha 202510370110008 View – branch              
3  Marcello Airlangga Saputra 202510370110035 Controller – branch  

Kelas: B

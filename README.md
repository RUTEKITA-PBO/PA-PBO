# RUTE KITA🚌

![image](https://github.com/user-attachments/assets/08d0fd55-c630-46d3-921f-d44b509e79e2)


**Latar Belakang**
    Berdasarkan penelitian terkait dengan evaluasi kinerja pelayanan angkutan kota di Samarinda, dapat disimpulkan bahwa kondisi angkutan umum khususnya trayek B masih memerlukan banyak perbaikan. Evaluasi yang dilakukan menggunakan metode analisis skoring menunjukkan bahwa kinerja operasional seperti headway (interval antar kendaraan), waktu pelayanan, dan frekuensi kendaraan masih tergolong rendah. Hasil analisis ini menunjukkan adanya ketidakefisienan dalam manajemen angkutan kota yang berdampak langsung pada kepuasan penumpang (Arif Nugroho et al., 2022).
   Penurunan jumlah pengguna angkutan kota dari tahun 2016 hingga 2018 sebesar 74% semakin memperkuat bukti bahwa masyarakat merasa kurang puas dengan kualitas pelayanan yang diberikan. Faktor-faktor seperti kenyamanan, keamanan, dan ketepatan waktu menjadi aspek utama yang perlu ditingkatkan. Rekomendasi perbaikan yang diajukan dalam penelitian termasuk peremajaan armada, pengaturan jadwal yang lebih teratur, dan peningkatan fasilitas prasarana seperti halte dan signage yang memadai.
    Oleh karena itu, Dinas Transportasi Kota Samarinda berencana mengembangkan aplikasi berbasis Java dengan GUI menggunakan Java Swing untuk meningkatkan efisiensi manajemen penjadwalan transportasi umum. Aplikasi ini akan berperan sebagai solusi digital untuk mempermudah akses informasi jadwal dan ketersediaan bus. Aplikasi dirancang untuk dua peran utama yaitu admin dan pengguna umum. Admin bertanggung jawab mengelola jadwal dan rute bus (CRUD), sementara pengguna dapat melihat jadwal.
    Melalui pemantauan jadwal secara real-time, aplikasi ini diharapkan meningkatkan efisiensi operasional, mendukung kelancaran layanan transportasi, dan memberikan kemudahan bagi penumpang dalam mengakses informasi. Dengan ini, Dinas Transportasi Kota Samarinda berharap bisa mencapai pengelolaan transportasi yang lebih terstruktur dan efisien, demi kualitas layanan yang lebih baik.





**ROLE ADMIN**

1.**Landing Page**

   
Halaman awal yang ditampilkan saat admin mengakses aplikasi. Halaman ini memberikan opsi untuk login sebagai admin dan menampilkan informasi singkat tentang sistem.
![image](https://github.com/user-attachments/assets/a43b89ad-fdc2-4491-85c1-2b3ff30d2df5)

2.**Login**


Menu login bagi admin untuk masuk ke dalam sistem. Admin perlu memasukkan username dan password yang valid. Sistem akan melakukan pengecekan apakah email dan password yang dimasukkan sudah terdaftar di database. Jika benar, sistem akan mengarahkan ke dashboard. Jika salah, pesan error akan ditampilkan.
  ![image](https://github.com/user-attachments/assets/b489b8b3-e6b4-42ea-8a32-041173f38e5c)

3.**Dashboard**


Halaman utama yang menampilkan berbagai menu yang dapat dipilih oleh admin.


a.	 **Pengelolaan Tambah Data Jadwal**


Admin dapat menambah data jadwal baru dengan memasukkan informasi seperti nama halte tempat keberangkatan dimulai, nama halte tempat keberangkatan berakhir, waktu keberangkatan, dan waktu tiba di halte tujuan. 
![image](https://github.com/user-attachments/assets/1dcad72c-4009-48bf-89f1-7242d642fd04)

b.	**Pengelolaan Lihat Data Jadwal**


Admin dapat melihat daftar seluruh jadwal yang sudah terdaftar dalam sistem.
![image](https://github.com/user-attachments/assets/f309bfe4-9c8b-4323-b1bd-7d38fe30244f)

c.	**Pengelolaan Update Data Jadwal**


Admin dapat mengedit informasi jadwal, seperti memperbarui halte keberangkatan, halte tujuan, waktu keberangkatan, atau waktu tiba jika terjadi perubahan.

![image](https://github.com/user-attachments/assets/de55445d-7ae6-499a-8e6d-6d59e3926527)

d.	**Pengelolaan Hapus Data Jadwal**


Admin dapat menghapus data jadwal yang tidak lagi diperlukan.
![image](https://github.com/user-attachments/assets/55dc98d6-1ccb-4172-9371-54ece12ee114)

e.  **Log Out**
Menu untuk mengakhiri sesi login admin.


![image](https://github.com/user-attachments/assets/efe80a66-8bfe-4a90-87fa-003c45a96f81)



**ROLE PENGGUNA**






1.	**Landing Page**

   
Halaman awal yang ditampilkan saat pengguna mengakses aplikasi. Halaman ini memberikan opsi untuk login sebagai pengguna dan menampilkan informasi singkat tentang sistem.

![image](https://github.com/user-attachments/assets/a567bf89-f18d-404b-82f8-458a21572047)

2.	**Register**

   
Menu registrasi untuk mendaftar akun baru bagi pengguna. Pengguna perlu memasukkan informasi seperti username, email, dan password. Sistem akan memeriksa apakah email sudah terdaftar sebelumnya. Jika sudah terdaftar, sistem akan menampilkan pesan error. Jika belum terdaftar, akun baru akan dibuat.


![image](https://github.com/user-attachments/assets/eacacba4-4684-4afe-b421-19a6b517a151)

3.	**Login**

   
Menu login untuk pengguna melakukan login dengan memasukkan username dan password yang terdaftar. Sistem akan mengecek apakah email dan password sudah terdaftar. Jika sudah terdaftar, sistem akan mengarahkan ke dashboard. Jika belum terdaftar, pesan error akan ditampilkan.

![image](https://github.com/user-attachments/assets/a2a1134e-e1c6-4d92-98db-574709593e70)

4.	**Dashboard**

   
Halaman utama bagi pengguna untuk mengakses berbagai fitur yang tersedia pada sistem, yaitu menu sorting dan searching.

a.	**Sorting Nama Halte dan Waktu Keberangkatan**


Menu untuk mengurutkan jadwal berdasarkan daftar halte dan waktu keberangkatan dari yang paling awal atau paling akhir,

![image](https://github.com/user-attachments/assets/2bee5896-84ef-4dff-b7c4-1c8796ae9ab7)


                                        Keberangkatan Awal

![image](https://github.com/user-attachments/assets/bc73cd97-738d-4ae7-8932-18b79ccd74f3)


                                        Keberangkatan Akhir

b.	**Searching Halte Awal dan Halte Tujuan**


Menu untuk mencari data jadwal berdasarkan halte keberangkatan, halte tujuan dan waktu keberangkatan sesuai dengan kebutuhan perjalanan pengguna.

![image](https://github.com/user-attachments/assets/82295b11-fd82-464e-8d55-7d3566776d14)


                                   Halte Keberangkatan



![image](https://github.com/user-attachments/assets/340bf24e-988a-4ee0-bf35-2b34609525dc)


                                   Halte Tujuan


5.	**Log Out**

   
Menu untuk mengakhiri sesi login pengguna.


![image](https://github.com/user-attachments/assets/efe80a66-8bfe-4a90-87fa-003c45a96f81)























 

# DealerMobil
Proyek Akhir Pemrograman Berbasis Objek 1

Deskripsi

Aplikasi ini adalah proyek akhir dari mata kuliah Pemrograman Berbasis Objek 1, dengan tema Dealer Mobil. Aplikasi dibuat menggunakan bahasa pemrograman Java berbasis teks (console), dan digunakan untuk mencatat serta menampilkan informasi mobil baru dan bekas.

Data mobil yang dimasukkan oleh pengguna disimpan dalam koleksi ArrayList, dan ditampilkan kembali dengan konsep polymorphism sesuai jenis mobil.

Konsep PBO yang Diterapkan

Berikut adalah penerapan setiap konsep OOP yang diminta dosen, disertai letak implementasinya:

1. Class

Mobil, MobilBaru, MobilBekas, Dealer, Main


2. Object

Dibuat saat user memasukkan data

Contoh: new MobilBaru(...), new MobilBekas(...)


3. Atribut

Mobil: merk, model, harga

MobilBaru: garansiTahun

MobilBekas: tahunProduksi


4. Constructor

Ada di semua class data untuk mengisi atribut saat object dibuat


5. Mutator (Setter)

Digunakan untuk mengubah nilai atribut, contoh: setMerk(), setHarga()


6. Accessor (Getter)

Digunakan untuk mengambil nilai atribut, contoh: getMerk(), getGaransiTahun()


7. Encapsulation

Semua atribut diset private

Diakses hanya melalui getter & setter


8. Inheritance

MobilBaru dan MobilBekas mewarisi Mobil dengan extends


9. Polymorphism

tampilInfo() di-override di MobilBaru dan MobilBekas

Dipanggil melalui Dealer.tampilSemuaMobil() menggunakan for-each


10. Seleksi

switch-case digunakan di Main untuk memilih menu


11. Perulangan

while(true) untuk menu utama

for-each di Dealer untuk menampilkan data mobil


12. IO Sederhana

Input: Scanner

Output: System.out.println()


13. Array

ArrayList<Mobil> di class Dealer menyimpan seluruh data mobil


14. Error Handling

try-catch di Main.java untuk menangani kesalahan input dari user


Cuplikan Kode

// Polymorphism di Dealer.java
public void tampilSemuaMobil() {
    for (Mobil mobil : daftarMobil) {
        mobil.tampilInfo(); // Memanggil versi sesuai objek
    }
}

Usulan Nilai

No	Materi	Nilai

1	Class	5
2	Object	5
3	Atribut	5
4	Constructor	5
5	Mutator	5
6	Accessor	5
7	Encapsulation	5
8	Inheritance	5
9	Polymorphism	10
10	Seleksi	5
11	Perulangan	5
12	IO Sederhana	10
13	Array	15
14	Error Handling	15
	TOTAL	100


Pembuat

Nama: Ade Bagus Pramana Saputra
NPM: 2310010373

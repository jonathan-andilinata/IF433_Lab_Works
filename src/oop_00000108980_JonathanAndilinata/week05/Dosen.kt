package oop_00000108980_JonathanAndilinata.week05

class Dosen (nama: String,val nidn: String): Pegawai(nama){
    override fun bekerja(){
        println("[$nama] sedang menyiapkan materi perkuliahan dan merivisi RKPS.")
    }

    fun mengajar(){
        println("[$nama] sedang mengajar mahasiswa di kelas")
    }
}
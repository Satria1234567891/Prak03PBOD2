/**
 * File : AngkaSial.java
 * Deskripsi : Program penggunaan exception buatan sendiri
 *             Pengenalan klausa 'throw' dan 'throws'
 */

 public class AngkaSial{

    public void cobaAngka(int angka) throws AngkaSialException{
        if(angka==13) {
            throw new AngkaSialException();
        }
        System.out.println(angka+" bukan angka sial");
    }

    public static void main(String[] args){
        AngkaSial as = new AngkaSial();
        try{
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        }catch(AngkaSialException ase){
            //method getMessage() telah ada pada kelas "Exception"
            System.out.println(ase.getMessage());
            System.out.println("hati-hati memasukkan angka!!!");
        }
    }
}

// Baris 12 tidak akan dieksekusi saat program menjalankan cobaAngka(13) yaitu yang kedua, karena 13 sama dengan 13, jadi dia langsung di throw dan program langsung jalan ke bagian catch dan error diprint, melewatkan baris 12. sementara itu setelah ini, baris ke 21 akan dieksekusi karena kondisinya terpenuhi(exception terjadi).
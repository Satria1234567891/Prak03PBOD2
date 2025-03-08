/**
 * File      : Asersi2.java
 * Deskripsi : Program untuk demo asersi, yang akan menolak input
 *             jari-jari lingkaran yang bernilai nol
 */

//class Lingkaran
class Lingkaran{
    private double jariJari;
    public Lingkaran(double jariJari){
        this.jariJari = jariJari;
    }

    public double hitungKeliling(){
        double keliling = 2*Math.PI*jariJari;
        return keliling;
    }
}

//class Asersi2
public class Asersi2{
    public static void main(String[] args){
        double jariJari = 0;
        assert(jariJari > 0):"jari jari tidak boleh nol!!!";
        Lingkaran l = new Lingkaran(jariJari);
        double kelilingLingkaran = l.hitungKeliling();
        System.out.println("keliling lingkaran = " 
                           + kelilingLingkaran);
    }
}

// Kesalahan : Asersi ada di tempat yang salah. pengecekan di program bahwa jari jari tidak boleh kurang dari 0 dilakukan setelah program telah membuat lingkaran, hal ini menyebabkan program jadinya tetap mencetak hasil bahkan jika nilai jari jari kurang dari 0, yang dimana hal ini tidak sesuai dengan logika matematika, dan tidak ada tulisan atau pengingat error kepada pengguna/pembuat jika error ini terjadi.

package P2.SistemBuku;

public class Buku26 {
    String judul;
    String pengarang;
    int halaman;
    int stok;
    int harga;

    void tampilkanInformasi() {
        System.out.println("Judul         : " + judul);
        System.out.println("Pengarang     : " + pengarang);
        System.out.println("Jumlah halamn : " + halaman);
        System.out.println("Sisa Stok     : " + stok);
        System.out.println("Harga         : Rp." + harga);
    }

    void terjual(int jml) {
        stok -= jml;
    }

    void restock(int jml) {
        stok = jml;
    }

    void gantiHarga(int hrg) {
        harga = hrg;
    }

}

package Kuis2_26_1F_Satrio;

public class PesananList26 {
    Pesanan26 head;

    public PesananList26() {
        head = null;
    }

    public boolean isEmpty() {
        if (head == null) {
            return true;
        }
        return false;
    }

    public void addLast(Pesanan26 pembeli) {
        if (isEmpty()) {
            head = pembeli;
        } else {
            Pesanan26 current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = pembeli;
            pembeli.prev = current;
        }
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Daftar pembeli kosong.");
        } else {
            // Cetak judul kolom sekali sebelum mencetak data
            System.out.printf("%-10s %-25s %-10s", "No ", "Nama Pesanan", "Harga");
            System.out.println();
            Pesanan26 current = head;
            while (current != null) {
                current.printPesanan();
                current = current.next;
            }
        }
    }

    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("Daftar pembeli kosong.");
        } else {
            String deletedJudul = head.namaPesanan;
            head = head.next;
            if (head != null) {
                head.prev = null;
            }
            System.out.println(deletedJudul + " Telah Memesan Menu ");
        }
    }

    public void removeLast() {
        if (isEmpty()) {
            System.out.println("Daftar pembeli kosong.");
            return;
        }

        Pesanan26 current = head;
        Pesanan26 prev = null;
        while (current.next != null) {
            prev = current;
            current = current.next;
        }
        if (prev == null) {
            // Only one element in the list
            head = null;
        } else {
            prev.next = null;
        }

        String deletedJudul = current.namaPesanan; // Simpan namaPesanan pembeli yang akan dihapus
        System.out.println("Data pembeli " + deletedJudul + " berhasil dihapus.");
    }

}

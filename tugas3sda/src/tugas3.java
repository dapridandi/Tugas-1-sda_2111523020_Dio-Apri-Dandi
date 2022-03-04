import java.util.LinkedList;

public class tugas3
{
    public static void main(String[] args) {
        LinkedList <String> nama_mahasiswa = new LinkedList<String>();
        LinkedList <String> no_bp = new LinkedList<String>();
        LinkedList <String> alamat = new LinkedList<String>();

        no_bp.add("2111523020");
        no_bp.add("2111523022");
        no_bp.add("2111523018");

        nama_mahasiswa.add("Dio Apri Dandi");
        nama_mahasiswa.add("Revi Putra Hernel");
        nama_mahasiswa.add("Arif Wahyudi");

        alamat.add("Jln. Ir Soekarno No.8");
        alamat.add("Jln. Melati No.20");
        alamat.add("Jln. Anggrek No.10");

        System.out.println("Output Data Mahasiswa : ");
        System.out.println("Nomor Induk Mahasiswa : " +no_bp);
        System.out.println("Nama Mahasiswa : " +nama_mahasiswa);
        System.out.println("Alamat Mahasiswa : " +alamat);
        System.out.println("");

        System.out.println("Output add Data Mahasiswa : ");
        //menambahkan data mahasiswa
        no_bp.addFirst("2111522016");
        no_bp.addLast("2111527002");
        System.out.println("Nomor Induk Mahasiswa : " +no_bp);

        nama_mahasiswa.addFirst("Alvino Albas");
        nama_mahasiswa.addLast("Irfan Wahendra");
        System.out.println("Nama Mahasiswa : " +nama_mahasiswa);

        alamat.addFirst("Jln. Ir. Moh.Hatta No.1");
        alamat.addLast("Jln. Mawar No.2");
        System.out.println("Alamat Mahasiswa : " +alamat);
        System.out.println("");

        System.out.println("Output remove Data Mahasiswa : ");
        //menghapus data mahasiswa
        no_bp.removeFirst();
        no_bp.removeLast();
        System.out.println("Nomor Induk Mahasiswa : " +no_bp);

        nama_mahasiswa.removeFirst();
        nama_mahasiswa.removeLast();
        System.out.println("Nama Mahasiswa : " +nama_mahasiswa);

        alamat.removeFirst();
        alamat.removeLast();
        System.out.println("Alamat Mahasiswa : " +alamat);
        System.out.println("");

        System.out.println("Output set Data Mahasiswa : ");
        //menyisipkan data mahasiswa
        no_bp.set(0,"2111522008");
        nama_mahasiswa.set(0,"Muhammad Satria Gemilang Lubis");
        alamat.set(0,"Jln. Hang Tuah No.10");
        System.out.println("Nomor Induk Mahasiswa : " +no_bp);
        System.out.println("Nama Mahasiswa : " +nama_mahasiswa);
        System.out.println("Alamat Mahasiswa : " +alamat);
        System.out.println("");

        System.out.println("Output get Data Mahasiswa : ");
        //mengambil data mahasiswa
        System.out.println("Nomor Induk Mahasiswa : " +no_bp.getFirst());
        System.out.println("Nomor Induk Mahasiswa : " +no_bp.getLast());
        System.out.println("");

        System.out.println("Nama Mahasiswa : " +nama_mahasiswa.getFirst());
        System.out.println("Nama Mahasiswa : " +nama_mahasiswa.getLast());
        System.out.println("");

        System.out.println("Alamat Mahasiswa : " +alamat.getFirst());
        System.out.println("Alamat Mahasiswa : " +alamat.getLast());
        System.out.println("");

        System.out.println("Output pop Data Mahasiswa : ");
        //mengeluarkan daftar pertama data mahasiswa
        no_bp.pop();
        nama_mahasiswa.pop();
        alamat.pop();
        System.out.println("Nomor Induk Mahasiswa : " +no_bp);
        System.out.println("Nama Mahasiswa : " +nama_mahasiswa);
        System.out.println("Alamat Mahasiswa : " +alamat);
        System.out.println("");

        System.out.println("Output push Data Mahasiswa : ");
        //menambahkan daftar pertama data mahasiswa
        nama_mahasiswa.push("Mhd Faiz Yunus");
        no_bp.push("2111523010");
        alamat.push("Jln. Taman Melati No.1");
        System.out.println("Nomor Induk Mahasiswa : " +no_bp);
        System.out.println("Nama Mahasiswa : " +nama_mahasiswa);
        System.out.println("Alamat Mahasiswa : " +alamat);
        System.out.println("");

        System.out.println("Output indeksOf Data Mahasiswa : ");
        //mencari indeks suatu data mahasiswa
        System.out.println(no_bp.indexOf("211523018"));
        System.out.println(nama_mahasiswa.indexOf("Arif Wahyudi"));
        System.out.println(alamat.indexOf("Jln. Anggrek No.10"));
    }
}
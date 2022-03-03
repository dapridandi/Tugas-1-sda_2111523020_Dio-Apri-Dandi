package linkedlist;

import java.util.LinkedList;

public class tugas2 {
    public static void main(String[] args) {
        LinkedList<String> saya = new LinkedList<String>();

        //karakter nama "DIO APRI DANDI"
        saya.add("D");
        saya.add("I");
        saya.add("O");
        saya.add("");
        saya.add("A");
        saya.add("P");
        saya.add("R");
        saya.add("I");
        saya.add("");
        saya.add("D");
        saya.add("A");
        saya.add("N");
        saya.add("D");
        saya.add("I");

        System.out.println("Nama Lengkap saya yaitu: " + saya);
        System.out.println("size: " + saya.size());
        
        System.out.println("List sebelum di tambahkan karakter: " + saya);
        //soal 1 : add(Tambahan) karakter yang lain anda inginkan 
        saya.add(3,"J");
        saya.add(5,"H");
        saya.add(7,"N");

        System.out.println("List nama saya setelah ditambahkan karakter: " + saya);
        //soal 2 : Sisipkan karakter lain yang anda inginkan 
        saya.set(2,"N");
        saya.set(3,"E");
        saya.set(5,"R");
        saya.set(7,"D");

        System.out.println("List nama saya setelah disisipkan karakter: " + saya);
        //fungsi Remove
        saya.remove(6);
        saya.remove(3);
        saya.remove(1);
        saya.remove(5);
        saya.remove(7);
        saya.remove(2);

        System.out.println("List nama saya setelah diremove karakter: " + saya);
        //fungsi push
        saya.push("BAIK");
        saya.push("RAJIN MENABUNG");
        saya.push("TIDAK SOMBONG");

        System.out.println("List nama saya setelah fungsi PUSH dijalankan: " + saya);
        //fungsi POP
        saya.pop();
        saya.pop();
        System.out.println("List nama saya setelah fungsi POP dijalankan: " + saya);

        System.out.println("List nama akhir saya yaitu : " + saya);
        System.out.println("size : " + saya.size());


    
    }
}       
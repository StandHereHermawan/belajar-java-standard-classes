package programmer.zaman.now.classes;

public class SystemApp {
    public static void main(String[] args) {

        System.out.println(System.currentTimeMillis());
        System.out.println(System.nanoTime());

        System.out.println(System.getenv());
        System.out.println(System.getenv("APP"));

        System.gc();

        System.exit(1);

        System.out.println("Gak ke kirim di konsol");
        //gak kekirim gegara diatas ada System.exit yang menghentikan Java Virtual Machine untuk menjalankan program.
    }
}

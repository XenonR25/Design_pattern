public class Client {
    public static void main(String[] args) {
        File r1 = new File(50);
        File r2 = new File(56);
        File r3 = new File(39);

        Directory dir1 = new Directory();
        Directory root = new Directory();

        root.add(dir1);
        root.add(r1);
        root.add(r2);
        dir1.add(r3);

        System.out.println(root.comp());

    }
}

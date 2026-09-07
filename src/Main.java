public class Main {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        int i = 0;
        while (i < 1000000){
            System.out.print(".");
            i++;
        }

        long ende = System.currentTimeMillis();

        long dauer = ende - start;

        System.out.println("Dauer: " + dauer + "ms");
    }
}
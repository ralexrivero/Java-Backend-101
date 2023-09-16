public class CicloParalelo {
    public static void main(String[] args) {
        for (int i = 0, j = 0; i < 10 && j < 10; i++, j++) {
            System.out.println("i " + i + " j " + j);
        }

        for (int i = 0, j = 0; i < 10 && j < 20; i++, j+=2) {
            System.out.println("i " + i + " j " + j);
        }


    }
}

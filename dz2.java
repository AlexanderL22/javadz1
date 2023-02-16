public class dz2 {
    public static void main(String[] args) {
        System.out.println("Все простые числа от 1 до 1000: ");
        for (int i = 2; i <= 1000; i++) {
            for (int j = 2; j <= i; j++) {
                if (i % j == 0) {
                    if (i == j) {
                        System.out.printf("[" + i + "]");
                    } else {
                        break;
                    }
                }
            }
        }
    }
}
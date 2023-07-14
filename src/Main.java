import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int l1 = sc.nextInt();
        int l2 = sc.nextInt();
        int tree = sc.nextInt();

        boolean isMango = false;

        if (tree <= l2 || tree > (l1 - 1) * l2) {
            if (tree % l2 == 1 || tree % l2 == 0) {
                isMango = true;  // Mango tree
            }
        }

        if (!isMango) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }
}
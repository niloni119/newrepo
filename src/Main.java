import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number from 0 to 99999: ");

        long num = input.nextLong();
        input.close();

        if (num >= 0 && num <= 99999) {
            System.out.print("Your number in kyrgyz: ");
            long teen = num % 10;
            long hun = (num / 10) % 10;
            long tou = (num / 100) % 10;
            long tou2 = (num / 1000) % 10;
            long tou3 = num / 10000;

            String[] a = {"", "Бир", "Эки", "Үч", "Төрт", "Беш", "Алты", "Жети", "Сегиз", "Тогуз"};
            String[] b = {"", "Он", "Жыйырма", "Отуз", "Кырк", "Элүү", "Алтымыш", "Жетимиш", "Сексен", "Токсон"};
            String[] h = {"", "Жүз"};
            String[] t = {"", "Миң"};

            if (num == 0) {
                System.out.println("Нөл");
                return;
            }

            StringBuilder result = new StringBuilder();

            // Thousands
            if (tou3 > 1) {
                result.append(a[(int) tou3]).append(" ").append(t[1]);
            } else if (tou3 == 1) {
                result.append("Он ").append(a[(int) tou2]).append(" ").append(t[1]);
            } else if (tou2 > 0) {
                result.append(a[(int) tou2]).append(" ").append(t[1]);
            }

            // Hundreds
            if (tou > 0) {
                if (result.length() > 0) result.append(" ");
                result.append(a[(int) tou]).append(" ").append(h[1]);
            }

            // Tens
            if (hun > 0) {
                if (result.length() > 0) result.append(" ");
                result.append(b[(int) hun]);
            }

            // Units
            if (teen > 0) {
                if (result.length() > 0) result.append(" ");
                result.append(a[(int) teen]);
            }

            // Result
            System.out.println(result);
        } else {
            System.out.println("Error");
        }
    }
}

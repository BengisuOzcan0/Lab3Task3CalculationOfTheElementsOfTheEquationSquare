import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the coefficients for the quadratic equation ax^2 + bx + c = 0:");
        System.out.print("Enter a (must be non-zero): ");
        double a = scanner.nextDouble();

        if (a == 0) {
            System.out.println("a can't be 0 please type again.Thanks.");
        } else {
            System.out.print("Enter b: ");
            double b = scanner.nextDouble();
            System.out.print("Enter c: ");
            double c = scanner.nextDouble();



            double discriminant = b * b - 4 * a * c;

            double x1, x2;

            switch (Double.compare(discriminant, 0)) {
                case 0:
                    x1 = -b / (2 * a);
                    System.out.printf("One real root: x1 = %.2f%n", x1);
                    break;
                case 1:
                    x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
                    x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
                    System.out.printf("Two real roots: x1 = %.2f, x2 = %.2f%n", x1, x2);
                    break;
                default:
                    double otherPart = -b / (2 * a);
                    double LastPart = Math.sqrt(-discriminant) / (2 * a);
                    System.out.printf("Complex roots: x1 = %.2f + %.2fi, x2 = %.2f - %.2fi%n", otherPart, LastPart, otherPart, LastPart);
                    break;
            }
        }

    }
}
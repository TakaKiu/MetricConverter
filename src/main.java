import java.util.Scanner;

class MeasurementConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double meters;
        do {
            System.out.print("Enter the measurement in meters: ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Invalid input. Please enter a valid measurement in meters: ");
                scanner.next();
            }
            meters = scanner.nextDouble();
        } while (meters < 0);

        double miles = meters * 0.000621371;

        double feet = meters * 3.28084;

        double inches = meters * 39.3701;

        System.out.println(meters + " meters is equal to:");
        System.out.println(miles + " miles");
        System.out.println(feet + " feet");
        System.out.println(inches + " inches");
    }
}

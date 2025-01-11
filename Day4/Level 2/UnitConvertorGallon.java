public class UnitConvertorGallon {

    // Method to convert Fahrenheit to Celsius
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    // Method to convert Celsius to Fahrenheit
    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Method to convert pounds to kilograms
    public static double convertPoundsToKilograms(double pounds) {
        double pounds2kilograms = 0.453592;
        return pounds * pounds2kilograms;
    }

    // Method to convert kilograms to pounds
    public static double convertKilogramsToPounds(double kilograms) {
        double kilograms2pounds = 2.20462;
        return kilograms * kilograms2pounds;
    }

    // Method to convert gallons to liters
    public static double convertGallonsToLiters(double gallons) {
        double gallons2liters = 3.78541;
        return gallons * gallons2liters;
    }

    // Method to convert liters to gallons
    public static double convertLitersToGallons(double liters) {
        double liters2gallons = 0.264172;
        return liters * liters2gallons;
    }

    // Main method for user input and testing the conversions
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Enter the value in Fahrenheit to convert to Celsius:");
        double fahrenheit = scanner.nextDouble();
        System.out.println(fahrenheit + " °F is equal to " + convertFahrenheitToCelsius(fahrenheit) + " °C.");

        System.out.println("Enter the value in Celsius to convert to Fahrenheit:");
        double celsius = scanner.nextDouble();
        System.out.println(celsius + " °C is equal to " + convertCelsiusToFahrenheit(celsius) + " °F.");

        System.out.println("Enter the value in pounds to convert to kilograms:");
        double pounds = scanner.nextDouble();
        System.out.println(pounds + " pounds is equal to " + convertPoundsToKilograms(pounds) + " kilograms.");

        System.out.println("Enter the value in kilograms to convert to pounds:");
        double kilograms = scanner.nextDouble();
        System.out.println(kilograms + " kilograms is equal to " + convertKilogramsToPounds(kilograms) + " pounds.");

        System.out.println("Enter the value in gallons to convert to liters:");
        double gallons = scanner.nextDouble();
        System.out.println(gallons + " gallons is equal to " + convertGallonsToLiters(gallons) + " liters.");

        System.out.println("Enter the value in liters to convert to gallons:");
        double liters = scanner.nextDouble();
        System.out.println(liters + " liters is equal to " + convertLitersToGallons(liters) + " gallons.");

        scanner.close();
    }
}

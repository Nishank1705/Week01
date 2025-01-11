
    import java.util.Scanner;
    public class WindChillTemperature {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            System.out.print("Enter Temp ");
            double temp = scanner.nextDouble();
            System.out.print("Enter WindSpeed ");
            double WindSpeed = scanner.nextDouble();
            WindChillTemperature obj = new WindChillTemperature();
            double result = obj.calculateWindChill(temp, WindSpeed);

            System.out.println(result);
        } public double calculateWindChill(double temperature, double windSpeed){
            double wind = Math.pow(windSpeed,0.16);
            double windChill = 35.74 + 0.6215 *temperature + (0.4275*temperature - 35.75) * wind;
            return windChill;
        }

    }
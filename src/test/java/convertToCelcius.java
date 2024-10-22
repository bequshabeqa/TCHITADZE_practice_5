public class convertToCelcius {
    public static void main(String[] args) {
            System.out.println("შედეგი = " + convertToCelsius(98.6));
    }

    public static double convertToCelsius(double Fahrenheit) {
        double Celsius = (5.0/9.0) * (Fahrenheit - 32);

        return Celsius;
}
}

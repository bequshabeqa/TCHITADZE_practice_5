public class Methods {
    public static void main(String[] args) {
            Excercise_2 Excercise_2 = new Excercise_2();
            int number = Excercise_2.findLargest();
            System.out.println("Task_2 შედეგი = " + number);

            calculateArea calculateArea = new calculateArea();
            double result = calculateArea.calculateArea();
            System.out.println("Task_3 შედეგი = " + result);

            greet greet = new greet();
            System.out.println("Task_4 შედეგი = " + greet.greet() + ", " + greet.greet1());

            convertToCelcius convertToCelcius = new convertToCelcius();
            System.out.println("Task_5 შედეგი = " + convertToCelcius.convertToCelsius(98.6));
        }
    }

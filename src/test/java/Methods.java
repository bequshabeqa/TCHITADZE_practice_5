public class Methods {
    public static void main(String[] args) {

            isEven isEven = new isEven();
            System.out.println("Task_1 შედეგი = " + isEven.isEven(4));
            System.out.println("Task_1 შედეგი = " + isEven.isEven(7));

            findLargest findLargest = new findLargest();
            int number = findLargest.findLargest();
            System.out.println("Task_2 შედეგი = " + number);

            calculateArea calculateArea = new calculateArea();
            double result = calculateArea.calculateArea();
            System.out.println("Task_3 შედეგი = " + result);

            greet greet = new greet();
            String str = greet.greet("Hello", "Alice!", " ", ",");
            System.out.println("Task_4 შედეგი = " + str);

            convertToCelcius convertToCelcius = new convertToCelcius();
            System.out.println("Task_5 შედეგი = " + convertToCelcius.convertToCelsius(98.6));
        }
    }

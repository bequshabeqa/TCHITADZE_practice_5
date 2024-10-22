public class greet {
    public void main(String[] args) {
        System.out.println(greet("Hello", "Alice!"));
    }

    public String greet(String str1, String str2) {
        return str1 + str2;
    }
}
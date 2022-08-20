public class Method {

    public static void main(String[] args) {

        System.out.println(sum(600,100));

        System.out.println(minus(700,100,200));

        System.out.println(multiply(11,5));
        
        System.out.println(division(25,5));

    }
    public static int sum( int option1, int option2){
        int result = option1 + option2;
        return result;
    }

    public static int minus (int option1, int option2, int option3){
        int result = option1-option2-option3;
        return result;
    }

    public static int multiply( int option1, int option2){
        int result = option1 * option2;
        return result;

    }

    public static int division( int option1, int option2){
        int result = option1 / option2;
        return result;
    }
}






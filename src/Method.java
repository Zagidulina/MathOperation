public class Method {

    public static void main(String[] args) {

        int sixHundred = 600;
        int oneHundred = 100;

        System.out.println(sum(sixHundred, oneHundred));

        int sevenHundred = 700;
        int fifty = 50;
        int twoHundred = 200;

        System.out.println(minus(sevenHundred, fifty, twoHundred));

        int eleven = 11;
        int five = 5;

        System.out.println(multiply(eleven, five));

        int fortyTwo = 42;
        int seven = 7;

        System.out.println(division(fortyTwo,seven));

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






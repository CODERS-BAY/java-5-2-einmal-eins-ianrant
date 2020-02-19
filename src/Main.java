public class Main {

    public static void main(String[] args) {

        int numberA = 1; //remains
        int numberB = 1; //changes
        int result = 0;

        System.out.println();
        System.out.println("for loop from 1 to 10");

        for (int i = 0; i<10; i++) {
            result = numberA * numberB+i;
            System.out.println(numberA+ " * "+ (numberB+i) + " = "+ result);
        }

        System.out.println();
        System.out.println("while loop 1 to 10");

        numberA = 1; //remains
        numberB = 1; //changes
        result = 0;

        int while1=0;
        while (while1<10) {
            result = numberA * numberB+while1;
            System.out.println(numberA+ " * "+ (numberB+while1) + " = "+ result);
            while1++;
        }

        System.out.println();
        System.out.println("do-while loop 1 to 10");

        numberA = 1; //remains
        numberB = 1; //changes
        result = 0;

        do {

            result = numberA * numberB;

            System.out.println(numberA+ " * "+ numberB + " = "+ result);
            numberB +=1;
        }
        while (numberB<11);

        System.out.println();
        System.out.println();
        System.out.println();

        numberA = 1; //remains
        numberB = 1; //changes
        result = 0;

        for (int i = 1; i<=10; i++) {
            numberA = i;

            for (int m = 1; m<=10; m++) {
                numberB = m;
                result = numberA*numberB;
                System.out.println(numberA+" * "+numberB+" = "+result);
            }
            System.out.println();
        }

    }
}

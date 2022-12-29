package HomeWork2;

public class Task1 {
    public static void main(String[] args) {
      // 1.0 Перевести число 333 из шестнадцатиричной в десятичную
        System.out.println("=========1.0============");
        String hex="14D";
        int decimal=Integer.parseInt(hex,16);
        System.out.println(decimal);


      //1.1Разложить число 200345 на разряды в десятичной системе
        System.out.println("=========1.1============");

        int number= 200345;
        int digit1=number/100000%10;
        int digit2=number/10000%10;
        int digit3=number/1000%10;
        int digit4=number/100%10;
        int digit5=number/10%10;
        int digit6=number%10;

        System.out.println(digit1 + "," + digit2 + "," + digit3 + "," + digit4 + "," + digit5 + "," + digit6);

        // 1.2 Перевести 637 из десятичной в шестнадцатиричную и обратно (10->16 и 16->10)
        System.out.println("=========1.2============");

        int dec = 637;
        System.out.println(Integer.toHexString(dec));

        String hex2="27D";
        int decimal2=Integer.parseInt(hex2,16);
        System.out.println(decimal2);


        // 1.3  Перевести 637 из десятичной в двоичную
        System.out.println("=========1.3============");
        System.out.println(Integer.toBinaryString(637));

        // 1.4 11100111 перевести в десятичную
        System.out.println("=========1.4============");

        String binaryString="11100111";
        int decimal3 =Integer.parseInt(binaryString,2);
        System.out.println(decimal3);

        // 1.5 Перевести 637 из десятичной в троичную
        System.out.println("=========1.5============");
        int numDec = 637;
        System.out.printf( Integer.toString(numDec, 3));




    }

}

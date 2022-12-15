public class main {
    public static void main(String[] args) {
        // Precedence & Associativity
//        left to right going and * and / having more precedence than + or -
        int a = 6*5-34/2;
        int b = 34/2-6*5;
        System.out.println(a);
        System.out.println(b);
        int v = 8;
        int t = 19;
        int q = 10;
//        with parenthesis
        int k = (v*v - 4*t*q)/(2*q);
        System.out.println(k);
//        without parenthesis
        int s = v*v - 4*t*q/2*q;
        System.out.println(s);

        // Increment and Decrement operators

        int num = 12;
        // num++ it will give the value of num and then increment it
        // ++num it will increment the value of num and then give the value of num
        System.out.println(num++); // output will be 12
        System.out.println(num); // output will be 13
        int num2 = 16;
        System.out.println(++num2); // output will be 17

        int dec1 = 110;
        System.out.println(dec1--);
        System.out.println(dec1);

        int dec2 = 159;
        System.out.println(--dec2);

        int y = 7;
        int x = ++y * 8;
        System.out.println(x); // output will be 64;

        char ab = 'a';
        System.out.println(++ab); //output will be b;



    }
}

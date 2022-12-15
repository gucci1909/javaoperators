import java.util.Scanner;

public class tax_calculator {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        float tax = 0;
        float income = s1.nextFloat(); // LPA
        if(income<=2.5f){
            tax += 0;
            System.out.println("Your tax amount is :  "+ tax );
        }
        else if(income>2.5f && income <=5f){
            tax += 0.05f*(income - 2.5f);
            System.out.println("Your tax amount is :  "+ tax );
        }
        else if(income>5f && income <=7.5f){
            tax += 0.05f*(5.0f-2.5f);
            tax += 0.1f*(income-5.0f);
            System.out.println("Your tax amount is :  "+ tax );
        }
        else if(income>7.5f && income<=10.0f){
            tax += 0.05f*(5.0f-2.5f);
            tax += 0.1f*(income-5.0f);
            tax += 0.15f*(income-7.5f);
            System.out.println("Your tax amount is :  "+ tax );

        }
        else if(income>10.0f && income<=12.5f){
            tax += 0.05f*(5.0f-2.5f);
            tax += 0.1f*(income-5.0f);
            tax += 0.15f*(income-7.5f);
            tax += 0.2f*(income-10f);
            System.out.println("Your tax amount is :  "+ tax );
        }
        else if(income>12.5f && income<=15.0f){
            tax += 0.05f*(5.0f-2.5f);
            tax += 0.1f*(income-5.0f);
            tax += 0.15f*(income-7.5f);
            tax += 0.2f*(income-10f);
            tax += 0.25f*(income-12.5f);
            System.out.println("Your tax amount is :  "+ tax );
        }
        else{
            tax += 0.05f*(5.0f-2.5f);
            tax += 0.1f*(income-5.0f);
            tax += 0.15f*(income-7.5f);
            tax += 0.2f*(income-10f);
            tax += 0.25f*(income-12.5f);
            tax += 0.3f*(income-15.0f);
            System.out.println("Your tax amount is :  "+ tax );
        }

    }

}

// abstraction

import java.util.Scanner;

/**
 * Abstrsct
 */
abstract class Abstrsct {

    public String bank ="Bank of Baroda";
    public String IFSC_CODE ="BARB0DAVA";

    public void bank_details(){
        System.out.println(bank + ""+ "ifsce code is "+IFSC_CODE);
    }

    abstract void Withdraw();
    abstract void Deposite();         // only mehtod declaration that menas hiding the implimentation
    abstract void Checkbal();
    
}

/**
 * BankService
 extends Abstrsct */
 class BankService  extends Abstrsct{

    private double balence = 5.000;
    public int  money;
    private int password;

    public void Withdraw(){
        System.out.println("Enter your password first");
        Scanner sc = new Scanner(System.in);
        password = sc.nextInt();
        if (password == 4549){
            System.out.println("Enter the withdraw amount ");
            Scanner s = new Scanner(System.in);
            money = s.nextInt();
            balence = balence - money;
            System.out.println("total balence is :"+balence);
        }
        else{
            System.out.println("password bhula kya loude");
        }


    }

    public void Deposite(){
        System.out.println("Enter your password first");
        Scanner ss = new Scanner(System.in);
        password = ss.nextInt();
        if (password == 4549){
            System.out.println("Enter the deposite amount ");
            Scanner sss = new Scanner(System.in);
            money = sss.nextInt();
            balence = balence + money;
            System.out.println("total balence is :"+balence);
        }
        else{
            System.out.println("password bhula kya loude");
        }



    }
    public void Checkbal(){
        System.out.println("Enter your password first");
        Scanner scc = new Scanner(System.in);
        password = scc.nextInt();
        if (password == 4549){
            System.out.println("total balence is :"+balence);
        }
        else{
            System.out.println("password bhula kya loude");
        }


    }
}
 class Customer extends BankService  {

public static void main(String[] args) {
    BankService bk = new BankService();

    bk.bank_details();

    System.out.println("1 . Deposit");
    System.out.println( "2. withdraw ");
    System.out.println("3 . checkbalence");

    int ch ;
    System.out.println("Enter your choice ");
    Scanner sc2 = new Scanner(System.in);
     ch = sc2.nextInt();

     switch (ch) {
        case 1: bk.Deposite();
            break;

        case 2 : bk.Withdraw();
        break;

        case 3 : bk.Checkbal();
        break;
     
        default: System.out.println("invalid choice");
            break;
     }
}

    
}
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Code Starts");
        Scanner sc=new Scanner(System.in);

        System.out.println("Give principle amount for invest as p: ");
        double p=sc.nextDouble();
        sc.nextLine();
        System.out.println("Give interest rate for invest as r: ");
        double r=sc.nextDouble();
        sc.nextLine();
        System.out.println("Give time for which to  invest as t: ");
        double t=sc.nextDouble();
        sc.nextLine();
        deposit d=new deposit();
        System.out.println("You will get total money after "+t+" years of invest as i: "+ d.interest(r,t,p));
        sc.close();
    }
}
class deposit{
    double i;      //interest
    double p;      // principle
    double r;      // inteest rate
    double t;      //invest time

// i=p(1+ r/100)^t          p+ p*r/100  

    public double interest(double rate, double time, double p){
            this.p=p;
            this.r=rate;
            this.t=time;
            for(int j=1;j<time;j++){  
                i=p * Math.pow(1 + (rate / 100), 1 * time);
                System.out.println("Total amount with interest in year : "+j+" is "+i);
              }
            
        return i;
    }
}
// class withdraw extends deposit{
//     double x;       // amount to take out
//     double inf;    // inflation rate- rate increase
//     double t;      //time
//     double p;      // principle after t years will be = 
//     public void withdraw(double x, double r, double t){
//         this.x=x;
//         this.inf=r;
//         this.t=t;


//     }
//     class total extends withdraw{

//     }

// }

/* I will invet p amount per month (12p  in year)
 * next year I will again invest 12p, but on 12p*1.r
 * invest for m years
 * 
 * 
 * withdraw x per month
 * withdraw 12x for a year
 * next year i will withdraw 5% more
 * withdraw fro n years
 */








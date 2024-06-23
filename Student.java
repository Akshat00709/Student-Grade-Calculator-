import java.util.Scanner;
public class Student{
    @SuppressWarnings("unused")
    public static void main(String[] args){
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("Student Calculator");
        System.out.println("Enter the marks of student:");
        System.out.print("Enter Physics number:");
        double phy = sc.nextDouble();
        System.out.print("Enter Chemistry number:");
        double chem = sc.nextDouble();
        System.out.print("Enter Mathematics number:");
        double maths = sc.nextDouble(); 
        System.out.print("Enter English number:");
        double eng = sc.nextDouble();
        double total=phy+chem+maths+eng;
        System.out.println("Sum of your marks:"+total);
        double avg=(total/400)*100;
        System.out.println("Percentage of your numbers:"+avg);
        String grade=null;
        if(avg>90){
            grade="A";
        }
        else if((avg<90) && (avg>80)){          
            grade="B";
        }
        else if((avg<80) && (avg>70)){
            grade="C";
        }
        else if((avg<70) && (avg>60)){
            grade="D";
        }
        else if((avg<60) && (avg>33)){
            grade="E";
        }
        else{
            grade="F";
        }
    }
}
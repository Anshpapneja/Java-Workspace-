import java.util.Scanner;

class Javabasics{
    public static void main(String[] args) {
        Scanner scc = new Scanner(System.in); //Scnaner define
        System.out.println("Enter name:"); // Before print 
        String Lodu=scc.nextLine();//input done
        int number=scc.nextInt();
        System.out.println("This is the answer:");
        System.out.println(Lodu); //input uska output do!
        System.out.println(number); //input uska output do!

        float bubba =scc.nextFloat();
        System.out.println(bubba);


    }
}
import java.util.Scanner;
class question2{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int total=0;
        int max=0;
        int m=0,n;
        int[] monthlyPass=new int[12];
        
        for(n=0;n<12;n++){
            System.out.println("Enter passengers for months "+(n+1)+":");
            monthlyPass[n]=sc.nextInt();
            total=total+monthlyPass[n];
        }
        System.out.println("Total is "+total);
        double average=total/12;
        System.out.println("Average is "+average);
        for(n=0;n<12;n++){
            if(monthlyPass[n]>average){
                System.out.println("month "+(n+1)+" above average");
            }
            if(monthlyPass[n]>max){
                max=monthlyPass[n];
                m=n+1;
            }
        }
        System.out.println("Max is "+max+" at month "+month(m));
    }
    public static String month(int n) {
        String[] months = {"january", "february", "march", "april", "may", "june",
                           "july", "august", "september", "october", "november", "december"};
        if (n >= 1 && n <= 12) {
            return months[n - 1];
        } else {
            return "Invalid month";
        }}
}

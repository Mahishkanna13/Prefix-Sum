import java.util.Scanner;

public class PrefixSum {
    public static int[] Sum(int[] array)
    {
        int [] prefix=new int[array.length];
        prefix[0]=array[0];
        for(int i=1; i<array.length; i++)
        {
            prefix[i]=prefix[i-1]+array[i];
        }
        return prefix;
    }
    public static void main(String[] args) {
        System.out.println("Enter the size : ");
        Scanner scan = new Scanner(System.in);
        int size=scan.nextInt();
        int[] Array=new int[size];
        System.out.println("Enter the Elements : ");
        for(int i=0;i<size;i++)
        {
            Array[i]=scan.nextInt();
        }
        int[] Output =Sum(Array);
        for(int i=0;i<Output.length;i++)
        {
            System.out.print(Output[i]+" ");
        }
    }
}

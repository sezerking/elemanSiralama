import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen dizinin eleman sayısını giriniz: ");
        int eleman=scanner.nextInt();
        int[] list=new int[eleman];
        for (int i=0;i<list.length;i++){
            System.out.println("Dizinin elemanlarını giriniz: ");
            list[i]=scanner.nextInt();
        }

        for (int i=0;i< list.length;i++){
            for (int j=0;j<list.length;j++){
                int temp=0;
                if (list[i]>list[j]){
                   temp=list[i];
                   list[i]=list[j];
                   list[j]=temp;
                }
            }
        }

        for (int i=0;i<list.length;i++){
            System.out.println(list[i]);
        }



    }
}

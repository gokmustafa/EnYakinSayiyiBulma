import java.util.Arrays;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi;
        System.out.print("Bir sayı giriniz: ");
        sayi = input.nextInt();
        int [] list = { 15,12,788,1,-1,-778,2,0};

        Arrays.sort(list);

        int min = list [0];
        int max = list [list.length-1];

        for (int i=0; i<list.length; i++){
            if (list[i] <sayi){
                min =list[i];
            }
        }
        for (int i= list.length-1; i>0; i--){
            if (list[i]>sayi){
                max=list[i];
            }
        }
        System.out.println("Girilen sayıdan küçük en yakın sayı: "+ min);
        System.out.println("Girilen sayıdan büyük en yakın sayı: "+ max);

    }
}


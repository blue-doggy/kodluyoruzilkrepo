import java.util.Scanner;
public class artikyil {
    
    public static void main(String[] args) {
        System.out.println("Arık yıl hesaplayıcısı :");
        Scanner input = new Scanner(System.in);
        int yil,mod;
        System.out.println("yılı giriniz :");
        yil = input.nextInt();
        mod = yil%4;
        switch(mod){
            case 0 :
            System.out.println("artık yıl");
            break;
            case 1 :
            System.out.println("kendine anca yeten yıl ");
            break;
            case 2 :
            System.out.println("artamayık yıl ");
            break;
            case 3 :
            System.out.println("artmayık yıl");
            break;}
            
        }
    }
    

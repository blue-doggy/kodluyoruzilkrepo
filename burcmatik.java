import java.util.Scanner;
public class burcmatik {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int month,day,year,mode;
        System.out.println("Burçmatiğe hoşgeldiniz");
        System.out.print("Doğum yılınızı giriniz :");
        year = input.nextInt();
        mode = year%12;
        System.out.println("Ocak = 1\nŞubat = 2\nMart = 3\nNisan = 4\nMayıs = 5\nHaziran = 6\nTemmuz = 7 \nAğustos = 8 \nEylül = 9 \nEkim = 10 \nKasım = 11 \nAralık = 12");
        System.out.println("doğum ayını sayı olarak giriniz :");
          month = input.nextInt();
        System.out.println("Doğum gününüzü sayı olarak giriniz");
          day = input.nextInt();
        System.out.print("Çin burcunuz : ");
        switch(mode){
        case 1:
        System.out.print("Horoz  ");
        break;
        case 2:
        System.out.print("Köpek  ");
        break;
        case 3:
        System.out.print("Domuz  ");
        break;
        case 4:
        System.out.print("Fare  ");
        break;
        case 5:
        System.out.print("Öküz  ");
        break;
        case 6:
        System.out.print("Kaplan  ");
        break;
        case 7:
        System.out.print("Tavşan  ");
        break;
        case 8:
        System.out.print("Ejderha  ");
        break;
        case 9:
        System.out.print("Yılan  ");
        break;
        case 10:
        System.out.print("At  ");
        break;
        case 11:
        System.out.print("Koyun  ");
        break;
        case 0:
        System.out.print("Maymun  ");
        break;
        }
        System.out.print("/  Normal burcunuz : ");
        if(month == 1 ){
            if(day >21){
            System.out.print("Kova burcusunuz ");
            }else{
                System.out.print("Oğlak burcusunuz");}
                }if(month == 2){
           if(day >19){
            System.out.print("Balık burcusunuz ");
            }else{
                System.out.print("Kova burcusunuz");}
        }if(month == 3 ){
           if(day >20){
            System.out.print("Koç burcusunuz ");
            }else{
                System.out.print("Balık burcusunuz");}
        }if(month == 4 ){
           if(day >20){
            System.out.print("Boğa burcusunuz ");
            }else{
                System.out.print("Koç burcusunuz");}
        }if(month == 5 ){
           if(day >21){
            System.out.print("İkizler burcusunuz ");
            }else{
                System.out.print("Boğa burcusunuz");}
        }if(month == 6 ){
            if(day >22){
            System.out.print("Yengeç burcusunuz ");
            }else{
                System.out.print("İkizler burcusunuz");}
        }if(month == 7 ){
            if(day >22){
            System.out.print("Aslan burcusunuz ");
            }else{
                System.out.print("Yengeç burcusunuz");}
        }if(month == 8 ){
            if(day >22){
            System.out.print("Başak burcusunuz ");
            }else{
                System.out.print("Aslan burcusunuz");}
        }if(month == 9 ){
           if(day >22){
            System.out.print("Terazi burcusunuz ");
            }else{
                System.out.print("Başak burcusunuz");}1
        }if(month == 10 ){
           if(day >22){
            System.out.print("Akrep burcusunuz ");
            }else{
                System.out.print("Terazi burcusunuz");}
        }if(month == 11 ){
           if(day >21){
            System.out.print("Yay burcusunuz ");
            }else{
                System.out.print("Akrep burcusunuz");}
        }if(month == 12  ){
           if(day >21){
            System.out.print("Oğlak burcusunuz ");
            }else{
                System.out.print("Yay burcusunuz");}
        }
        }
                                               }

package pkg3monthjunior1;
import static java.lang.Thread.sleep;
import java.util.Random;
import java.util.Scanner;
public class Main {
    static User user;
    static Dragon dragon;
    static Scanner in;

    public static void main (String[] args) throws Exception{
        user = new User();
        dragon = new Dragon();
        in = new Scanner(System.in);
        privet();

    }
    public static void privet() throws Exception{
        System.out.print("Kak tebya zovut: ");
        user.setName(in.nextLine());
        if (user.getName().length() == 0){     
            System.out.println("Nu esli ne govorish kak tebya zovut.... Budesh - Vonyuchkoy!!!");
            user.setName("Vonyuchka");
        }
        sleep(1000);
        System.out.println("Privet, " + user.getName() + "!!!");
        sleep(1000);
        System.out.println("Ti malchonka (1) il devchonka (2)?: ");
        user.setSexUser(in.nextInt());
        sleep(1000);
        System.out.println("A-a-a-a-a .... tak ti - " + user.getSex());
        sleep(1000);
        System.out.println("Iz kakogo ti plemeny? ");
        System.out.println("(1) Gnom;");
        System.out.println("(2) Elf;");
        System.out.println("(3) Ork");
        user.setRaceUser(in.nextInt());
        sleep(500);
        System.out.println("Ogo! pryam sam " + user.getRace() + " sobstvennoy persony!");
        sleep(2000);
        System.out.println("nu-nu.... " + user.getName() + " poigraem....");
        sleep(2000);
        System.out.println("----------------------------------------------------");
        System.out.println("Kakoy put vybiraesh?");
        System.out.println("(1) Forest;");
        System.out.println("(2) River;");
        System.out.println("(3) Mountain;");
        user.kakoyWay(in.nextInt());
        goWay();
        
       
    }
   public static void goWay() throws Exception{
       sleep(1000);
       System.out.println("ROUND - 1");
       sleep(1000);
       System.out.println("Pervoe ispytanie na puti po " + user.getWay().getName());
       System.out.print("Eto - ");
       user.getWay().isp1();
       if (user.getWay().otvet1(in.nextInt())){
           user.setLevel(user.getLevel()+10);
           sleep(1000);
           System.out.println("Da ty, " + user.getName() + " - molodec!!!!");
       } else {
           sleep(1000);
           System.out.println("Exxx.... Oblazalsya ti, " + user.getName());
           sleep(500);
           System.out.println("Opozoril rod " + user.getRace());
       }
       sleep(3500);
       System.out.println("-------------------------------------");
       System.out.println("ROUND - 2");
       sleep(1000);
       System.out.print("Vtoroe ispytanie na puti po " + user.getWay().getName());
       System.out.print("Eto - ");
       user.getWay().isp2();
       if (user.getWay().otvet2(in.nextInt())){
           user.setLevel(user.getLevel()+20);
           sleep(2500);
           System.out.println("Vau!!! Da ty, " + user.getName() + " - krut!!!!");
       } else {
           sleep(2000);
           System.out.println("Exxx....mimo, " + user.getName());
       }
       sleep(3000);
       System.out.println("-------------------------------------");
       System.out.println("ROUND - 3");
       System.out.println("Finalnoe ispytanie na puti po " + user.getWay().getName());
       System.out.print("Eto - ");
       user.getWay().isp3();
       if (user.getWay().otvet3(in.nextInt())){
           user.setLevel(user.getLevel()+30);
           sleep(1000);
           System.out.println(user.getName() + " - MO-LO-DEC!!!!");
       } else {
           sleep(1000);
           System.out.println("pfffff, nu yo-mayo.... " + user.getName());
           
       }
       bitvaDragon();
   }
    public static void bitvaDragon() throws Exception{
        sleep(2000);
        System.out.println("******************************************************");
        System.out.println("Vot ti, " + user.getName() + " i doshol do vraga kovarnogo, do Drakona!");
        sleep(500);
        System.out.println("Spasay nas, dobriy-" + user.getRace() + " ot vraziny gadkoy!");
        sleep(1000);
        System.out.println("nabral ty, poka shel po " + user.getWay().getName() + " Az - " + user.getLevel() + " powera");
        sleep(500);
        System.out.println("Skolko % ot etogo na oboronu zapishem?");
        System.out.println(user.raspredeleniePower(in.nextInt()));
        System.out.println();
       
        Bitva bitva = new Bitva(user, dragon, 0);
        bitva.poedinok();
        
        
    }
    public static int random(int i){
        int rand;
        rand = (int) (Math.random() * i);
        return rand;
    }
    
}

package pkg3monthjunior1;

public class Forest extends Way{

    Forest(){
    setName("Forest");
    }
    

    @Override
    public void isp1() {
        System.out.println(" Zadacha pro Lesorubov (+10 k power)");
        System.out.println("Соревнуются три бригады лесорубов. Первая (1) и третья (3) бригады обработали древесины в 2 раза больше, чем вторая (2),\n" + "а вторая и третья - в 3 раза больше, чем первая. Какая бригада победила в этом соревновании?");
        
    }

    @Override
    public boolean otvet1(int var) {
        if (var == 3 || var == 666){
            return true;
        }
        return false;
    }
    

    @Override
    public void isp3() {
        System.out.println("Zadacha pro .....  (+30 k power)");
        System.out.println("Кто в беретке ярко-красной,\n" +
"В черной курточке атласной?\n" +
"На меня он не глядит.\n" +
"Все стучит, стучит, стучит.");
        System.out.println("Varianty:");
        System.out.println("1 - sotrudnik KGB;");
        System.out.println("2 - dyatel.");
        System.out.println("3 - krasnoberetochniy stuchun.");
        
    }

    @Override
    public void isp2() {
        System.out.println("Zadacha pro dervya (+20 k power)");
        System.out.println("Круглая поляна обсажена деревьями. А и К пошли вокруг поляны, считая деревья. Они идут в одном направлении,\n" + "но начали в разных местах. Дерево, которое\n" + "у К было седьмым, у А было двадцатым, а дерево, которое у А было седьмым, у К было 93-м.\n" +
"Сколько деревьев растет вокруг поляны?");
    }
    @Override
    public boolean otvet2(int var) {
        if (var == 99 || var == 666){
            return true;
        }
        return false;
    }
     @Override
    public boolean otvet3(int var) {
        if (var == 2 || var == 666){
            return true;
        }
        return false;
    }

    

    

    

    
    
    
}

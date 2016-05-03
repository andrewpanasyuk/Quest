/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3monthjunior1;

/**
 *
 * @author a_pan
 */
public class River extends Way {
    River(){
        setName("River");
    }

    @Override
    public String getName() {
        return super.getName(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void isp3() {
        System.out.println("Zadacha pro .....  (+30 k power)");
        System.out.println("Выпить — не выпить, вылить — не вылить.");
        System.out.println("Varianty:");
        System.out.println("1 - Viski s upavsheq v bokal muhoy;");
        System.out.println("2 - reka;");
        System.out.println("3 - zakritaya butylka s vodoy");
    }

    @Override
    public void isp2() {
        System.out.println(" Zadacha pro vannu (+20 k power)");
        System.out.println("Из горячего крана ванна заполняется за 23 минуты. Из холодного крана за 17 минут. \n" + "Маша открыла сначала горячий кран. Через сколько минут она должна открыть холодный, \n" + "чтобы к моменту наполнения ванны горячей воды налилось в 1,5 раза больше, чем холодной?");
    }

    @Override
    public boolean otvet3(int var) {
        if (var == 2 || var == 666){
            return true;
        }
        return false;
    }

    @Override
    public boolean otvet1(int var) {
        if (var == 3 || var == 666){
            return true;
        }
        return false;
    }

    @Override
    public void isp1() {
    System.out.println(" Zadacha pro reku (+10 k power)");   
    System.out.println("Моторная лодка прошла 12км против течения реки и 12км по течению реки, \n" + "затратив на весь путь против течения на 1 час больше,чем на путь по течению. \n" + "Найти скорость течения реки,если скорость лодки в стоячей воде 9км/ч");
    }

    @Override
    public boolean otvet2(int var) {
        if (var == 7 || var == 666){
            return true;
        }
        return false;
    }
    
}

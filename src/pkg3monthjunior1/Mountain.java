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
public class Mountain extends Way {

    public Mountain() {
        setName("Mountain");
    }

    
    @Override
    public void isp3() {
        System.out.println("Zadacha pro .....  (+30 k power)");
        System.out.println("Ох, упала речка вниз\n" +
"Со скалы отвесной!\n" +
"Тут не спрятаться от брызг.\n" +
"Что это за место?");
        System.out.println("Varianty:");
        System.out.println("1 - Sanuzel (M);");
        System.out.println("2 - Vodopad;");
        System.out.println("3 - Dush");
    }

    @Override
    public void isp2() {
        System.out.println(" Zadacha pro lyznika (+20 k power)");
        System.out.println("Поднимаясь в гору, лыжник проходит путь, равный 3 км, со средней скоростью 5,4 км/ч. \n" + "Спускаясь с горы со скоростью 10 м/с, он проходит 1 км пути. Определите среднюю скорость лыжника \n" + "на всем пути. (в м/с)");
    }

    @Override
    public boolean otvet2(int var) {
       if (var == 2 || var == 666){
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

    @Override
    public boolean otvet1(int var) {
       if (var == 12 || var == 666){
            return true;
        }
        return false;
    }

    @Override
    public void isp1() {
        System.out.println(" Zadacha pro gornogo velosepidista (+10 k power)");
        System.out.println("На велогонке по гористой местности спортсмен должен был двигаться сначала с горы,\n" + " потом в гору, а затем в обратном направлении. Путь туда велосипедист преодолел с горы за 20 мин,\n" + " в гору за 45 мин, а путь обратно — с горы за 25 мин, в гору за 35 мин. \n" + "Какова скорость велосипедиста в гору, если путь в одном направлении равен 17 км?");
    }
    
    
}

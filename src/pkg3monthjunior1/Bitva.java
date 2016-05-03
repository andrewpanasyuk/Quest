/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3monthjunior1;

import static java.lang.Thread.sleep;

/**
 *
 * @author a_pan
 */
public class Bitva {
    User user;
    Dragon dragon;
    int zreb;
    
    
    public Bitva(User user, Dragon dragon, int zreb) {
        this.dragon = dragon;
        this.user = user;
        this.zreb = zreb;
        
    }
    
   public void poedinok() throws Exception{
       int n = 0;
       sleep(2500);
       while (true){
      if (dragon.getBronya() > 0){
          udarUser();
          n++;
          if (dragon.getBronya()>0){
              System.out.println("Posle udara " + user.getName() + " #" + n + " , pooedinok prodolzaetsya");
              System.out.println("U Drakona ostalos broni - " + dragon.getBronya());
              sleep(4000);
              udarDragon();
              if (user.getBronya() > 0){
                  System.out.println("Posle udara drakona #" + n + " , pooedinok prodolzaetsya");
                  System.out.println("U " + user.getName() + " ostalos broni - " + user.getBronya());
                  System.out.println("-----------------------------------------------------------");
                  sleep(5000);
              } else {
                  System.out.println("Posle udara Drakona #" + n + " , pooedinok zavershen!!!!");
                  sleep(3000);
                  System.out.println("Pobeditel - Drakon!!!!");
                  break;
              }
          } else {
              System.out.println("Posle udara" + user.getName() + " #" + n + " , pooedinok zavershen!!!!");
              sleep(3000);
              System.out.println("Pobeditel - " + user.getName() + "!!!!");
              break;
          }
      }
      }
   }
           
   
public void udarUser(){
    int udar = (int) (Math.random() * user.getAtack());
    dragon.setBronya(dragon.getBronya() - udar/2);
   
}
public void udarDragon(){
    int udar = (int) (Math.random() * dragon.getAtack());
    user.setBronya(user.getBronya() - udar/2);
   
}
   
 
    
    
}

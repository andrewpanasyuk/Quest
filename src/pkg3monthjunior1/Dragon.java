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
public class Dragon {
    public int level = 200;
    public int atack;
    public int bronya;

    public Dragon() {
        setAtack((int) (Math.random() * getLevel()));
        setBronya(getLevel()-getAtack());
    }
    
    

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getAtack() {
        return atack;
    }

    public void setAtack(int atack) {
        this.atack = atack;
    }

    public int getBronya() {
        return bronya;
    }

    public void setBronya(int bronya) {
        this.bronya = bronya;
    }
    
    
    
    
}

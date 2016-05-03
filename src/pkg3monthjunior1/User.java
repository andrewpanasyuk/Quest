
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
public class User {
    public String name;
    public String sex;
    public String race;
    public int level = 100;
    public Way way;
    public int atack;
    public int bronya;
    

public String raspredeleniePower (int perc){
    if (perc <= 100 || perc == 666){
        delimPower(perc);
        return "Ok";
    }
    setBronya(10);
    setAtack(10);
    return "Hitrit vzdumal!!!!";
}
public void delimPower(int prc){
    
    if (prc == 666){
        setAtack(1000);
        setBronya(1000);
    } else {
        setBronya(getLevel()/100*prc);
        setAtack(getLevel()-getBronya());
                
    }
}
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
    public void setRaceUser(int n){
        if (n == 1){
            setRace("Gnom");
        } else if (n == 2){
            setRace("Elf");
        } else if (n == 3) {
            setRace("Ork");
        } else if (n == 666){
            setRace("Trol");
            setLevel(1000);
        } else {
            setRace("Newedoma zverushka");
            setLevel(50);
        }
    }
    public void setSexUser(int n){
        if (n == 1){
        setSex("boy");
        } else if (n == 2) {
            setSex("gerl");
        } else if (n == 666){
            setSex("Trololo");
        } else {
           setSex("ono");
            System.out.println("Nu raz ne znaesh... zapishem 'neopredelennyj'"); 
        }
    }
    public void kakoyWay(int n){
        if (n == 1){
            setWay(new Forest());
        } else if (n == 2){
            setWay(new River());
        } else if (n == 3){
            setWay(new Mountain());
        } else {
            System.out.println("Game over..... Vnimatelnee nado...");
        }
    }

    public Way getWay() {
        return way;
    }

    public void setWay(Way way) {
        this.way = way;
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

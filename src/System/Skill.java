/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package System;

import player.Hit;

/**
 * @version 1
 *เป็นclassที่จะส่งค่าdamageกลับไปยัง class Attack ทั้ง2 เพื่อนำกลับไปยังBattleเพื่อนำมาคำนวณต่อ
 * @author mark
 */
public class Skill {

    private int rd, cri;
    private double dam;
    private String hit;
    private Randomsm ran = new Randomsm();

    /**
     *
     * @return เป็น methods ที่ส่งค่า random จาก class Randomsmเพื่อให้ methods ของ powerมาคำนวณ cri หรือ คริคอต
     */
    
    public int random() {
        rd = ran.Random();
        return rd;
    }

    /**
     *เรียกใช้methods random เพื่อหาค่า cri เพื่อนำมา่คิดต่อ
     * @return เป็น methods ที่ส่งค่า cri เพื่อให้ methods อื่นๆในนี้มาคำนวณ damage เพื่อนำไปส่งยัง class Attack ทั้ง2 เพื่อนำกลับไปยังBattleเพื่อนำมาคำนวณต่อ
     * เเละยังprint enum ที่จะบอกสถานะของ cri ที่สุ่มออกมา
     */
    
    public int power() {
        random();
        if (rd == 1) {
            cri = 2;
        } else if (rd == 6) {
            cri = 0;
        } else {
            cri = 1;
        }

        switch (cri) {
            case 1:
                System.out.println(Hit.normal);
                break;
            case 2:
                System.out.println(Hit.Super);
                break;
            case 0:
                System.out.println(Hit.miss);
        }
        return cri;
    }

    //swordman
    
    /**
     *เรียกใช้methods power เพื่อนำค่า cri มาคำนวณdamageจากนั้นส่งกลับไปยัง class Attack ทั้ง2 เพื่อนำกลับไปยังBattleเพื่อนำมาคำนวณต่อ
     * @return 
     */
  
    public double slash() {
        power();
        if (cri == 0) {
            dam = 0;
        } else {
            dam = 100 * cri + 50;
        }

        return dam;
    }

    /**
     *เรียกใช้methods power เพื่อนำค่า cri มาคำนวณdamageจากนั้นส่งกลับไปยัง class Attack ทั้ง2 เพื่อนำกลับไปยังBattleเพื่อนำมาคำนวณต่อ
     * @return 
     */
    
    public double couter() {
        power();
        if (cri == 0) {
            dam = 0;
        } else {
            dam = 150 * cri + 100;
        }

        return dam;
    }

    /**
     *เรียกใช้methods power เพื่อนำค่า cri มาคำนวณdamageจากนั้นส่งกลับไปยัง class Attack ทั้ง2 เพื่อนำกลับไปยังBattleเพื่อนำมาคำนวณต่อ
     * @return 
     */
    
    public double double_blade() {
        power();
        if (cri == 0) {
            dam = 0;
        } else {
            dam = 150 * cri + 30;
        }

        return dam;
    }

    /**
     *เรียกใช้methods power เพื่อนำค่า cri มาคำนวณdamageจากนั้นส่งกลับไปยัง class Attack ทั้ง2 เพื่อนำกลับไปยังBattleเพื่อนำมาคำนวณต่อ
     * @return 
     */
    
    public double star_brust() {
        power();
        if (cri == 0) {
            dam = 0;
        } else {
            dam = 400 * cri;
        }

        return dam;
    }

//Gunner
    
    /**
     *เรียกใช้methods power เพื่อนำค่า cri มาคำนวณdamageจากนั้นส่งกลับไปยัง class Attack ทั้ง2 เพื่อนำกลับไปยังBattleเพื่อนำมาคำนวณต่อ
     * @return 
     */
    
    public double boom() {
        power();
        if (cri == 0) {
            dam = 0;
        } else {
            dam = 150 * cri + 100;
        }

        return dam;
    }

    /**
     *เรียกใช้methods power เพื่อนำค่า cri มาคำนวณdamageจากนั้นส่งกลับไปยัง class Attack ทั้ง2 เพื่อนำกลับไปยังBattleเพื่อนำมาคำนวณต่อ
     * @return 
     */
    
    public double laser() {
        power();
        if (cri == 0) {
            dam = 0;
        } else {
            dam = 200 * cri + 100;
        }

        return dam;
    }

    /**
     *เรียกใช้methods power เพื่อนำค่า cri มาคำนวณdamageจากนั้นส่งกลับไปยัง class Attack ทั้ง2 เพื่อนำกลับไปยังBattleเพื่อนำมาคำนวณต่อ
     * @return 
     */
    
    public double bullet() {
        power();
        if (cri == 0) {
            dam = 0;
        } else {
            dam = 100 * cri + 50;
        }

        return dam;
    }
    
    /**
     *เรียกใช้methods power เพื่อนำค่า cri มาคำนวณdamageจากนั้นส่งกลับไปยัง class Attack ทั้ง2 เพื่อนำกลับไปยังBattleเพื่อนำมาคำนวณต่อ
     * @return 
     */

    public double throw_gun() {
        power();
        if (cri == 0) {
            dam = 0;
        } else {
            dam = 200 * cri + 50;
        }

        return dam;
    }

//Magician
    
    /**
     *เรียกใช้methods power เพื่อนำค่า cri มาคำนวณdamageจากนั้นส่งกลับไปยัง class Attack ทั้ง2 เพื่อนำกลับไปยังBattleเพื่อนำมาคำนวณต่อ
     * @return 
     */
    
    public double fireball() {
        power();
        if (cri == 0) {
            dam = 0;
        } else {
            dam = 100 * cri * 2;
        }

        return dam;
    }

    /**
     *เรียกใช้methods power เพื่อนำค่า cri มาคำนวณdamageจากนั้นส่งกลับไปยัง class Attack ทั้ง2 เพื่อนำกลับไปยังBattleเพื่อนำมาคำนวณต่อ
     * @return 
     */
    
    public double watergun() {
        power();
        if (cri == 0) {
            dam = 0;
        } else {
            dam = 100 * cri + 200;
        }

        return dam;
    }

    /**
     *เรียกใช้methods power เพื่อนำค่า cri มาคำนวณdamageจากนั้นส่งกลับไปยัง class Attack ทั้ง2 เพื่อนำกลับไปยังBattleเพื่อนำมาคำนวณต่อ
     * @return 
     */
    
    public double thuderstrike() {
        power();
        if (cri == 0) {
            dam = 0;
        } else {
            dam = 300 * cri;
        }

        return dam;
    }

    /**
     *เรียกใช้methods power เพื่อนำค่า cri มาคำนวณdamageจากนั้นส่งกลับไปยัง class Attack ทั้ง2 เพื่อนำกลับไปยังBattleเพื่อนำมาคำนวณต่อ
     * @return 
     */
    
    public double windblade() {
        power();
        if (cri == 0) {
            dam = 0;
        } else {
            dam = 150 * cri + 50;
        }

        return dam;
    }

//boxing
    
    /**
     *เรียกใช้methods power เพื่อนำค่า cri มาคำนวณdamageจากนั้นส่งกลับไปยัง class Attack ทั้ง2 เพื่อนำกลับไปยังBattleเพื่อนำมาคำนวณต่อ
     * @return 
     */
    
    public double punch() {
        power();
        if (cri == 0) {
            dam = 0;
        } else {
            dam = 100 * cri + 200;
        }

        return dam;
    }

/**
     *เรียกใช้methods power เพื่อนำค่า cri มาคำนวณdamageจากนั้นส่งกลับไปยัง class Attack ทั้ง2 เพื่อนำกลับไปยังBattleเพื่อนำมาคำนวณต่อ
     * @return 
     */
    
    public double smash() {
        power();
        if (cri == 0) {
            dam = 0;
        } else {
            dam = 100 * cri + 50;
        }

        return dam;
    }

    /**
     *เรียกใช้methods power เพื่อนำค่า cri มาคำนวณdamageจากนั้นส่งกลับไปยัง class Attack ทั้ง2 เพื่อนำกลับไปยังBattleเพื่อนำมาคำนวณต่อ
     * @return 
     */
    
    public double one_punch() {
        power();
        if (cri == 0) {
            dam = 0;
        } else {
            dam = 400 * cri;
        }

        return dam;
    }

    /**
     *เรียกใช้methods power เพื่อนำค่า cri มาคำนวณdamageจากนั้นส่งกลับไปยัง class Attack ทั้ง2 เพื่อนำกลับไปยังBattleเพื่อนำมาคำนวณต่อ
     * @return 
     */
    
    public double one_break() {
        power();
        if (cri == 0) {
            dam = 0;
        } else {
            dam = 200 * cri + 50;
        }

        return dam;
    }
}

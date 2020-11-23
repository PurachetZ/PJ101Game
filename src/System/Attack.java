/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package System;

import test.Hit;
import test.Randomsm;

/**
 *
 * @author mark
 */
public class Attack {

    private int rd, cri;
    private double dam;
    private String hit;

    private Randomsm ran = new Randomsm();
//คิดพลัง

    //random
    public int random() {
        rd = ran.Random();
        return rd;
    }

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
                System.out.println(Hit.hit.normal);
                break;
            case 2:
                System.out.println(Hit.hit.Super);
                break;
            case 0:
                System.out.println(Hit.hit.miss);
        }
        return cri;
    }

    //swordman
    public double slash() {
        power();
        if (cri == 0) {
            dam = 0;
        } else {
            dam = 100 * cri + 50;
        }

        return dam;
    }

    public double couter() {
        power();
        if (cri == 0) {
            dam = 0;
        } else {
            dam = 150 * cri + 100;
        }

        return dam;
    }

    public double double_blade() {
        power();
        if (cri == 0) {
            dam = 0;
        } else {
            dam = 150 * cri + 30;
        }

        return dam;
    }

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
    public double boom() {
        power();
        if (cri == 0) {
            dam = 0;
        } else {
            dam = 150 * cri + 100;
        }

        return dam;
    }

    public double laser() {
        power();
        if (cri == 0) {
            dam = 0;
        } else {
            dam = 200 * cri + 100;
        }

        return dam;
    }

    public double bullet() {
        power();
        if (cri == 0) {
            dam = 0;
        } else {
            dam = 100 * cri + 50;
        }

        return dam;
    }

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
    public double fireball() {
        power();
        if (cri == 0) {
            dam = 0;
        } else {
            dam = 100 * cri * 2;
        }

        return dam;
    }

    public double watergun() {
        power();
        if (cri == 0) {
            dam = 0;
        } else {
            dam = 100 * cri + 200;
        }

        return dam;
    }

    public double thuderstrike() {
        power();
        if (cri == 0) {
            dam = 0;
        } else {
            dam = 300 * cri;
        }

        return dam;
    }

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
    public double punch() {
        power();
        if (cri == 0) {
            dam = 0;
        } else {
            dam = 100 * cri + 200;
        }

        return dam;
    }

    public double smash() {
        power();
        if (cri == 0) {
            dam = 0;
        } else {
            dam = 100 * cri + 50;
        }

        return dam;
    }

    public double one_punch() {
        power();
        if (cri == 0) {
            dam = 0;
        } else {
            dam = 400 * cri;
        }

        return dam;
    }

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

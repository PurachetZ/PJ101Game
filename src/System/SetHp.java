/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package System;

/**
 *
 * @author mark
 */
public class SetHp {

    private double HP1, HP2, P1, P2;

    public SetHp(int P1, int P2) {
        this.P1 = P1;
        this.P2 = P2;
    }

    public void setHP1() {
        if (this.P1 == 1) {
            HP1 = 2500;
        } else if (this.P1 == 2) {
            HP1 = 2000;
        } else if (this.P1 == 3) {
            HP1 = 1900;
        } else if (this.P1 == 4) {
            HP1 = 1800;
        }
    }

    public void setHP2() {
        if (this.P2 == 1) {
            HP2 = 2500;
        } else if (this.P2 == 2) {
            HP2 = 2000;
        } else if (this.P2 == 3) {
            HP2 = 1900;
        } else if (this.P2 == 4) {
            HP2 = 1800;
        }
    }

    public double HP1() {
        setHP1();
        return HP1;
    }

    public double HP2() {
        setHP2();
        return HP2;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package System;

import Play2.Skill2;
import Play1.Skill1;

/**
 *
 * @author mark
 */
public class Battle {

    private double HP1, HP2;
    private int P1, P2, Turn, p, player;
    private Skill2 s2 = new Skill2();
    private Skill1 s1 = new Skill1();

    public Battle(int P1, int P2, double HP1, double HP2, int player) {
        this.HP1 = HP1;
        this.HP2 = HP2;
        this.P1 = P1;
        this.P2 = P2;
        this.player = player;
    }

    public int battlepokemon(int turn) {
        Turn = p(turn);
        if (this.player == 1) {
            if (turn % 2 == 1) {
                switch (this.P1) {
                    case 1:
                        s1.Swordman(1);
                        break;
                    case 2:
                        s1.Gunner(1);

                        break;
                    case 3:
                        s1.Magician(1);

                        break;
                    case 4:
                        s1.Boxing(1);

                        break;
                }
            } else if (turn % 2 == 0) {
                switch (this.P2) {
                    case 1:
                        s1.Swordman(2);

                        break;
                    case 2:
                        s1.Gunner(2);

                        break;
                    case 3:
                        s1.Magician(2);
                        break;
                    case 4:
                        s1.Boxing(2);

                        break;
                }
            }
            return s1.dam();
        } else {
            if (turn % 2 == 1) {
                switch (this.P1) {
                    case 1:
                        s2.Swordman(1);
                        break;
                    case 2:
                        s2.Gunner(1);

                        break;
                    case 3:
                        s2.Magician(1);

                        break;
                    case 4:
                        s2.Boxing(1);

                        break;
                }
            } else if (turn % 2 == 0) {
                switch (this.P2) {
                    case 1:
                        s2.Swordman(2);

                        break;
                    case 2:
                        s2.Gunner(2);

                        break;
                    case 3:
                        s2.Magician(2);
                        break;
                    case 4:
                        s2.Boxing(2);

                        break;
                }
            }
            return s2.dam();
        }
    }

    public void damagee(int turn) {
        if (this.player == 1) {
            if (turn % 2 == 0) {
                HP1 = HP1 - s1.dam();
                if (HP1 <= 0) {
                    HP1 = 0;
                }
            } else {

                HP2 = HP2 - s1.dam();
                if (HP2 <= 0) {
                    HP2 = 0;
                }
            }
        }
        else if (this.player == 2) {
            if (turn % 2 == 0) {
                HP1 = HP1 - s2.dam();
                if (HP1 <= 0) {
                    HP1 = 0;
                }
            } else {

                HP2 = HP2 - s2.dam();
                if (HP2 <= 0) {
                    HP2 = 0;
                }
            }
    }
    } 

    public int HP1() {
        return (int) this.HP1;
    }

    public int HP2() {
        return (int) this.HP2;
    }

    public int p(int turn) {
        if (turn % 2 == 1) {
            p = 1;
        } else if (turn % 2 == 0) {
            p = 2;
        }
        return p;
    }

    @Override
    public String toString() {
        if (this.player == 1) {
            return "P1 :  HP= " + HP1 + "  P2 : HP=" + HP2 + "  Dammage" + "" + p(Turn) + " : " + s1.dam();
        } else {
            return "P1 :  HP= " + HP1 + "  P2 : HP=" + HP2 + "  Dammage" + "" + p(Turn) + " : " + s2.dam();
        }
    }
}

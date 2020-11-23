/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Play1;


import System.Attack;
import java.util.Scanner;
import test.Randomsm;

/**
 *
 * @author mark
 */
public class Skill1 {

    private int p, choose, dam;
    private Scanner cs = new Scanner(System.in);
    private Attack at = new Attack();
    private Randomsm ran = new Randomsm();

    public int p(int turn) {
        if (turn % 2 == 1) {
            p = 1;
        } else if (turn % 2 == 0) {
            p = 2;
        }
        return p;
    }

    public int Swordman(int p) {
        String skill = "1. slash \n"
                + "2. couter \n"
                + "3. double blade\n"
                + "4. star brust";
        do {
               if (p == 1) {
                System.out.println("");
                System.out.println(skill);
                System.out.print("P" + p + " choose skill:");
                choose = cs.nextInt();
            } else if (p == 2) {
                choose = ran.Randomskill();
            }
            switch (choose) {
                case 1:
                    dam = (int) at.slash();
                    break;
                case 2:
                    dam = (int) at.couter();
                    break;
                case 3:
                    dam = (int) at.double_blade();
                    break;
                case 4:
                    dam = (int) at.star_brust();
                    break;
            }
        } while (choose != 1 && choose != 2 && choose != 3 && choose != 4);
        return dam;
    }

    public int Gunner(int p) {
        String skill = "1. boom \n"
                + "2. laser \n"
                + "3. bullet\n"
                + "4. throw gun";

        do {
               if (p == 1) {
                System.out.println("");
                System.out.println(skill);
                System.out.print("P" + p + " choose skill:");
                choose = cs.nextInt();
            } else if (p == 2) {
                choose = ran.Randomskill();
            }
            switch (choose) {
                case 1:
                    dam = (int) at.boom();
                    break;
                case 2:
                    dam = (int) at.laser();
                    break;
                case 3:
                    dam = (int) at.bullet();
                    break;
                case 4:
                    dam = (int) at.throw_gun();
                    break;
            }
        } while (choose != 1 && choose != 2 && choose != 3 && choose != 4);
        return dam;
    }

    public int Magician(int p) {
        String skill = "1. fireball \n"
                + "2. watergun \n"
                + "3. thuderstrike\n"
                + "4. windblade";

        do {
            if (p == 1) {
                System.out.println("");
                System.out.println(skill);
                System.out.print("P" + p + " choose skill:");
                choose = cs.nextInt();
            } else if (p == 2) {
                choose = ran.Randomskill();
            }
            switch (choose) {
                case 1:
                    dam = (int) at.fireball();
                    break;
                case 2:
                    dam = (int) at.watergun();
                    break;
                case 3:
                    dam = (int) at.thuderstrike();
                    break;
                case 4:
                    dam = (int) at.windblade();
                    break;
            }
        } while (choose != 1 && choose != 2 && choose != 3 && choose != 4);
        return dam;
    }

    public int Boxing(int p) {

        String skill = "1. punch \n"
                + "2. smash \n"
                + "3. one punch\n"
                + "4. one break";

        do {
             if (p == 1) {
                System.out.println("");
                System.out.println(skill);
                System.out.print("P" + p + " choose skill:");
                choose = cs.nextInt();
            } else if (p == 2) {
                choose = ran.Randomskill();
            }
            switch (choose) {
                case 1:
                    dam = (int) at.punch();
                    break;
                case 2:
                    dam = (int) at.smash();
                    break;
                case 3:
                    dam = (int) at.one_punch();
                    break;
                case 4:
                    dam = (int) at.one_break();
                    break;
            }
        } while (choose != 1 && choose != 2 && choose != 3 && choose != 4);

        return dam;
    }

    public int dam() {
        return dam;
    }

    
}

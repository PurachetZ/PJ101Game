/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author mark
 */
import java.util.Random;

public class Randomsm {
private Random rc = new Random();
    private int ran,player;

    public int Random() {
        ran = rc.nextInt(6) + 1;
        return ran;
    }

    public int Randomskill(){
     player= rc.nextInt(4)+1;
    return player;
    }
}

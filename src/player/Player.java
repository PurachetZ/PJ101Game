/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package player;

/**
 * @version 2
 *เป็น class ที่ทำการส่งข้อมูลของเลือกเเละอาชีพให้ไฟล์ class Battle
 * @author PurachetZ
 */
public class Player {
    private double hp;
    private Job job;

    /**
    *method นี้จะรับการจากการรับข้อมูลผ่านเเป้นพิมมาเเล้วนำมาเข้าเงื่อนไข switch 
    *เพื่อทำการเลือกตัวละครเเละเลือด
    *@paramp1jop จะเป๋นตัวที่จะนับค่าจาก class Play
    */
    public Player(int p1Job) {
        switch (p1Job) {
            case 1:
                this.hp = 2500;
                this.job = Job.Swordman;
                break;
            case 2:
                this.hp = 2000;
                this.job = Job.Gunner;
                break;
            case 3:
                this.hp = 1900;
                this.job = Job.Magician;
                break;
            case 4:
                this.hp = 1800;
                this.job = Job.Boxing;
                break;
        }
        
    }
    
    /**
    *@return จะreturnค่าของอาชีพตัวละครกลับไปยัง class Play
    */
    
    public Job getJob(){
        return this.job;
    }
    
    /**
    *@return จะreturnค่าของพลังชีวิตของตัวละครกลับไปยัง class Play
    */
    
    public double getHp() {
        return this.hp;
    }
    
    
}

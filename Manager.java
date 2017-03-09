/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AT
 */
public class Manager extends Employee{
    
    private int bonus = 0;

    public Manager(String name, String address, int salary) {
        super(name, address, salary);
    }
    
    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    @Override
    public int getSalary() {
        super.setSalary(super.getSalary() + bonus);
        return super.getSalary(); //To change body of generated methods, choose Tools | Templates.
    }


    
    
}

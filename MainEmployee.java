
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AT
 */
public class MainEmployee {
    public static void main (String[] args){
        Manager boss = new Manager("Agus", "Bandung", 8000000);
        boss.setBonus(2000000);
        
        Employee[] employee = new Employee[3];
        employee[0] = boss;
        employee[1] = new Staff("Achmad", "Bandung", 4000000);
        employee[2] = new Staff("Try", "Cimahi", 3500000);
        
        for (int i = 0; i < 3; i++) {
            System.out.println(employee[i].getName() + " \t " +
                    employee[i].getAddress() + " \t " + employee[i].getSalary());
        }

    }
}

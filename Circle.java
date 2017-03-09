/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AT
 */
public class Circle extends Shape {

    @Override
    public void getArea() {
        System.out.println("phi * r^2");
    }

    @Override
    public void getName() {
        System.out.println("Circle");
    }
    
}

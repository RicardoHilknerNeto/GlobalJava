/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

/**
 *
 * @author netoh
 */

public class Oceans {
    public static Object oceans;
        public String name;
        public double pH;
        public double flow;

        public Oceans(String name, double pH, double flow) {
            this.name = name;
            this.pH = pH;
            this.flow = flow;
        }

        public double getPH() {
            return pH;
        }

       
    }
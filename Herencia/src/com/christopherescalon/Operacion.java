package com.christopherescalon;

/**
 * Created by christopher.escalon on 5/2/2017.
 */
public class Operacion {
        double n1;
        double n2;
        double res;
        char operacion;

        public double getN1() {
            return n1;
        }

        public void setN1(double n1) {
            this.n1 = n1;
        }

        public double getN2() {
            return n2;
        }

        public void setN2(double n2) {
            this.n2 = n2;
        }

        public double getRes() {
            return res;
        }

        public void setRes(double res) {
            this.res = res;
        }

        public char getOperacion() {
            return operacion;
        }

        public void setOperacion(char operacion) {
            this.operacion = operacion;
        }



        public Operacion(double n1, double n2, char operacion){
            this.n1=n1;
            this.n2=n2;
            this.operacion=operacion;
        }

        public void mostrarResultado(){
            System.out.println( this.n1 + "" + this.operacion + "" + this.n2);
            System.out.println( this.res);
        }





}

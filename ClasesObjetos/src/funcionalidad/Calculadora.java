/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcionalidad;

/**
 *
 * @author user
 */
public class Calculadora {

    private int op1;
    private int op2;

    public Calculadora(int op1, int op2) {
        if (op1 > op2)
            this.op1 = op1;
        else
            this.op1 = op2;
        this.op2 = op2;
    }

    public int getOp1() {
        return op1;
    }

    public void setOp1(int op1) {
        this.op1 = op1;
    }

    public int getOp2() {
        return op2;
    }

    public void setOp2(int op2) {
        if (op2 > this.op1)
        this.op2 = op2;
    }

    public int sumar() {
        int resultado = this.op1 + this.op2;
        return resultado;
    }

    public int restar() {
        int resultado = 0;
        
        return this.op1 - this.op2;
        
//        return resultado;
    }

}

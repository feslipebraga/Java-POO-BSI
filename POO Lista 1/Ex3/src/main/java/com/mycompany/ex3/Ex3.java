package com.mycompany.ex3;
public class Ex3 {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Felipe", 18, 68.0f, 1.76f);
        p1.engordar(3.2f);
        p1.emagrecer(2.2f);
        p1.crescer(0.01f);
        p1.envelhecer();
        System.out.println(p1);
    }
}

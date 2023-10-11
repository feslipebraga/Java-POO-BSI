package com.mycompany.ex4;

public class Ex4 {

    public static void main(String[] args) {
        TV tv = new TV("JVC", 70);
        tv.aumentarVolume(20);
        tv.alterarCanal(23);
        tv.status();
    }
}

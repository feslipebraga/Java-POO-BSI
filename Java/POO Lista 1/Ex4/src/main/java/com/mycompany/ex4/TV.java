package com.mycompany.ex4;

public class TV {
    private String marca;
    private int tamanho;
    private int canal;
    private int volume;

    // As TVS serão criadas pré configuradas no canal 1 e com volume 20.
    public TV(String marca, int tamanho) {
        this.marca = marca;
        this.tamanho = tamanho;
        this.canal = 1;
        this.volume = 20;
    }

    public void alterarCanal(int novoCanal) {
        if (novoCanal >= 1 && novoCanal <= 100){
            this.canal = novoCanal;
            System.out.println("Canal alterado com sucesso.");
        } else {
            System.out.println("-- ERRO: Canal " + novoCanal + " inválido. Não foi possível alterar.");
        }
    }
    
    public void aumentarVolume(int aumenta){
        int novoVolume = this.volume + aumenta;
        if (novoVolume < 100 && novoVolume >= 0){
            this.volume += aumenta;
        } else if (novoVolume > 100) {
            this.volume = 100;
            System.out.println("Volume máximo permitido: 100. Alterado para o máximo.");
        } else {
            System.out.println("-- ERRO: Não foi possível aumentar para o volume desejado.");
        }
    }
    
    public void diminuirVolume(int diminui){
        int novoVolume = this.volume - diminui;
        if (novoVolume > 0 && novoVolume <= 100){
            this.volume -= diminui;
        } else if (novoVolume < 0) {
            this.volume = 0;
            System.out.println("Volume mínimo permitido: 0. Alterado para o mínimo.");
        } else {
            System.out.println("-- ERRO: Não foi possível diminuir para o volume desejado.");
        }
    }
    
    public void status(){
        System.out.println("** SOBRE A TV");
        System.out.println("Marca: " + this.marca);
        System.out.println("Tamanho: " + this.tamanho + " polegadas");
        System.out.println("Canal atual: " + this.canal);
        System.out.println("Volume atual: " + this.volume);
    }
}

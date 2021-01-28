package main;

import enuns.Models;

public class Main {

    public static void main(String[] args) {
        System.out.println("Executando");
        Utilizar utilizar = new Utilizar();
        String resultado = utilizar.resultado(Models.Rota.ROTA_ALTERNATIVA);
        System.out.println(resultado);
        System.out.println("Finalizando");
    }
}
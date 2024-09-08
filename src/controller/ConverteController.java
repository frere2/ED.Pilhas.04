package controller;

import br.edu.fateczl.thiago.pilhas.Pilha;

public class ConverteController {
    public String bin(int decimal) {
        Pilha pilha = new Pilha();

        while (decimal > 0) {
            int resto = decimal % 2;
            pilha.push(resto);
            decimal = decimal / 2;
        }

        StringBuilder binario = new StringBuilder();
        while (!pilha.isEmpty()) {
            binario.append(pilha.pop());
        }

        return binario.toString();
    }
}

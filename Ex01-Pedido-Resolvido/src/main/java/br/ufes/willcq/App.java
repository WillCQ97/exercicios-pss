package br.ufes.willcq;

import br.ufes.willcq.pedido.Pedido;
import br.ufes.willcq.pedido.state.Processando;

/**
 * App Pedido
 */
public class App {
    public static void main(String[] args) {
        try {
            Pedido p1 = new Pedido();
            p1.setEstado(new Processando(p1));
            
            p1.cancelar();
            p1.enviar();

        } catch (IllegalStateException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}

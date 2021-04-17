package br.ufes.willcq.pedido;

import br.ufes.willcq.pedido.state.PedidoState;

public class Pedido {

    private PedidoState estado;

    public void alterar() {
        estado.alterar();
    }

    public void cancelar() {
        estado.cancelar();
    }

    public void enviar() {
        estado.enviar();
    }
    
    public void setEstado(PedidoState novoEstado){
        this.estado = novoEstado;
    }

}

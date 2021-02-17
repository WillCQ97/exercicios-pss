package br.ufes.willcq.pedido.state;

import br.ufes.willcq.pedido.Pedido;

public class Cancelado implements PedidoState{

    private Pedido pedido;

    public Cancelado(Pedido pedido){
        this.pedido = pedido;
    }

    @Override
    public void alterar() {
        String msg = "Não é possível alterar um pedido cancelado";
        throw new IllegalStateException(msg);
    }

    @Override
    public void cancelar() {
        String msg = "Não é possível cancelar novamente um pedido cancelado";
        throw new IllegalStateException(msg);
    }

    @Override
    public void enviar() {
        String msg = "Não é possível enviar um pedido cancelado";
        throw new IllegalStateException(msg);
    }

}

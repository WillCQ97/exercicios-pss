package br.ufes.willcq.pedido.state;

import br.ufes.willcq.pedido.Pedido;

public class Processando implements PedidoState {

    private Pedido pedido;

    public Processando(Pedido pedido) {
        this.pedido = pedido;
    }

    @Override
    public void alterar() {
        // métodos para alterar os dados do pedido
    }

    @Override
    public void cancelar() {
        pedido.setEstado(new Cancelado(pedido));
    }

    @Override
    public void enviar() {
        pedido.setEstado(new Enviado(pedido));
    }

}

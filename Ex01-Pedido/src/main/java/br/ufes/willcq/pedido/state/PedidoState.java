package br.ufes.willcq.pedido.state;

/**
 * PedidoState
 */
public interface PedidoState {

    public void alterar();
    public void cancelar();
    public void enviar();

}
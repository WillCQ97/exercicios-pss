package br.ufes.willcq.pedido.state;

import br.ufes.willcq.pedido.Pedido;

public class Enviado implements PedidoState{

    private Pedido pedido;

    public Enviado(Pedido pedido){
        this.pedido = pedido;
    }

    @Override
    public void alterar() {
        String msg = "Não é possivel alterar um pedido enviado";
        throw new IllegalStateException(msg);
    }

    @Override
    public void cancelar() {
        String msg = "Não é possivel cancelar um pedido enviado";
        throw new IllegalStateException(msg);
    }

    @Override
    public void enviar() {
        String msg = "Não é possivel enviar novamente um pedido já enviado";
        throw new IllegalStateException(msg);
    }
 
}

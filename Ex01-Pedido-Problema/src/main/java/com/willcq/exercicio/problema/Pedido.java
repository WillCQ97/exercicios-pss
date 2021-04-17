package com.willcq.exercicio.problema;

public class Pedido {

    private enum Status {
        PROCESSANDO, CANCELADO, ENVIADO
    };
    private Status status;
    private String msg;

    public void alterar() {
        switch (status) {
            case PROCESSANDO:
                //código para alteração do pedido
                break;
            case CANCELADO:
                msg = "Não é possível alterar um pedido cancelado";
                throw new IllegalStateException(msg);
            case ENVIADO:
                msg = "Não é possível alterar um pedido enviado";
                throw new IllegalStateException(msg);
        }
    }
    
    public void cancelar(){
        //efetua o cancelamento
    }
    
    public void enviar(){
        
    }
}

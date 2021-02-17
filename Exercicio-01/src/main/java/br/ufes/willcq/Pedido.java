package br.ufes.willcq;

public class Pedido {

    private enum Status {
        PROCESSANDO, CANCELADO, ENVIADO
    };

    private Status status;
    private String msg;

    public void alterar() {
        switch (status) {
            case PROCESSANDO:
                // código para alteração do pedido
                break;

            case CANCELADO:
                msg = "Não é possível alterar um pedido cancelado";
                throw new IllegalStateException(msg);

            case ENVIADO:
                msg = "Não é possível alterar um pedido enviado";
                throw new IllegalStateException(msg);
        }
    }

    public void cancelar() {
        switch (status) {
            case PROCESSANDO:
                status = Status.CANCELADO;
                msg = "O pedido foi cancelado";
                break;

            case CANCELADO:
                msg = "Não é possível alterar um pedido cancelado";
                throw new IllegalStateException(msg);

            case ENVIADO:
                msg = "Não é possível alterar um pedido enviado";
                throw new IllegalStateException(msg);
        }
    }

    public void enviar() {
        switch (status) {
            case PROCESSANDO:
                status = Status.ENVIADO;
                msg = "O pedido foi enviado";
                break;

            case CANCELADO:
                msg = "Não é possível alterar um pedido cancelado";
                throw new IllegalStateException(msg);

            case ENVIADO:
                msg = "Não é possível alterar um pedido enviado";
                throw new IllegalStateException(msg);
        }
    }
    }

}

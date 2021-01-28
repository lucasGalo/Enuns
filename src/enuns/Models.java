package enuns;

public enum Models {

    Caminho;

    public static enum Rota{
        ROTA_ALTERNATIVA("192.168.0.2", "rota alternativa para o sistema", "002"),
        ROTA_COMUM("192.168.0.1", "rota padrão para o sistema", "001");

        private final String destino;
        private final String descricao;
        private final String identificacao;

        Rota(String destino, String descricao, String identificacao) {
            this.destino = destino;
            this.descricao = descricao;
            this.identificacao = identificacao;
        }

        public String getDestino() {
            return destino;
        }

        public String getDescricao() {
            return descricao;
        }

        public String getIdentificacao() {
            return identificacao;
        }
    }
}

public class no {
    Integer conteudo;
    no prox;

    public no(Integer conteudo, no prox) {
        this.conteudo = conteudo;
        this.prox = prox;
    }

    public Integer getConteudo() {
        return conteudo;
    }

    public void setConteudo(Integer conteudo) {
        this.conteudo = conteudo;
    }

    public no getProx() {
        return prox;
    }

    public void setProx(no prox) {
        this.prox = prox;
    }
}

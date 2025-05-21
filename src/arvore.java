public class arvore {
    No raiz;

    public arvore (){
        this.raiz = null;
    }

    public int contarNos(No node){
       if(node == null){
           return 0;
       }else{
           return 1 + contarNos(node.filhoEsquerdo) + contarNos(node.filhoDireito);
       }
    }

    public void buscarPreOrderm(No node){
        if (node != null) {
            System.out.println(node.conteudo + " ");
            buscarPreOrderm(node.filhoEsquerdo);
            buscarPreOrderm(node.filhoDireito);
        }
    }

    public void buscarEmOrdem(No node){
        if (node != null){
            buscarEmOrdem(node.filhoEsquerdo);
            System.out.println(node.conteudo + " ");
            buscarEmOrdem(node.filhoDireito);
        }
    }
}

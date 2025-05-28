import java.util.LinkedList;
import java.util.Queue;

public class Arvore {
    No raiz;

    public Arvore() {
        this.raiz = null;
    }

    // Contar todos os Nos
    public int contarNos(No node) {
        if (node == null) return 0;
        return 1 + contarNos(node.filhoEsquerdo) + contarNos(node.filhoDireito);
    }

    // Pré-ordem
    public void percorrerPreOrdem(No node) {
        if (node != null) {
            System.out.print(node.conteudo + " ");
            percorrerPreOrdem(node.filhoEsquerdo);
            percorrerPreOrdem(node.filhoDireito);
        }
    }

    // Em-ordem
    public void percorrerEmOrdem(No node) {
        if (node != null) {
            percorrerEmOrdem(node.filhoEsquerdo);
            System.out.print(node.conteudo + " ");
            percorrerEmOrdem(node.filhoDireito);
        }
    }

    // Pós-ordem
    public void percorrerPosOrdem(No node) {
        if (node != null) {
            percorrerPosOrdem(node.filhoEsquerdo);
            percorrerPosOrdem(node.filhoDireito);
            System.out.print(node.conteudo + " ");
        }
    }

    // Percurso em nível
    public void percorrerNivel(No node) {
        if (node == null) return;
        Queue<No> fila = new LinkedList<>();
        fila.add(node);

        while (!fila.isEmpty()) {
            No atual = fila.poll();
            System.out.print(atual.conteudo + " ");
            if (atual.filhoEsquerdo != null) fila.add(atual.filhoEsquerdo);
            if (atual.filhoDireito != null) fila.add(atual.filhoDireito);
        }
    }

    // Contar folhas
    public int contarFolhas(No node) {
        if (node == null) return 0;
        if (node.filhoEsquerdo == null && node.filhoDireito == null) return 1;
        return contarFolhas(node.filhoEsquerdo) + contarFolhas(node.filhoDireito);
    }
}

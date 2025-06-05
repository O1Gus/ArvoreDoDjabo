public class diabin {
    public static void main(String[] args) {
        Arvore arvore = new Arvore();
        ArvoreAVL arvoreAVL = new ArvoreAVL();

        // Arvore do djabo:
        //         A
        //       /   \
        //     B       C
        //    / \       \
        //   D   E       F

        /*arvore.raiz = new No("A");
        arvore.raiz.filhoEsquerdo = new No("B");
        arvore.raiz.filhoDireito = new No("C");
        arvore.raiz.filhoEsquerdo.filhoEsquerdo = new No("D");
        arvore.raiz.filhoEsquerdo.filhoDireito = new No("E");
        arvore.raiz.filhoDireito.filhoDireito = new No("F");

        System.out.println("Contagem de nós: " + arvore.contarNos(arvore.raiz));
        System.out.println("Contagem de folhas: " + arvore.contarFolhas(arvore.raiz));

        System.out.print("Pré-ordem: ");
        arvore.percorrerPreOrdem(arvore.raiz);
        System.out.println();

        System.out.print("Em-ordem: ");
        arvore.percorrerEmOrdem(arvore.raiz);
        System.out.println();

        System.out.print("Pós-ordem: ");
        arvore.percorrerPosOrdem(arvore.raiz);
        System.out.println();

        System.out.print("Por nível: ");
        arvore.percorrerNivel(arvore.raiz);
        System.out.println();*/

        arvoreAVL.inserirDados("aa, adada");


    }
}

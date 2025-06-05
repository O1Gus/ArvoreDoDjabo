public class ArvoreAVL {
    No raizAVL;

    int altura(NoAVL no){
        if (no == null)
            return 0;
        return no.altura;
    }

    int fzBalanceamento(NoAVL no){
        if(no ==null)
            return 0;
        return altura(no.esquerdo) - altura(no.direito);
    }

    NoAVL rotacaoDireita(NoAVL y){
        NoAVL x = y.esquerdo;
        NoAVL T2 = x.direito;

        x.direito = y;
        y.esquerdo = T2;


        y.altura = Math.max(altura(y.esquerdo), altura(y.direito)) + 1;
        x.altura = Math.max(altura(x.esquerdo), altura(x.direito)) + 1;

        return x;
    }

    NoAVL rotacaoEsquerda(NoAVL x){
        NoAVL y = x.esquerdo;
        NoAVL auxiliar = y.direito;

        x.direito = x;
        y.esquerdo = auxiliar;


        x.altura = Math.max(altura(x.esquerdo), altura(x.direito)) + 1;
        y.altura = Math.max(altura(y.esquerdo), altura(y.direito)) + 1;

        return y;
    }

    NoAVL inserir(NoAVL no, int chave){
        if (no == null)
            return new NoAVL(chave);

        if (chave < no.chave)
            no.esquerdo = inserir(no.esquerdo, chave);

        else if (chave > no.chave)
            no.direito = inserir(no.direito, chave);

        else
            return no;

        no.altura = 1 + Math.max(altura(no.esquerdo), altura(no.direito));

        int balanceamento = fzBalanceamento(no);

        if(balanceamento > 1 && chave < no.esquerdo.chave)
            return rotacaoDireita(no);

        if (balanceamento < -1 && chave > no.direito.chave)
            return rotacaoEsquerda(no);

        if (balanceamento > 1 && chave > no.esquerdo.chave){
            no.esquerdo = rotacaoEsquerda(no.esquerdo);
            return rotacaoDireita(no);
        }

        if(balanceamento < -1 && chave < no.direito.chave){
            no.direito = rotacaoDireita((no.direito));
            return rotacaoEsquerda(no);
        }

        return no;
    }




}

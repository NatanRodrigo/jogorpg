package items.Porcoes;

 class PorcaoInvisibilidade {
     private final String nome;
     private final int duracaoPorRound;



     public PorcaoInvisibilidade(String nome, int duracaoPorRound, int dano) {
         this.nome = "Porção De Invisibilidade";
         this.duracaoPorRound = duracaoPorRound;
     }


     public String getNome() {
         return nome;
     }


     public int getDuracaoPorRound() {
         return duracaoPorRound;
     }



}

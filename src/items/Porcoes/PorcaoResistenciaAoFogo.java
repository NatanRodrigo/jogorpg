package items.Porcoes;

 class PorcaoResistenciaAoFogo {
     private final String nome;
     private final int duracaoPorRound;
     private final int dano;


     public PorcaoResistenciaAoFogo(String nome, int duracaoPorRound, int dano) {
         this.nome = "Porção Resistencia Ao Fogo ";
         this.duracaoPorRound = duracaoPorRound;
         this.dano = dano;
     }


     public String getNome() {
         return nome;
     }


     public int getDuracaoPorRound() {
         return duracaoPorRound;
     }


     public int getDano() {
         return dano;
     }
}

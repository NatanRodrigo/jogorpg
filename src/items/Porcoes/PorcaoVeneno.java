package items.Porcoes;

 class PorcaoVeneno {
     private final String nome;
     private final int duracaoPorRound;
     private final int dano;


     public PorcaoVeneno(String nome, int duracaoPorRound, int dano) {
         this.nome = "Porção Veneno";
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

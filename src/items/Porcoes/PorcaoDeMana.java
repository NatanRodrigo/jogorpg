package items.Porcoes;

 class PorcaoDeMana {
     private final String nome;
     private final int duracaoPorRound;
     private final int dano;


     public PorcaoDeMana(String nome, int duracaoPorRound, int dano) {
         this.nome = "PorcaoDeMana";
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


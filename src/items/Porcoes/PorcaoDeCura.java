package items.Porcoes;
import java.util.Random;
 class PorcaoDeCura {
        private  String nome;
        private  int cura;

        public PorcaoDeCura() {
            this.nome = "Porção De Cura";
            Random random = new Random();
            this.cura = random.nextInt(50) + 1;

        }


}

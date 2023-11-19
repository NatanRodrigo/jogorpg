package Monstros;

import java.util.Random;

 class Banshee  {
        private String nome;
        private int pontosVida;
        private int pontosAtaqueFraco;
        private int pontosAtaqueForte;
        private int pontosAtaqueEspecial;


        public void BansheeInimigo() {
            this.nome = "Banshee";
            this.pontosVida = 60;
            this.pontosAtaqueFraco = 10;
            this.pontosAtaqueForte = 15;
            this.pontosAtaqueEspecial = 20;
        }

        public String getNome() {
            return nome;
        }


        public int getPontosVida() {
            return pontosVida;
        }


        public int realizarAtaqueFraco() {
            Random random = new Random();
            return pontosAtaqueFraco + random.nextInt(5);
        }


        public int realizarAtaqueForte() {
            Random random = new Random();
            return pontosAtaqueForte + random.nextInt(10);
        }


        public int realizarAtaqueEspecial() {
            Random random = new Random();
            return pontosAtaqueEspecial + random.nextInt(15);
        }


        public void receberDano(int dano) {
            pontosVida -= dano;
            if (pontosVida < 0) {
                pontosVida = 0;
            }
        }


        public boolean estaVivo() {
            return pontosVida > 0;
        }
    }



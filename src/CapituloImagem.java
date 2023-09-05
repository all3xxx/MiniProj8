import java.util.Scanner;

class CapituloImagem extends Capitulo {
    private String imagem;

    public CapituloImagem(String nome, String texto, String[] escolhas, Personagem personagem, int alteracaoEnergia, Scanner escaneador, String imagem) {
        super(nome, texto, escolhas, personagem, alteracaoEnergia, escaneador);
        this.imagem = imagem;
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("Imagem do capítulo:");
        System.out.println(imagem);
    }
}
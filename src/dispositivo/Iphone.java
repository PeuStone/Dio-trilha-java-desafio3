package dispositivo;

import funcoes.AparelhoTelefonico;
import funcoes.NavegadorInternet;
import funcoes.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {

    @Override
    public void ligar(String numero) {
        System.out.println("DISCANDO PARA O NUMERO " + numero);
    }

    @Override
    public void atender() {
        System.out.println("RECEBENDO LIGAÇÃO");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("INICIANDO CORREIO DE VOZ");
    }

    @Override
    public void exibirPagina() {
        System.out.println("EXIBINDO PAGINA DO NAVEGADOR");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("ADICIONANDO NOVA ABA");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("ATUALIZANDO PAGINA");
    }

    @Override
    public void tocar() {
        System.out.println("INICIANDO NA MUSICA");
    }

    @Override
    public void pausar() {
        System.out.println("PAUSANDO MUSICA");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("SELECIONOU A MUSICA " + musica);
    }
}
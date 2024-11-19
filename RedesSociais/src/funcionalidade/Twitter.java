package funcionalidade;

import funcionalidade.interfaces.Compartilhamento;

public class Twitter extends RedeSocial implements Compartilhamento {
    @Override
    public void postarFoto() {
        System.out.println("Postou foto no "+ getClass().getSimpleName());
    }

    @Override
    public void postarVideo() {
        System.out.println("Postou vídeo no "+ getClass().getSimpleName());
    }

    @Override
    public void postarComentario() {
        System.out.println("Postou comentário no "+ getClass().getSimpleName());
    }

    @Override
    public void compartilhar() {
        System.out.println("Usurário compartilhou uma postagem " + getClass().getSimpleName() + "!");
    }
}

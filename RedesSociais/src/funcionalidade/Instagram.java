package funcionalidade;

public class Instagram extends RedeSocial {
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
}

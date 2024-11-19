import exception.RedeSocialPointException;
import funcionalidade.*;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Facebook facebook = new Facebook();
        Instagram instagram = new Instagram();
        GooglePlus googlePlus = new GooglePlus();
        Twitter twitter = null;

        Set<RedeSocial> redeSociais = new HashSet<RedeSocial>();
        redeSociais.add(facebook);
        redeSociais.add(instagram);
        redeSociais.add(twitter);
        Usuario usuario = new Usuario(redeSociais);
        usuario.setNome("Ingrid");
        usuario.setEmail("ingrid@email.com");

        for (RedeSocial rede : usuario.getRedeSociais()) {
            try {
                usuario.getRedesUsuario(rede);
            } catch (RedeSocialPointException e){
                System.out.println("Usuário não possui conta nesta rede social!");
            }

        }
    }

}
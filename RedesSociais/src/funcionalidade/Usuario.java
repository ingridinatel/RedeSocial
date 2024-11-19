package funcionalidade;

import exception.RedeSocialPointException;
import funcionalidade.interfaces.*;

import java.util.Set;

public class Usuario {
    private String nome;
    private String email;
    private Set<RedeSocial> redeSociais;

    //construtor
    public Usuario(Set<RedeSocial> redesSociais) {
        this.setRedeSociais(redesSociais);
    }

    public void getRedesUsuario(RedeSocial rede) throws RedeSocialPointException {
        if (rede == null){
            throw new RedeSocialPointException("Usuário não possui conta nesta rede social!");
        } else {
            if (rede instanceof Facebook || rede instanceof GooglePlus) {
                rede.curtirPublicacao();
                ((Compartilhamento) rede).compartilhar();
                ((VideoConferencia) rede).fazStreaming();
            } else if (rede instanceof Twitter) {
                rede.postarVideo();
                rede.postarFoto();
                ((Twitter) rede).compartilhar();
            } else {
                rede.postarFoto();
                rede.postarVideo();
                rede.postarComentario();
            }
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Set<RedeSocial> getRedeSociais() {
        return redeSociais;
    }

    public void setRedeSociais(Set<RedeSocial> redeSociais) {
        this.redeSociais = redeSociais;
    }
}

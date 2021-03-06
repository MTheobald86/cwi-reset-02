package br.com.cwi.reset.exemploreset.Repository;

import br.com.cwi.reset.exemploreset.Domain.Usuario;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UsuarioRepository {

    static List<Usuario> usuarios = new ArrayList<>();

    public Usuario addUsuario(Usuario usuario){
        usuario.add(usuario);
    }

    public List<Usuario> getUsuarios(){
        return usuarios;
    }


}

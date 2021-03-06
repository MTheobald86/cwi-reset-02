package Service;

import br.com.cwi.reset.exemploreset.Domain.Usuario;
import br.com.cwi.reset.exemploreset.Excepition.BadRequestException;
import br.com.cwi.reset.exemploreset.Repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository repositorio;

    public List<Usuario> listarUsuario(){
        return repositorio.getUsuarios();
    }

    public Usuario adicionaUsuario (Usuario usuario){
        if (usuario == null){
            return BadRequestException;
        }
        return repositorio.addUsuario(usuario);
    }

}

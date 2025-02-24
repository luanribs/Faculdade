
import com.mycompany.model.dao.UsuarioDao;
import com.mycompany.model.domain.Perfil;
import com.mycompany.model.domain.Usuario;


public class UsuarioTeste{
public static void main(String[] args) {
    Usuario usuario = new Usuario(null, false, 0, "Luan", Perfil.ADMIN, "salve", null, "Luan");
    UsuarioDao usuarioDao = new UsuarioDao(null);
    String mensagem = UsuarioDao.salvar(usuario);
    System.out.println(mensagem);
}
}
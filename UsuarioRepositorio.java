package repositorios;

import entidades.Conta;
import entidades.Usuario;
import interfaces.IUsuario;
import java.util.ArrayList;

public class UsuarioRepositorio implements IUsuario{
	
	private ArrayList<Usuario> bdUsuarios;
	
	private UsuarioRepositorio(ArrayList<Usuario> bdUsuarios) {
		this.bdUsuarios = bdUsuarios;
	}
	

	@Override
	public Usuario ListarPorCpf(String cpf) {
		
		Usuario usuarioResult = null;
		for(int i =0; i<bdUsuarios.size();i++) {
			if(bdUsuarios.get(0).getCpf().equals(cpf))
				return bdUsuarios.get(0);				 
		}

		return null;
	}

	@Override
	public void Imprimir() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void InserirUSuario(Usuario usuario) {
		
		this.bdUsuarios.add(usuario);
		
	}

	@Override
	public void RemoverUsuario(Usuario usuario) {

		bdUsuarios.remove(usuario);
		
	}

	@Override
	public void AlterarUsuario(Usuario usuario) {

		
	}

}

package interfaces;

import entidades.Usuario;


public interface IUsuario {
	
	public Usuario ListarPorCpf(String cpf);
	public void Imprimir();
	public void InserirUSuario (Usuario user);
	public void RemoverUsuario(Usuario user);
	public void AlterarUsuario (Usuario user);
	
	

}

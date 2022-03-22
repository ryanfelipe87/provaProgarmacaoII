package interfaces;

import java.util.ArrayList;

import entidades.Conta;

public interface IConta {
	
	public void CriarConta(Conta conta);
	public void ExcluirConta(Conta conta);
	public void AlterarConta(Conta conta);
	public ArrayList<Conta> ListarContas(Conta conta);
	

}

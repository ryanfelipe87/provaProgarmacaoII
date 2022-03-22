package interfaces;

import java.util.ArrayList;

import entidades.Campanha;

public interface ICampanha {
	
	public void CriarCampanha(Campanha cp);
	public void DeletarCampanha(Campanha cp);
	public void AlterarCampanha (Campanha cp);
	public ArrayList<Campanha> ListarCampanhas(Campanha cp);
	

}

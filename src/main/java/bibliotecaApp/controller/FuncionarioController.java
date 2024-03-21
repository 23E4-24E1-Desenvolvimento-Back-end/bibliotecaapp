package bibliotecaApp.controller;

import java.util.ArrayList;
import java.util.Arrays;

import bibliotecaApp.model.domain.Funcionario;
import spark.Route;

public class FuncionarioController {

	public static Route obterLista = (req, res) -> {
		
		return new ArrayList<Funcionario>(				
					Arrays.asList(
							new Funcionario(),
							new Funcionario("Joao"),
							new Funcionario("Maria"),
							new Funcionario("Jose")
						)
				);
	};
	
	public static Route incluir = (req, res) -> {
		return "Inclus�o de funcion�rio";
	};
	
	public static Route excluir = (req, res) -> {
		
		Integer index = Integer.valueOf(req.params("id"));
		
		return "Exclus�o do funcion�rio " + index;
	};
	
	public static Route obter = (req, res) -> {
		
		Integer index = Integer.valueOf(req.params("id"));
		
		return "Obter o funcion�rio " + index;
	};
}

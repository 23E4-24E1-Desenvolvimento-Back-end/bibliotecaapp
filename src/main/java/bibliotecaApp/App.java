package bibliotecaApp;

import bibliotecaApp.controller.FuncionarioController;
import bibliotecaApp.controller.UsuarioController;
import spark.Spark;

public class App {

	public static void main(String[] args) {
		
		Spark.port(8080);
		
		Spark.get("/", (req, res) -> {return App.class.getResourceAsStream("/index.html");});

		//USU�RIO
		Spark.get("/usuario", new UsuarioController());
		
		//FUNCION�RIO
		Spark.get("/funcionario/lista", FuncionarioController.obterLista);
		Spark.post("/funcionario/incluir", FuncionarioController.incluir);
		Spark.delete("/funcionario/:id/excluir", FuncionarioController.excluir);
		Spark.get("/funcionario/:id", FuncionarioController.obter);
	}
}
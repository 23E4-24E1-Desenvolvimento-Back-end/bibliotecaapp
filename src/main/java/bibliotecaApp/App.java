package bibliotecaApp;

import bibliotecaApp.controller.UsuarioController;
import spark.Spark;

public class App {

	public static void main(String[] args) {
		
		Spark.port(8080);
		
		Spark.get("/", (req, res) -> {return App.class.getResourceAsStream("/index.html");});

		Spark.get("/usuario", new UsuarioController());
	}
}
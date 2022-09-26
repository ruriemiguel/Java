package triatleta;

public class TestaTriatleta {

	public static void main(String[] args)
	{
		Triatleta triatleta = new Triatleta("Kelvyn");
		
		triatleta.aquecer();
		triatleta.correrDeBicicleta();
		triatleta.correr();
		triatleta.nadar();
	}

}

package webservices;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public class GeradorParcela {
	@WebMethod
	public double gerarParcela(
			@WebParam (name="valorTotal") double valorTotal,
			@WebParam (name="quantidade") int quantidade){
		if(quantidade < 0){
			return 0;
		}
		double valorFinal = valorTotal * (1+(quantidade/100.0));
		return valorFinal/quantidade;
	}

}

package br.com.curso.jaxb;

import java.io.File;
import java.rmi.UnmarshalException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class TesteUmmarshal {

	public static void main(String[] args) throws JAXBException {
		JAXBContext context = JAXBContext.newInstance(Produto.class);
		Unmarshaller unmarshaller = context.createUnmarshaller();
		
		File arquivo = new File("camisa.xml");
		Produto produto = (Produto) unmarshaller.unmarshal(arquivo);
	}
}

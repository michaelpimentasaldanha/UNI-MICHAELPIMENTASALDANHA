package br.com.curso.jaxb;

import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class TesteUmmarshal {

	public static void main(String[] args) throws JAXBException {
		JAXBContext context = JAXBContext.newInstance(Produto.class);
		Unmarshaller unmarshaller = context.createUnmarshaller();
		
		File arquivo = new File("camisa.xml");
		Produto produto = (Produto) unmarshaller.unmarshal(arquivo);
	//	System.out.println(produto.getNome()+" - "+produto.getCategoria().getNome());
		System.out.println("Nome:"+produto.getNome()+"\nPreço: "+produto.getPreco()+"\nCategoria: "+produto.getCategoria().getNome());
	}
}

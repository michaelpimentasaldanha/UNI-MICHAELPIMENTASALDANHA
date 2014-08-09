package br.com.curso.jaxb;

import java.io.IOException;

import javax.swing.text.AbstractDocument.Content;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.SchemaOutputResolver;
import javax.xml.transform.Result;

public class TesteGeraSchema {

	public static void main(String[] args) throws JAXBException, IOException {
		JAXBContext context = JAXBContext.newInstance(Produto.class);
		context.generateSchema(new SchemaOutputResolver() {
			
			@Override
			public Result createOutput(String namespaceUri, String suggestedFileName)
					throws IOException {
				
				return null;
			}
		});
	}

}

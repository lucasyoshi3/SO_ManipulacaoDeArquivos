package controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArquivosController implements IArquivosController {
	
	public ArquivosController() {
		super();
	}
	
	@Override
	public void readFile(String path, String nome) throws IOException {
		// TODO Auto-generated method stub
		File arq=new File(path,nome);
		if(arq.exists() && arq.isFile()) {
			FileInputStream fluxo=new FileInputStream(arq);
			InputStreamReader leitor=new InputStreamReader(fluxo);
			BufferedReader buffer=new BufferedReader(leitor);
			String linha =buffer.readLine();
			String[] fruit=new String[4];
			while(linha!=null) {
				fruit = linha.split(",");
				if(fruit[2].equals("Fruits")) {
					System.out.print(fruit[0]+"\t");
					System.out.print(fruit[1]+"\t");
					System.out.println(fruit[3]);
				}
				linha=buffer.readLine();
			}
			buffer.close();
			fluxo.close();
			leitor.close();
		}else {
			throw new IOException("Arquivo Invalido!");
		}
	}
}
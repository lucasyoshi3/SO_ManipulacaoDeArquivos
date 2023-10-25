package view;

import java.io.IOException;

import controller.ArquivosController;
import controller.IArquivosController;

public class Main {
	public static void main(String[] args) {
		
		IArquivosController tabelaCont=new ArquivosController();
		String path="C:\\Windows\\TEMP";
		String nome="generic_food.csv";
		try {
			tabelaCont.readFile(path, nome);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

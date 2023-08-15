package com.iphone;

public class Iphone {
	
	public static void main(String args[]) {
		Musica musica = new Musica();
		musica.play();
		Internet internet = new Internet();
		internet.updatePage();
		Telefone telefone = new Telefone();
		telefone.toConnect();
	}

}

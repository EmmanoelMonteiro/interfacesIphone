package com.iphone;

public class Musica implements Music {
	
	@Override
	public void play() {
		System.out.println("Tocando musica");
	}

	@Override
	public void pause() {
		System.out.println("Prando musica");
	}

	@Override
	public void selectMusic() {
		System.out.println("Selecionado musica");
	}
	

}

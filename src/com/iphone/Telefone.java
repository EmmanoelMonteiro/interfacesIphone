package com.iphone;


public class Telefone implements Phone {

	@Override
	public void toConnect() {
		System.out.println("Ligando ...");
	}

	@Override
	public void toMeet() {
		System.out.println("Atendendo ...");
	}

	@Override
	public void voiceMail() {
		System.out.println("Ouvindo correio de voz ...");
	}
	
	
}

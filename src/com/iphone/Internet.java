package com.iphone;

public class Internet implements Browser {

	@Override
	public void viewPage() {
		System.out.println("Ver p�gina");
	}

	@Override
	public void newTab() {
		System.out.println("Nova aba");
	}

	@Override
	public void updatePage() {
		System.out.println("Atualizar p�gina");
	}

}

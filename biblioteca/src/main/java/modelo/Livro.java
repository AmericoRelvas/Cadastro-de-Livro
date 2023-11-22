package modelo;

public class Livro {
	//atributos
	private String _nome;
	private String _autor;
	private int _paginas; 
	
	//construtores: personalizado e padrão
	public Livro(String nome, String autor, int paginas) {
		super();
		this._nome = nome;
		this._autor = autor;
		this._paginas = paginas;
	}
	
	public Livro() {
	 //construtor padrão
	}
	
	//métodos get e set
	public String get_nome() {
		return _nome;
	}

	public void set_nome(String _nome) {
		this._nome = _nome;
	}

	public String get_autor() {
		return _autor;
	}

	public void set_autor(String _autor) {
		this._autor = _autor;
	}

	public int get_paginas() {
		return _paginas;
	}

	public void set_paginas(int _paginas) {
		this._paginas = _paginas;
	}
}

package controle;

import modelo.Livro;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "LivroMB")
@RequestScoped
public class LivroMB{
	private Livro n_livro = new Livro();
	
	public LivroMB(){
		//construtor da classe LivroMB
	}

	public String get_nome() {
		return n_livro.get_nome();
	}

	public void set_nome(String _nome) {
		n_livro.set_nome(_nome);
	}

	public String get_autor() {
		return n_livro.get_autor();
	}

	public void set_autor(String _autor) {
		n_livro.set_autor(_autor);
	}

	public int get_paginas() {
		return n_livro.get_paginas();
	}

	public void set_paginas(int _paginas) {
		n_livro.set_paginas(_paginas);
	}
}
